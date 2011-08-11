function showDivs(){
    
    divPadre = document.getElementById("upload_padre");
    divHijo = document.getElementById("upload");
    
    if(divPadre.style.display=="block"){
    
        divPadre.style.display="none";
        divHijo.style.display="none";
    
    }else{
        
        divPadre.style.display="block";
        divHijo.style.display="block";
        
    }
}

function imgCheck(value){
    
    value = value.split(".");
    value = value[value.length-1];
    value = value.toLowerCase();
    
    if(value=="png" || value=="jpg" || value=="gif"){
        
        document.formulario.extencion.value=value;
        
        alert(document.formulario.extencion.value);
        return true;
        
    }else{
        
        alert("Formato Desconosido");
        return false;
        
    }
    
}

function borrarImagenDB(idNombre){
    
    idNombre = idNombre.split("/")[1];
    
    borrar = confirm("Seguro de Borrar?");
    
    if(borrar){
        
        alert(id1 = idNombre.split("-")[0]);
        alert(id2 = idNombre.split("-")[1]);
        alert(id3 =(idNombre.split("-")[2]).split(".")[0]);
        
        
        window.location="borrarPhoto.jsp?id_1="+id1+"&id_2="+id2+"&id_3="+id3;
        
        
    }
    
}

