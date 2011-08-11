<%@page import="java.sql.Connection"%>
<%@page import="itla.edu.black.comentario.AddComentario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="itla.edu.black.conexion.Conexion"%>

<%
    //Conexion con = new Conexion();
    
    AddComentario add = new AddComentario();
    
    out.println(add.addComentario(request.getParameter("id"),request.getParameter("comentario"),request.getParameter("usuario")));
    
%>
