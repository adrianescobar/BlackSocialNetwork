<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="itla.edu.black.conexion.Conexion" %> 
<%@page import="itla.edu.black.registrarusuario.Registrar" %> 

<%
    
    Registrar registro = new Registrar();
    
   int respuesta = registro.registrar(request.getParameter("nombre"),
                                request.getParameter("apellido"),
                                request.getParameter("clave"),
                                request.getParameter("email"));
   out.println(respuesta);
   
%>