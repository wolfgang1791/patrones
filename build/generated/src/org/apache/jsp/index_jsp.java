package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import proy.entidad.Paradero;
import proy.entidad.Independiente;
import proy.entidad.Consorcio;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script async defer src=\"https://maps.googleapis.com/maps/api/js?key=\r\n");
      out.write("AIzaSyAd32X_TFs3Db480JGyg0YS9weM0XoO-t8\"\r\n");
      out.write("  type=\"text/javascript\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("           body { background-image: url(img/fondo.jpg) ;\r\n");
      out.write("                  background-repeat: no-repeat;\r\n");
      out.write("                  background-size: 100%;\r\n");
      out.write("                  background-attachment: fixed;\r\n");
      out.write("                  \r\n");
      out.write("           }\r\n");
      out.write("           .xd{\r\n");
      out.write("               background: #fff;\r\n");
      out.write("               opacity: 0.99;\r\n");
      out.write("           }\r\n");
      out.write("           .container-fluid{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("             ");
 
                boolean b=false;
                List<Consorcio> con = null;
                List<Independiente> ind= null;
                List<Paradero> par = null;
                
                 if(b){
      out.write("\r\n");
      out.write("             ");
  con = (List<Consorcio>) request.getAttribute("listaC");
      out.write("\r\n");
      out.write("             ");
  ind = (List<Independiente>)request.getAttribute("listaI");
      out.write("\r\n");
      out.write("             ");
  par = (List<Paradero>)request.getAttribute("listaP");}
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <form action=\"MainServlet\" method=\"post\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group row justify-content-center mt-4\">\r\n");
      out.write("                    <div class=\"col-2\">\r\n");
      out.write("                        <label for=\"paradero\" class=\" col-form-label text-md-right\"><h4 class=\"text-white\">¿A dondé ir?</h4></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-4 \">\r\n");
      out.write("                        <input id=\"name\" type=\"text\" class=\"form-control\" name=\"paradero\"autofocus>\r\n");
      out.write("                        <input id=\"lat\" type=\"hidden\" class=\"form-control\" name=\"lat\" value=\"");
 if(b) out.println(par.get(par.size()-1).getLatitud());
      out.write("\">\r\n");
      out.write("                        <input id=\"lon\" type=\"hidden\" class=\"form-control\" name=\"lon\" value=\"");
 if(b) out.println(par.get(par.size()-1).getLongitud());
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"xd\">      \r\n");
      out.write("                <div class=\"row justify-content-md-center mb-5 \">\r\n");
      out.write("                    <div class=\"col ml-6\">\r\n");
      out.write("                     <section id=\"map\" style=\"  height: 500px;\"></section>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("              <!--\r\n");
      out.write("                <div class=\"row  justify-content-md-center   xd mt-5\">\r\n");
      out.write("                    <div class=\"col-8\">\r\n");
      out.write("                        <table class=\"table table-sm \">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <th scope=\"col\">Nombre de Empresa</th>\r\n");
      out.write("                                <th scope=\"col\">Ruta</th>\r\n");
      out.write("                                <th scope=\"col\">Imagen</th>\r\n");
      out.write("                                <th scope=\"col\">Tipo</th>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                              ");
 if(b){
                                  for(Consorcio c:con){
      out.write("  \r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <th scope=\"row\">");
out.print(c.getNombre());
      out.write("</th>\r\n");
      out.write("                                <th scope=\"row\">");
out.print(c.getCodigo_ruta());
      out.write("</th>\r\n");
      out.write("                                <th scope=\"row\"><img class=\"img-thumbnail\" src=\"");
out.print(c.getImagen());
      out.write("\"></th>\r\n");
      out.write("                                <th scope=\"row\">");
out.print(c.getTipo());
      out.write("</th>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              ");
}
                              }
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                         </table>\r\n");
      out.write("                     </div>\r\n");
      out.write("             \r\n");
      out.write("          \r\n");
      out.write("          <div class=\"col-8\">\r\n");
      out.write("              \r\n");
      out.write("                <table class=\"table table-sm\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"col\">Nombre de Empresa</th>\r\n");
      out.write("                        <th scope=\"col\">Ruta</th>\r\n");
      out.write("                        <th scope=\"col\">Imagen</th>\r\n");
      out.write("                        <th scope=\"col\">Tipo</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                      ");
 if(b){
                           for(Independiente i:ind){
      out.write("  \r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"row\">");
out.print(i.getNombre());
      out.write("</th>\r\n");
      out.write("                        <th scope=\"row\">");
out.print(i.getCodigo_ruta());
      out.write("</th>\r\n");
      out.write("                        <th scope=\"row\"><img class=\"img-thumbnail\" src=\"");
out.print(i.getImagen());
      out.write("\"></th>\r\n");
      out.write("                        <th scope=\"row\">");
out.print(i.getTipo());
      out.write("</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      ");
}
                      }
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                 </table>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-8 mt-6\">\r\n");
      out.write("             \r\n");
      out.write("                <table class=\"table table-sm\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"col\">Paraderos de Ruta</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                      ");
 if(b){
                          for(Paradero p:par){
      out.write("  \r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"row\">");
out.print(p.getDescripcion());
      out.write("</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      ");
}
                      }
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                 </table>\r\n");
      out.write("          </div>\r\n");
      out.write("         </div>\r\n");
      out.write("                    -->\r\n");
      out.write("         </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            navigator.geolocation.getCurrentPosition(fn_ok,fn_mal);\r\n");
      out.write("            var mapa = document.getElementById(\"map\");\r\n");
      out.write("            \r\n");
      out.write("            var lat_ = document.getElementById(\"lat\").value;\r\n");
      out.write("            var lon_ = document.getElementById(\"lon\").value;\r\n");
      out.write("            console.log(lat_);\r\n");
      out.write("            console.log(lon_);\r\n");
      out.write("            function fn_mal(){}\r\n");
      out.write("            function fn_ok(respuesta){\r\n");
      out.write("               var lat = respuesta.coords.latitude;\r\n");
      out.write("               var lon = respuesta.coords.longitude;\r\n");
      out.write("               var cor = lat+','+lon;\r\n");
      out.write("               console.log(cor);\r\n");
      out.write("               var larlon = new google.maps.LatLng(lat,lon);\r\n");
      out.write("               var objConf = {\r\n");
      out.write("                       zoom:17,\r\n");
      out.write("                       center:larlon\r\n");
      out.write("               };\r\n");
      out.write("               var gmap = new google.maps.Map(mapa,objConf);\r\n");
      out.write("               var ocm = {\r\n");
      out.write("                       position:larlon,\r\n");
      out.write("                       map:gmap,\r\n");
      out.write("                       title:\"SHITTTTT\"\r\n");
      out.write("               };\r\n");
      out.write("               var gmarker = new google.maps.Marker(ocm);\r\n");
      out.write("               var destino = new google.maps.LatLng(lat_,lon_);\r\n");
      out.write("\r\n");
      out.write("                    var configd = {\r\n");
      out.write("                            origin: larlon,\r\n");
      out.write("                            destination:destino,\r\n");
      out.write("                            travelMode: google.maps.TravelMode.DRIVING\r\n");
      out.write("                    };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("               var ds = new google.maps.DirectionsService();\r\n");
      out.write("               var configR = {\r\n");
      out.write("                       map:gmap\r\n");
      out.write("               };\r\n");
      out.write("               var dr  = new google.maps.DirectionsRenderer(configR);\r\n");
      out.write("\r\n");
      out.write("               ds.route(configd,fn_rutear);\r\n");
      out.write("               function fn_rutear(res,status){\r\n");
      out.write("                       if(status === 'OK'){\r\n");
      out.write("                               dr.setDirections(res);\r\n");
      out.write("                       }\r\n");
      out.write("                       else{\r\n");
      out.write("                               alert(\"shit\");\r\n");
      out.write("                       }\r\n");
      out.write("               }\r\n");
      out.write("\r\n");
      out.write("        } \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
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
