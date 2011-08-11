package itla.edu.black.feeds;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class NewFeed {
    
    private Conexion con;
    private PreparedStatement insert = null;
    
    public NewFeed(){
        try {
            this.con = Conexion.getInstance();
            insert = con.getConexion().prepareStatement("insert into estados(id_usuario,estado,fecha) values((select id_usuario from usuario where email = ?),?,CURDATE())");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en new feed");
        }
    }
    
    public int newFeed(String id, String feed){
        int error = 0;
        try{
            insert.setString(1, id);
            insert.setString(2, feed);
            error = insert.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en new feed");
        }
        return error;
    }
}
