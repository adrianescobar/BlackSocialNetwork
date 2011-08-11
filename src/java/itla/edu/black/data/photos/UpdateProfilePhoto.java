
package itla.edu.black.data.photos;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateProfilePhoto {
    
    private Conexion con;
    private PreparedStatement update = null;
    public UpdateProfilePhoto(){
        try {
            this.con = Conexion.getInstance();
            update = con.getConexion().prepareStatement("update usuario set USER_PHOTO = ? where email = ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Actualizando la foto de perfil 1");
        }
    }
    
    public int updatePhoto(String email,String url){
        int ret = 0;
        try{
            update.setString(1, url);
            update.setString(2, email);
            ret = update.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Actualizando la foto de perfil 2");
        }
        return ret;
    }
    
}
