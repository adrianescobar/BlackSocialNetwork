package itla.edu.black.registrarusuario;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registrar {
    
    private Conexion con;
    private PreparedStatement insert = null;
    
    public Registrar(){
        try {
            this.con = Conexion.getInstance();
            this.insert = con.getConexion().prepareStatement("insert into usuario(Nombre,Apellidos,clave,Email) values(?,?,?,?);");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
    }
    
    public int registrar(String nombre, String apellido,String clave,String mail){
        int p = 0;
        try{
            insert.setString(1, nombre);
            insert.setString(2, apellido);
            insert.setString(3, clave);
            insert.setString(4, mail);
            p = insert.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
        return p;
   }
    
    
}
