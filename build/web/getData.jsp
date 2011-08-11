<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="itla.edu.black.data.UserData"%>
<%@page import="itla.edu.black.conexion.Conexion"%>

<%
    UserData data = new UserData();
    
    String[] userData = data.getUserData(request.getParameter("email"));
    
    out.println(userData[0]+userData[1]+userData[2]);
%>
