<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" import="itla.edu.black.conexion.Conexion"%>
<%@page session="true" import="itla.edu.black.nombre.ObtenerNombre"%>
<%@page session="true" import="itla.edu.black.login.Login"%>

<%
    ObtenerNombre nombre = new ObtenerNombre();
    
    Login log = new Login();
    
    int resultados = log.loginSession(request.getParameter("email"),request.getParameter("pass"));
    System.out.println(resultados);
    out.println(resultados);
    
    if(resultados>0){
    
        HttpSession sesion=request.getSession();

        sesion.setAttribute("usuario",request.getParameter("email"));
        sesion.setAttribute("userName",nombre.getNombre(request.getParameter("email"))[0]);
        sesion.setAttribute("USER_PHOTO",nombre.getNombre(request.getParameter("email"))[1]);
        sesion.setAttribute("con",Conexion.getInstance().getConexion());

        response.sendRedirect("home.jsp");
    }
    
%>