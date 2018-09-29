package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheckEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <title>Welcome to User Log In Page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css and other/Footer-white.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("<style>\n");
      out.write("\n");
      out.write(" .jumbotron {\n");
      out.write("    margin-bottom: 0px;\n");
      out.write("    background-image: url(img/street.jpg);\n");
      out.write("    background-position: 0% 25%;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    color: white;\n");
      out.write("    text-shadow: black 0.3em 0.3em 0.3em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 45%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 10%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("    width: auto;\n");
      out.write("    padding: 10px 18px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"jumbotron text-center\" >\n");
      out.write("  <h1>VGo Cabs</h1>\n");
      out.write("  <i><p>wherever you go for travel don't forget to book your cab</p></i> \n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("         <li class=\"active\"><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"AboutUsPage.html\">About Us</a></li>\n");
      out.write("      <li><a href=\"ContactUsPage.html\">Contact Us</a></li>\n");
      out.write("      <li><a href=\"FeedbackPage.html\">FeedBack</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<center><h1>Change Password Process</h1></center><br><br>\n");
      out.write("    \n");
      out.write(" <form action=\"Checkmail.jsp\" method=\"post\">\n");
      out.write("    <div class=\"row\" style=\"text-align: center;\">\n");
      out.write("        \n");
      out.write("      <label for=\"email\"><b>Email ID:</b></label>\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required><br> \n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <button type=\"submit\" class=\"confirmbtn\">Confirm</button>        \n");
      out.write("    </div>\n");
      out.write(" </form>\n");
      out.write("\n");
      out.write("<div class=\"alert alert-info\">\n");
      out.write("            <strong>Please Note!</strong> Enter Your Registered Email ID !!!\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer id=\"myFooter\">\n");
      out.write("        \n");
      out.write("        <div class=\"footer-social\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"AboutUsPage.html\">Company Information</a></li>\n");
      out.write("                            <li><a href=\"ContactUsPage.html\">Contact us</a></li>\n");
      out.write("                            <li><a href=\"FeedbackPage.html\">Reviews</a></li>\n");
      out.write("                            <li><a href=\"TermsofServices.html\">Terms of service</a></li>\n");
      out.write("            </ul>\n");
      out.write("        <p class=\"footer-copyright\">© VGo Cabs Pvt.Ltd</p>\n");
      out.write("          <a href=\"https://twitter.com/Twitter?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("          <a href=\"https://www.facebook.com/\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("          <a href=\"https://www.instagram.com/?hl=en\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
