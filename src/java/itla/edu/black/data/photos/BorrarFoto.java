/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itla.edu.black.data.photos;

import itla.edu.black.data.photos.interfaz.InterfazBorrarFoto;

/**
 *
 * @author Dragon
 */
public class BorrarFoto {
    private InterfazBorrarFoto ibf;
    
    private BorrarFoto(){
        
    }
    public BorrarFoto(InterfazBorrarFoto ibf){
        this.ibf = ibf;
    }
    
    public int BorrarFoto(String id_1){
       int ret = ibf.borrarPhoto(id_1);
       return ret;
    }
}
