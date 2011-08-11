package itla.edu.black.data;

import itla.edu.black.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserData {
    
    private Conexion con;
    
    public UserData(){
        this.con = Conexion.getInstance();
    }
    
    public String[] getUserData(String email){
    
        String[] data = {"","",""};
        
        try{
        
            Statement getData = con.getConexion().createStatement();
            
            ResultSet query = getData.executeQuery("select email,user_photo,nombre from usuario where email = '"+email+"' ");
            
            while(query.next()){
            
            data[0]=query.getString(1);
            data[1]=query.getString(2);
            data[2]=query.getString(3);
            }
        }catch(Exception e){
            
            data[0]=""+e;
        }
        
        return data;
        
    }
    
    
    public String[] getUserData(String email,int algo){
    
        String[] data = {"","","","",""};
        
        try{
        
            Statement getData = con.getConexion().createStatement();
            
            ResultSet query = getData.executeQuery("select email,user_photo,nombre,sexo,estado from usuario where email = '"+email+"' ");
            
            while(query.next()){
            
            data[0]=query.getString(1);
            data[1]=query.getString(2);
            data[2]=query.getString(3);
            data[2]=query.getString(4);
            data[2]=query.getString(5);
            }
        }catch(Exception e){
            
            data[0]=""+e;
        }
        
        return data;
        
    }
}
