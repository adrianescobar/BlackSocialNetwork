<%@page import="java.sql.Connection"%>
<%@page import="itla.edu.black.data.albums.CrearAlbum"%>
<%@page import="itla.edu.black.conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    CrearAlbum albun = new CrearAlbum();
    
    String resultado = albun.crearAlbum(request.getParameter("nombre"), request.getParameter("email"));

    out.println(request.getParameter("email")+request.getParameter("nombre")+resultado);
    
    response.sendRedirect("Photos.jsp?user="+request.getParameter("email")+"");

%>

