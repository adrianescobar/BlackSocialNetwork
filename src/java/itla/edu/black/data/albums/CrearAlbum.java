
package itla.edu.black.data.albums;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class CrearAlbum {
    
    private Conexion con = null;
    private PreparedStatement insert = null;
    public CrearAlbum(){
        try {
            this.con = Conexion.getInstance();
            insert = con.getConexion().prepareStatement("insert into albums(nombre_album,id_usuario) values(?,(select id_usuario from usuario where email = ?));");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en CrearAlbum");
        }
    }
    
    
    public String crearAlbum(String nombre,String email){
        String resultado = "";
        try{
            insert.setString(1, nombre);
            insert.setString(2, email);
            int consulta = insert.executeUpdate();
            resultado +=consulta+"";
        }catch(Exception e){
            resultado += ""+e;
            JOptionPane.showMessageDialog(null, resultado);
        }
        return resultado;
    }
}
