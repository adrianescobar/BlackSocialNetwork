package itla.edu.black.comentario;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddComentario {
    
    private Conexion con;
    private PreparedStatement insert = null;
    
    public AddComentario(){
        this.con = Conexion.getInstance();
        try {
            this.insert = con.getConexion().prepareStatement("insert into comentario_estado(id_estado,id_usuario,comentario) values(?,(select id_usuario from usuario where email = ?), ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar comentario");
        }
    }
     
    public int addComentario(String id,String comentario,String usuario){
        int resultado = 0;
        try{
            insert.setString(1, id);
            insert.setString(2, comentario);
            insert.setString(3, usuario);
            resultado = insert.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al agregar comentario");
        }
        return resultado;
    }
}
