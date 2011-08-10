
package itla.edu.black.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    //referencia conexion
    static Connection con;
    static Conexion instancia = null;
    
<<<<<<< HEAD
    public Conexion(){
        
=======
    private Conexion(){
>>>>>>> 1346e6a3f10e0575cc42a5dbeed5a697d2269d43
        try{
            Class.forName("com.mysql.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/black", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion!");
        }
    }
    public synchronized  static Connection getConexion(){
         if(instancia==null){
            instancia = new Conexion();
        }
        return con;
    }
}
