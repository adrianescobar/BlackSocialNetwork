
package itla.edu.black.login;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Login {
    
    private Conexion con;
    private PreparedStatement consulta;
    
    public Login(){
        try {
            this.con = Conexion.getInstance();
            consulta = con.getConexion().prepareStatement("select * from usuario where email = ? and clave = ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en Login 1");
        }
    }
    
    public int loginSession(String mail, String pass){
        int logT = 0;
        try{
            consulta.setString(1, mail);
            consulta.setString(2, pass);
            ResultSet logResultado = consulta.executeQuery();        
            while(logResultado.next()){
                logT++;
            }
            JOptionPane.showMessageDialog(null, logT);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en Login 2");
        }
        return logT;
    }
    
}
