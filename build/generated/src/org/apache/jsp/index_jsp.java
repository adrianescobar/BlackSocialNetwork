package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>..::Black::..</title>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/indexFunction.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("        <link href=\"css/preset_css.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/Style_Index.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("     </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        ");

        
        HttpSession sesion=request.getSession(false);
			
        if(sesion.getAttribute("usuario")!=null){
                response.sendRedirect("home.jsp");
        }
        
        
      out.write("\r\n");
      out.write("        <div id=\"page\">\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"header\"></div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"body\">\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"login\" align=\"center\">\r\n");
      out.write("                    \r\n");
      out.write("                    <form onsubmit=\"return false\" name=\"loginFormulario\">\r\n");
      out.write("                        \r\n");
      out.write("                        <table>\r\n");
      out.write("                            \r\n");
      out.write("                           <!--Email Login  --> \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Email</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                <input type=\"text\" name=\"email\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                           <!--Clave Login  --> \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>Clave:</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                <input type=\"password\" name=\"pass\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <!--Error Login -->\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td colspan=\"2\" id=\"failLogin\" align=\"center\"></td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <!--Button Login -->.\r\n");
      out.write("                            <tr align=\"center\">\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td align=\"center\">\r\n");
      out.write("                                    <button onclick=\"LoginFunction(document.loginFormulario.email.value,document.loginFormulario.pass.value)\">Log in</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" align=\"right\" >\r\n");
      out.write("                                    <a href=\"#\" onclick=\"login();\">No Estas Registrado?</a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                        </table>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"singin\" align=\"center\">\r\n");
      out.write("                    \r\n");
      out.write("                    <form method=\"\" onsubmit=\"return false\" name=\"registro\">\r\n");
      out.write("                        \r\n");
      out.write("                        <table border=\"2\" width=\"70%\">\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>Nombre :\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"nombre\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                   \r\n");
      out.write("                                <td id=\"ErrorNombre\" class=\"tdR\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    Apellido:\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"apellido\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                   \r\n");
      out.write("                                <td id=\"ErrorApellido\" class=\"tdR\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>Clave:\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"clave\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                   \r\n");
      out.write("                                <td id=\"ErrorClave\" class=\"tdR\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>Repetir Clave:\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"rclave\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                   \r\n");
      out.write("                                <td id=\"ErrorRClave\" class=\"tdR\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>Correo:\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"mail\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                   \r\n");
      out.write("                                <td id=\"ErrorMail\" class=\"tdR\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr align=\"center\">\r\n");
      out.write("                                \r\n");
      out.write("                                <td colspan=\"3\">\r\n");
      out.write("                                    <button onclick=\"singinValidar()\">Sing in</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <td colspan=\"3\" align=\"right\"><a href=\"#\" onclick=\"login()\">Login</a></td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                        </table>\r\n");
      out.write("                        <input type=\"hidden\" value=\"false\" id=\"mailT\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
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
