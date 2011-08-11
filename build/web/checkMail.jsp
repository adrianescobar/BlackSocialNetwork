<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="itla.edu.black.conexion.Conexion"%>
<%@page import="itla.edu.black.mail.ValidarMail"%>
<%
    
    ValidarMail mail = new ValidarMail();
    
    int disponivilidad = mail.checkMail(request.getParameter("email"));
    
    out.println(disponivilidad);

%>
