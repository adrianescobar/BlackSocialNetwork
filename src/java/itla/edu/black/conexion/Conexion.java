
package itla.edu.black.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    //referencia conexion

    private static Connection con;
    static Conexion intancia = null;
    
    private Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/black", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion!");
        }
    }
    
    public synchronized  static Conexion getInstance(){
        if(intancia==null){
            intancia =  new Conexion();
        }
        return intancia;
    }
    
    public Connection getConexion(){
        return con;
    }
}
