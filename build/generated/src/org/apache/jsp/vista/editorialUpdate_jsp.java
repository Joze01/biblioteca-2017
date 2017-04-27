package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editorialUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');


 //se asignan los parámetros de sesión
 HttpSession sesionOk = request.getSession();
 if(sesionOk.getAttribute("logeado")==null){
     
 out.println("<h1>Session No creada</h1>");
 
      out.write('\n');
      out.write(' ');
      if (true) {
        _jspx_page_context.forward("/vista/login.jsp");
        return;
      }
      out.write('\n');

 }else{
 out.println("<h1>Session creada</h1>");
 }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "assent/header.jsp", out, false);
      out.write("\n");
      out.write("        <title>MANTENIMINETO EDITORIAL</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <body class=\"nav-md\">\n");
      out.write("       \n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("          \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "assent/menuAdmin.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"right_col\" role=\"main\" style=\"min-height: 335px;\">\n");
      out.write("  \n");
      out.write("    ");
      out.write("\n");
      out.write("     \n");
      out.write("<div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <h2>Editorial</h2>\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    <br />\n");
      out.write("                    <form id=\"demo-form2\" data-parsley-validate class=\"form-horizontal form-label-left\" action=\"/biblioteca-2017/EditorialServletUpdate\" method=\"post\">\n");
      out.write("\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"nombre\">Nombre <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <input type=\"text\" name=\"nombre\" id=\"first-name\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\"  for=\"descripcion\">Descripcion <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" name=\"descripcion\" id=\"last-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                          <input type=\"hidden\" name='id' value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                      \n");
      out.write("                      <div class=\"ln_solid\"></div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12 col-md-offset-3\">\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-success\">Modificar</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <h2>Datos</h2>\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    <br />\n");
      out.write("                    \n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>#</th>\n");
      out.write("                          <th>Nombre</th>\n");
      out.write("                          <th>Descripcion</th>\n");
      out.write("                          <th>Opciones</th>\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "tablaEditorial.jsp", out, false);
      out.write("\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("             <!-- footer content -->\n");
      out.write("    <footer>\n");
      out.write("          <div class=\"pull-right\">\n");
      out.write("            BIBLIOTECA UDB 2017 DAVID IBARRA\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clearfix\"></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- /footer content -->\n");
      out.write("    </body>\n");
      out.write("      </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "assent/footer.jsp", out, false);
      out.write(" \n");
      out.write("    </footer>\n");
      out.write("    ");
      out.write("\n");
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
