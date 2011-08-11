
package itla.edu.black.comentarios;


import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ShowComentario {
    
    private Conexion con;
    private PreparedStatement consulta = null;
    public ShowComentario(){
        try {
            this.con = Conexion.getInstance();
            this.consulta = con.getConexion().prepareStatement("select u.user_photo,u.email,c.comentario from usuario u join comentario_estado c where id_estado =  ? and u.id_usuario = c.id_usuario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Mostrando comentarios");
        }
    }
    
     public ArrayList showComentario(String id_estado){
        ArrayList<String[]> resultados = new ArrayList();
        try{
            consulta.setString(1, id_estado);
            ResultSet resul = consulta.executeQuery();
            while(resul.next()){
                String[] filas = {"","",""};
                filas[0] = resul.getString(1);
                filas[1] = resul.getString(2);
                filas[2] = resul.getString(3);
                resultados.add(filas);
            }
        }catch(Exception e){}
        return resultados;
    }
}
