/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itla.edu.black.nombre;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ObtenerNombre {
    
    private Conexion con;
    private PreparedStatement consulta;
    
    public ObtenerNombre(){
        try {
            this.con = Conexion.getInstance();
            consulta = con.getConexion().prepareStatement("select nombre,USER_PHOTO from usuario where email = ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Obteniendo nombre");
        }
    }
    public String[] getNombre(String email){
        String[] nombreUsuario = {"",""};
        try{
            consulta.setString(1, email);
            ResultSet resultadoNombre = consulta.executeQuery();
            while(resultadoNombre.next()){
               nombreUsuario[0] = resultadoNombre.getString("nombre");
               nombreUsuario[1] = resultadoNombre.getString("USER_PHOTO");
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Obteniendo nombre");
        }
        return nombreUsuario;
    }
}
