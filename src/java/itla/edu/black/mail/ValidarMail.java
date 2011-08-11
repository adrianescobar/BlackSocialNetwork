package itla.edu.black.mail;

import itla.edu.black.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ValidarMail {
    
    private Conexion con;
    private PreparedStatement consulta = null; 
    
    public ValidarMail(){
        try {
            this.con = Conexion.getInstance();
            this.consulta = con.getConexion().prepareStatement("select email from usuario where email = ?");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la validacion de Mail");
        }
    
    }
    public int checkMail(String email){
        int filas = 0;
        try{
            consulta.setString(1, email);
            ResultSet resultado = consulta.executeQuery();
            if(resultado.next()){
                filas = resultado.getRow();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la validacion de Mail");
        }
        return filas;
    }
}
