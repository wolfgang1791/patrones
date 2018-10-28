package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"http://maps.googleapis.com/maps/api/js?v3\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"map\" style=\" width: 700px; height: 500px\"></section>\n");
      out.write("        <script src=\"js1.js\">\n");
      out.write("            navigator.geolocation.getCurrentPosition(fn_ok,fn_mal);\n");
      out.write("            var mapa = document.getElementById(\"map\");\n");
      out.write("            function fn_mal(){}\n");
      out.write("            function fn_ok(respuesta){\n");
      out.write("               var lat = respuesta.coords.latitude;\n");
      out.write("               var lon = respuesta.coords.longitude;\n");
      out.write("               //var cor = lat+','+lon;\n");
      out.write("\n");
      out.write("               var larlon = new google.maps.LatLng(lat,lon);\n");
      out.write("               var objConf = {\n");
      out.write("                       zoom:17,\n");
      out.write("                       center:larlon\n");
      out.write("               };\n");
      out.write("               var gmap = new google.maps.Map(mapa,objConf);\n");
      out.write("               var ocm = {\n");
      out.write("                       position:larlon,\n");
      out.write("                       map:gmap,\n");
      out.write("                       title:\"SHITTTTT\"\n");
      out.write("               };\n");
      out.write("               var gmarker = new google.maps.Marker(ocm);\n");
      out.write("               var upn = new google.maps.LatLng(-12.0564133,-77.0859679);\n");
      out.write("\n");
      out.write("                    var configd = {\n");
      out.write("                            origin: larlon,\n");
      out.write("                            destination:upn,\n");
      out.write("                            travelMode: google.maps.TravelMode.DRIVING\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("\n");
      out.write("               var ds = new google.maps.DirectionsService();\n");
      out.write("               var configR = {\n");
      out.write("                       map:gmap\n");
      out.write("               };\n");
      out.write("               var dr  = new google.maps.DirectionsRenderer(configR);\n");
      out.write("\n");
      out.write("               ds.route(configd,fn_rutear);\n");
      out.write("               function fn_rutear(res,status){\n");
      out.write("                       if(status === \"OK\"){\n");
      out.write("                               dr.setDirections(res);\n");
      out.write("                       }\n");
      out.write("                       else{\n");
      out.write("                               alert(\"shit\");\n");
      out.write("                       }\n");
      out.write("               }\n");
      out.write("\n");
      out.write("        } \n");
      out.write("\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
