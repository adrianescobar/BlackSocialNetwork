
package itla.edu.black.photos;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GetPhotos {
    
    private Conexion con;
    private PreparedStatement consulta = null;
    
    public GetPhotos(){
        try {
            this.con = Conexion.getInstance();
            consulta = con.getConexion().prepareStatement("select url,id_photo from photos where id_album = ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Obteniendo foto");
        }
    }
    
    public ArrayList getPhotos(String id_album){
    
        ArrayList photos = new ArrayList();
        
        try{
            consulta.setString(1, id_album);
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next()){
            
                String[] photo = {"",""};
                
                photo[0] = resultado.getString(1);
                photo[1] = resultado.getString(2);
                
                photos.add(photo);
            
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Obteniendo foto");
        }
        return photos;
    }
}
