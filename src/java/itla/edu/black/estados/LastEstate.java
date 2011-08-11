package itla.edu.black.estados;

import itla.edu.black.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LastEstate {
    
    private Conexion con;
    private PreparedStatement consulta = null;
    public LastEstate(){
        try {
            this.con = Conexion.getInstance();
            this.consulta = con.getConexion().prepareStatement("select estado,id_estado from estados where id_usuario = (select id_usuario from usuario where email = ?) order by id_estado desc limit ?");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error recuperando estados");
        }
    }
    
    
    public ArrayList<String[]> lastEstate(String id,int elementos){
        ArrayList<String[]> resultado = new ArrayList();
        try{
            consulta.setString(1, id);
            consulta.setInt(2, elementos);
            ResultSet resultadoUltimo = consulta.executeQuery();
            while(resultadoUltimo.next()){
                String resultadoString[]={resultadoUltimo.getString("estado"),resultadoUltimo.getString("id_estado")};
                resultado.add(resultadoString);
            }    
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error recuperando estados");
        }
        return resultado;
    }
}
