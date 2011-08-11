/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itla.edu.black.data.photos;

import itla.edu.black.conexion.Conexion;
import itla.edu.black.data.photos.interfaz.InterfazBorrarFoto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            delete = con.getConexion().prepareStatement("");
        } catch (SQLException ex) {
            Logger.getLogger(DefineBorrarFoto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int borrarPhoto(String id_1) {
        
        return 0;
    }

    @Override
    public int borrarPhoto(String id_1, String id_2, String id_3) {
        
        return 0;
    }
    
}
