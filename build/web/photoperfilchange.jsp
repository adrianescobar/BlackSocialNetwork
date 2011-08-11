<%@page import="itla.edu.black.data.photos.UpdateProfilePhoto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="itla.edu.black.data.photos.GuardarPhotosDB"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItemFactory"%>
<%@page import="itla.edu.black.data.photos.GuardarPhoto"%>
<%@page import="itla.edu.black.conexion.Conexion"%>
<%


    GuardarPhoto photoStorage = new GuardarPhoto();
    
    GuardarPhotosDB dbPhotoSave = new GuardarPhotosDB();
    
    UpdateProfilePhoto update = new UpdateProfilePhoto();
    
    
    String nombre = photoStorage.guardarPhoto(request.getParameter("email"))+"-Perfil";

    FileItemFactory factory = new DiskFileItemFactory();
    
    ServletFileUpload upload = new ServletFileUpload(factory);

        List items = upload.parseRequest(request);

        for (Object item : items) {

           FileItem uploaded = (FileItem) item;

               if (!uploaded.isFormField()) {

               String[] nameFile = (uploaded.getName()).split("\\.");
               String ext = nameFile[nameFile.length-1];

               String file ="";
               
               file= application.getRealPath("/")+"data-photos\\";
               
               out.println(file+nombre+"."+ext);
               
                  File fichero = new File(file+nombre+"."+ext);
                  
                  uploaded.write(fichero);

                  int resultado = dbPhotoSave.guardar(null,request.getParameter("email"),"data-photos/"+nombre+"."+ext);
                 
                  
                  update.updatePhoto(request.getParameter("email"), "data-photos/"+nombre+"."+ext);
                  
                  response.sendRedirect("Photos.jsp?id="+request.getParameter("id")+"&user="+request.getParameter("email") +"");

               } else {

               }
           
           }

%>
