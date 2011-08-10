
package itla.edu.black.conexion;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    //referencia conexion
    static Connection con;
    static Conexion clase;
    
    public Conexion(){
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");   
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/black", "root", "");
        
        }catch(Exception e){
        
        }
    
    }
    
    public static Connection getConexion(){
    
        if(clase==null){
        
            clase = new Conexion();
        
        }
        
        return con;
    
    }
    
    
}
