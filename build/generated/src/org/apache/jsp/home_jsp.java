package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import itla.edu.black.data.UserData;
import itla.edu.black.estados.LastEstate;
import java.sql.Connection;
import java.util.ArrayList;
import itla.edu.black.conexion.Conexion;
import itla.edu.black.comentarios.ShowComentario;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/homeFunctions.js\"></script>\r\n");
      out.write("        <link href=\"css/preset_css.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/home_Style.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        \r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            \r\n");
      out.write("            function logout(){\r\n");
      out.write("                \r\n");
      out.write("                log = confirm(\"Cerrar Sesion?\");\r\n");
      out.write("                \r\n");
      out.write("                if(log){\r\n");
      out.write("                    \r\n");
      out.write("                    window.location = \"logout.jsp\";\r\n");
      out.write("                    \r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"unshowDiv();ocultarComentario()\">\r\n");
      out.write("        \r\n");
      out.write("        ");


        HttpSession sesion=request.getSession(false);
			
        if(sesion.getAttribute("usuario")==null){

                response.sendRedirect("index.jsp");

        }
        
        Connection con =Conexion.getConexion(); 
        
        UserData data = new UserData(con);

            String[] userData = data.getUserData((String)session.getAttribute("usuario"));

        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div id=\"page\">\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"body\">\r\n");
      out.write("                \r\n");
      out.write("                <a id=\"logoutId\" href=\"#\" onclick=\"logout()\">");
      out.print( session.getAttribute("userName"));
      out.write(" LogOut</a>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div id=\"photo_perfil\">\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"Photos.jsp?user=");
      out.print(userData[0]);
      out.write("\">\r\n");
      out.write("                        \r\n");
      out.write("                        <img src=\"");
      out.print(userData[1]);
      out.write(" \" width=\"90%\">\r\n");
      out.write("                        \r\n");
      out.write("                    </a>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"nuevo\">\r\n");
      out.write("                    \r\n");
      out.write("                    <form onsubmit=\"return false\" name=\"feedForm\">\r\n");
      out.write("                        \r\n");
      out.write("                        <textarea rows=\"3\" cols=\"57\" id=\"feed\" name=\"textArea\" maxlength=\"80\" onkeyup=\"contadora()\"></textarea><br>\r\n");
      out.write("                        <label id=\"contador\">80</label>\r\n");
      out.write("                               <button onclick=\"newFeed('");
      out.print( session.getAttribute("usuario"));
      out.write("',document.feedForm.textArea.value);document.feedForm.reset()\">Publicar</button>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"estado\">\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                    
                        
                        
                        LastEstate last = new LastEstate(con);
                        
                        ArrayList<String[]> ultimoEstado = last.lastEstate((String)session.getAttribute("usuario"),1);
                        
                        try{
                            
                            out.println(ultimoEstado.get(0)[0]);
                        //out.println(ultimoEstado.get(0)[0].toString());
                                               }catch(Exception e){}
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <!------------------------------------------------------------------------->\r\n");
      out.write("                <!---Menu------------------------------------------------------------------>\r\n");
      out.write("                <div id=\"menu\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"javascript:void()\"><div id=\"\" class=\"item\" onclick=\"showMenu('inicio');news()\">Inicio</div></a>\r\n");
      out.write("                    <a href=\"javascript:void()\"><div id=\"\" class=\"item\" onclick=\"unshowDiv()\">Perfil</div></a>\r\n");
      out.write("                    <a href=\"javascript:void()\"><div id=\"\" class=\"item\" onclick=\"showMenu('divAmigos')\">Informacion</div></a>\r\n");
      out.write("                    <a href=\"Photos.jsp?user=");
      out.print( session.getAttribute("usuario"));
      out.write(" \"><div id=\"\" class=\"item\">Photos</div></a>\r\n");
      out.write("                    <a href=\"javascript:void()\"><div id=\"\" class=\"item\" onclick=\"showMenu('configurar')\">Confirgurar</div></a>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"cuerpo\">\r\n");
      out.write("                \r\n");
      out.write("                        <!------------Info--------------------->\r\n");
      out.write("                        <div id=\"divAmigos\" name=\"elementos\" class=\"blokes\" align=\"center\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
 
                            
                            
                                String[] userDataFull = data.getUserData((String)session.getAttribute("usuario"),1);
                            


                                
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                <table border=\"3\" width=\"300px\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr >\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td colspan=\"2\"><img src=\"");
      out.print(userDataFull[1]);
      out.write("\" width=\"200px;\" heigth=\"150px\"></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td>");
      out.print(userDataFull[0]);
      out.write("</td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td>");
      out.print(userDataFull[2]);
      out.write("</td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td>");
      out.print(userDataFull[3]);
      out.write("</td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td>");
      out.print(userDataFull[4]);
      out.write("</td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                </table>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!------------Muro--------------------->\r\n");
      out.write("                        <div id=\"muro\" name=\"elementos\" class=\"blokes\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
 
                            
                                ShowComentario show = new ShowComentario(con);
                            
                                ArrayList<String[]> estados = last.lastEstate((String)session.getAttribute("usuario"),20);
                                
                                for(int i = 0;i<estados.size();i++){
                                    
                                    out.println("<div id='feedDiv' class='feedDiv'>"
                                                     + "<div class='estadosmuro'>"
                                                          + "<div id='estado_photo'>"
                                                               + "<img src='"+userData[1]+"' width='90%'>"
                                                            + "</div>"+estados.get(i)[0]+""
                                                         + "</div>"
                                                + "<div name='comentario'>");
                                    
                                    ArrayList<String[]> resultadoComentario = show.showComentario(estados.get(i)[1]);
                                    
                                    for(int indice = 0;indice<resultadoComentario.size();indice++){
                                    
                                        out.println("<div class='comentario' name='comentarios'>"
                                                         + "<div class='photo_comentario'>"
                                                         + "<img width='100%' heigth='100%' src="+resultadoComentario.get(indice)[0] +"></div> <div style='clear:both'> <p>"+resultadoComentario.get(indice)[1]+"</p>"+resultadoComentario.get(indice)[2] +"<p></p> </div></div>");
                                    
                                    }
                                    
                                    out.println("</div><form onsubmit='return false'><input type='hidden' value='"+estados.get(i)[1]+
                                            "'><textarea cols='60' maxlength='40' rows='2'></textarea><button onclick=\"comentar(this,'"+session.getAttribute("usuario")+
                                            "','"+userData[1]+"')\">Comentar</button></form><label onclick='mostrarComentarioOcultar(this)'>MostrarComentarios</label><hr></div>");
                                }

                            
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!------------Configurar--------------->    \r\n");
      out.write("                        <div id=\"configurar\" name=\"elementos\" class=\"blokes\" align=\"center\">\r\n");
      out.write("                            \r\n");
      out.write("                            <form onsubmit=\"return false\" name=\"info\">\r\n");
      out.write("                                \r\n");
      out.write("                                <table align=\"center\" width=\"70%\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td>Nombre</td>\r\n");
      out.write("                                        <td><input type=\"text\" name=\"nombre\" maxlength=\"40\"><br></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td>apellido</td>\r\n");
      out.write("                                        <td><input type=\"text\" name=\"apellido\" maxlength=\"40\"><br></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td>Vieja Clave</td>\r\n");
      out.write("                                        <td><input type=\"password\" name=\"oldpass\"><br></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td>Nueva Clave</td>\r\n");
      out.write("                                        <td><input type=\"password\" name=\"Newpass\"><br></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td>sexo</td>\r\n");
      out.write("                                        <td><select name=\"sexo\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <option value=\"0\"></option>\r\n");
      out.write("                                                <option value=\"hombre\">hombre</option>\r\n");
      out.write("                                                <option value=\"mujer\">mujer</option>\r\n");
      out.write("                                                \r\n");
      out.write("                                            </select><br></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td>Estado Civil</td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <select name=\"estadoCivil\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <option value=\"0\"></option>\r\n");
      out.write("                                                <option value=\"casado\">Casado</option>\r\n");
      out.write("                                                <option value=\"soltero\">Soltero</option>\r\n");
      out.write("                                                <option value=\"una relacion\">Una Relacion</option>\r\n");
      out.write("                                                <option value=\"viudo\">Viudo</option>\r\n");
      out.write("                                                \r\n");
      out.write("                                            </select>\r\n");
      out.write("                                            <br>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <td colspan=\"2\" align=\"center\"><button onclick=\"saveInfo(document.info.nombre.value,\r\n");
      out.write("                                            document.info.apellido.value,\r\n");
      out.write("                                            document.info.oldpass.value,\r\n");
      out.write("                                            document.info.Newpass.value,\r\n");
      out.write("                                            document.info.estadoCivil.options[document.info.estadoCivil.selectedIndex].text,\r\n");
      out.write("                                            document.info.sexo.options[document.info.sexo.selectedIndex].text,'");
      out.print( session.getAttribute("usuario"));
      out.write("')\">Guardar</button></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                </table>\r\n");
      out.write("                                \r\n");
      out.write("                            </form>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!------------Photos------------------->    \r\n");
      out.write("                        <div id=\"photos\" name=\"elementos\" class=\"blokes\">\r\n");
      out.write("                            \r\n");
      out.write("                            <a href=\"uploadPhotoPerfil.jsp\">Cambiar Photo de Perfil</a>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!------------News--------------------->\r\n");
      out.write("                        <div id=\"inicio\" name=\"elementos\" class=\"blokes\" align=\"center\">\r\n");
      out.write("                            \r\n");
      out.write("                                    <div id=\"newsDiv\"></div>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("               <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"footer\"></div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
