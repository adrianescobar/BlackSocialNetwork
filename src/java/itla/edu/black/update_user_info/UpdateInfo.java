package itla.edu.black.update_user_info;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UpdateInfo {
    
    private Conexion con;
    private PreparedStatement update = null;
    public UpdateInfo(){
        try {
            this.con = Conexion.getInstance();
            this.update = con.getConexion().prepareStatement("update usuario set nombre = ?, apellidos = ?, clave = ?, sexo = ?, estado = ? where email = ? and clave = ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la informacion");
        }
    }
    
    public int saveInfo(String nombre,String apellido,String oldpass,String newpass,String estado,String sexo,String mail){
        int ret = 0;
        try{
            update.setString(1, nombre);
            update.setString(2, apellido);
            update.setString(3, newpass);
            update.setString(4, sexo);
            update.setString(5, estado);
            update.setString(6, mail);
            update.setString(7, oldpass);
            ret = update.executeUpdate();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al actualizar la informacion");
        }
        
        return ret;
    
    }
    
    
}
