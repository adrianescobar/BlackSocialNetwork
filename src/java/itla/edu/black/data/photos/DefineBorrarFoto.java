/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itla.edu.black.data.photos;

import itla.edu.black.conexion.Conexion;
import itla.edu.black.data.photos.interfaz.InterfazBorrarFoto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dragon
 */
public class DefineBorrarFoto implements InterfazBorrarFoto{
    private Conexion con;
    private PreparedStatement delete = null;
    
    public DefineBorrarFoto(){
        try {
            con = Conexion.getInstance();
            delete = con.getConexion().prepareStatement("delete from photos where ID_PHOTO = ?;");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Eror borrando foto de la bd 2");
        }
    }

    @Override
    public int borrarPhoto(String id_1) {
        int ret = 0;
        try {
            int id_2 = Integer.parseInt(id_1);
            delete.setInt(1, id_2);
            ret = delete.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Eror borrando foto de la bd 2");
        }
        return ret;
    }

    
}
