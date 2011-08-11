
package itla.edu.black.albunes;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GetAlbuns {
    
    private Conexion con;
    private PreparedStatement consulta = null;
    
    public GetAlbuns(){
        try {
            this.con = Conexion.getInstance();
            consulta = con.getConexion().prepareStatement("select * from albums where id_usuario = (select id_usuario from usuario where email = ?)");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error obteniendo albums");
        }
    }
    
    
    public ArrayList getAlbuns(String email){
        ArrayList<String[]> albunes = new ArrayList();
        
        try{
            consulta.setString(1, email);
            ResultSet result = consulta.executeQuery();
            while(result.next()){
            
                String[] datos = {"","",""};
                
                datos[0] = result.getString(1);
                datos[1] = result.getString(2);
                datos[2] = result.getString(3);
                albunes.add(datos);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error obteniendo albums");
        }
        return albunes;
    }
    
}
