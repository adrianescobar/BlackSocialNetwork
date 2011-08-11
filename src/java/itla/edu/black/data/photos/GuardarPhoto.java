
package itla.edu.black.data.photos;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class GuardarPhoto {
    
    private Conexion con;
    private PreparedStatement consulta1 = null;
    public GuardarPhoto(){
        try {
            this.con = Conexion.getInstance();
            consulta1 = con.getConexion().prepareStatement("select id_usuario from usuario where email = ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Guardando foto");
        }
    }
    
    public String guardarPhoto(String email){
    
        String dir = "esta en blanco";
        String nombreQ = "";
        String id = "";
    
        try{
            Statement query = con.getConexion().createStatement();
            consulta1.setString(1, email);
            ResultSet nombre = consulta1.executeQuery();
            
            while(nombre.next()){
                nombreQ=nombre.getString(1);
            }
            ResultSet photo_id = query.executeQuery("select (id_photo)+1 from photos order by id_photo desc limit 1 ");
            while(photo_id.next()){
                id = photo_id.getString(1);
            }
            dir = nombreQ+"-"+id;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error Guardando foto");
        }
        return dir;
    }
}
