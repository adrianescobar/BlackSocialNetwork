package itla.edu.black.data.photos;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GuardarPhotosDB {
    
    private Conexion con = null;
    private PreparedStatement consulta, insert = null;
    
    public GuardarPhotosDB(){
        try {
            this.con = Conexion.getInstance();
            consulta = con.getConexion().prepareStatement("select id_album from albums where id_usuario = (select id_usuario from usuario where email = ?) and nombre_album = 'Photos Perfil'");
            insert = con.getConexion().prepareStatement("insert into photos(id_album,id_usuario,url) values(?,(select id_usuario from usuario where email = ?),?)");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Guardando photos en bd 1"+ex.getMessage());
        }
    }
    
    public int guardar(String id,String email,String url){
        int ret = 0;
        try{
            if(id==null){
                consulta.setString(1, email);
                ResultSet idResultset = consulta.executeQuery();
                while(idResultset.next()){
                    id = idResultset.getString(1);
                }
            }
            int id2 = Integer.parseInt(id);
            insert.setInt(1, id2);
            insert.setString(2, email);
            insert.setString(3, url);
            JOptionPane.showMessageDialog(null, insert.toString());
            ret = insert.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Guardando photos en bd 2"+e.getMessage());
        }
        return ret;
    }
    
}
