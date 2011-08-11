<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="itla.edu.black.feeds.NewFeed"%>
<%@page session="true" import="itla.edu.black.conexion.Conexion"%>
<%

    String funciono = "";

    NewFeed feed =  new NewFeed();
    
    funciono = feed.newFeed(request.getParameter("id"),request.getParameter("feed"));
    
    out.println(funciono);

%>
