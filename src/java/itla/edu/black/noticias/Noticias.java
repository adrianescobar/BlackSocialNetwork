package itla.edu.black.noticias;

import itla.edu.black.conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Noticias {
    
    private Conexion con;
    private Statement noticias = null;
    public Noticias(){
        try {
            this.con = Conexion.getInstance();
            this.noticias = con.getConexion().createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error consultado noticias");
        }
    }
    
    public ArrayList news(){
        ArrayList resultado = new ArrayList();
        String query = "select email,nombre from usuario ";
        try{
            ResultSet result = noticias.executeQuery("select email,nombre,user_photo,id_usuario from usuario ");
            while(result.next()){
            
                String[] rows = {"","","",""};
                rows[0] = result.getString(1);
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);
                rows[3] = result.getString(4);
                
                resultado.add(rows);   
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error consultado noticias");
        }
        return resultado;
    }
    
}
