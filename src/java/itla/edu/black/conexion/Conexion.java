
package itla.edu.black.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    //referencia conexion
<<<<<<< HEAD
    static Connection con;
    static Conexion instancia = null;
    
    private Conexion(){

=======
   private static Connection con;
   private static Conexion instancia = null;
   private Conexion(){
>>>>>>> 65c77532a9fb311c1d95bdc1c13c8a18f014dc0c
        try{
            Class.forName("com.mysql.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/black", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion!");
        }
    }
    public synchronized  static Conexion getConexion(){
         if(instancia==null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
