/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.17
 * Generated at: 2015-02-05 02:06:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringEscapeUtils;
import search.Qdata;
import java.util.ArrayList;
import search.Searcher;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("search.Qdata");
    _jspx_imports_classes.add("search.Searcher");
    _jspx_imports_classes.add("org.apache.commons.lang.StringEscapeUtils");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta name=\"product\" content=\"Metro UI CSS Framework\">\r\n");
      out.write("    <meta name=\"description\" content=\"Simple responsive css framework\">\r\n");
      out.write("    <meta name=\"author\" content=\"Sergey S. Pimenov, Ukraine, Kiev\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"js, css, metro, framework, windows 8, metro ui\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <link href=\"css/metro-bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/metro-bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/iconFont.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"js/prettify/prettify.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Load JavaScript Libraries -->\r\n");
      out.write("    <script src=\"js/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery/jquery.widget.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery/jquery.mousewheel.js\"></script>\r\n");
      out.write("    <script src=\"js/prettify/prettify.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>Ganggle</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("/*\t\tdiv{border: 1px solid; box-sizing: border-box;}*/\r\n");
      out.write("\t\t#navdiv {height: 55px; min-width: 800px;background: white; position:fixed;top:0;width: 100%;}\r\n");
      out.write("\t\t#navdiv .button{margin-top: 8px;height: 35px;padding-top: 7px;}\r\n");
      out.write("\t\t#navdiv input{\r\n");
      out.write("\t\t\tmargin-top: 8px;\r\n");
      out.write("\t\t\theight: 35px;\r\n");
      out.write("\t\t\tbox-sizing: border-box;\r\n");
      out.write("\t\t\twidth: 500px;\r\n");
      out.write("\t\t\tfont-size: 14pt;\r\n");
      out.write("\t\t\tfont-family:arial;\r\n");
      out.write("\t\t\tmargin-left: 0;\r\n");
      out.write("\t\t\tcolor:  black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#navdiv img{\r\n");
      out.write("\t\t\theight: 40px;\r\n");
      out.write("\t\t\tmargin:10px 10px 0 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#bar{height: 1000px;}\r\n");
      out.write("\t\t.wrapper{\r\n");
      out.write("/*\t\t\tborder:1px solid;*/\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#tabdiv{\r\n");
      out.write("\t\t\tpadding: 55px 0 0 143px;\r\n");
      out.write("\t\t\tbackground: #F1F1F1;\r\n");
      out.write("\t\t\theight: 90px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#tabdiv a{\r\n");
      out.write("\t\t\tfont-size: 11pt;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\theight: 35px;\r\n");
      out.write("\t\t\twidth: 70px;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t\tpadding-top: 5px;\r\n");
      out.write("\t\t\tbox-sizing: border-box;\r\n");
      out.write("\t\t\tcolor: gray;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#tabdiv a:hover{\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#tabdiv .selected{\r\n");
      out.write("\t\t\tborder-bottom:2px solid blue;\r\n");
      out.write("\t\t\tcursor: text;\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resTotal{\r\n");
      out.write("\t\t\tcolor: gray;\r\n");
      out.write("\t\t\tpadding-bottom: 20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv{\r\n");
      out.write("\t\t\tpadding: 20px 0 0 143px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv{\r\n");
      out.write("\t\t\twidth: 538px;\r\n");
      out.write("\t\t\tpadding: 0 0 20px 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv h4{\r\n");
      out.write("\t\t\tfont-family:arial;\r\n");
      out.write("\t\t\tfont-weight: normal;\r\n");
      out.write("\t\t\tfont-size:14pt;\r\n");
      out.write("\t\t\tcolor: blue;\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv h4:hover{\r\n");
      out.write("\t\t\ttext-decoration: underline;\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv em{\r\n");
      out.write("\t\t\tfont-style: normal;\r\n");
      out.write("\t\t\tcolor: #e00000;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv .brief{\r\n");
      out.write("\t\t\tfont-size: 11pt;\r\n");
      out.write("\t\t\tpadding:0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv .href{\r\n");
      out.write("\t\t\tfont-size: 10.5pt;\r\n");
      out.write("\t\t\tcolor: #008000;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#resultdiv .reslistdiv .href span{\r\n");
      out.write("\t\t\tpadding-left: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#pager{\r\n");
      out.write("\t\t\tpadding: 15px 0 40px 136px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#pager a{\r\n");
      out.write("\t\t\theight: 40px;\r\n");
      out.write("\t\t\tpadding: 8px 15px 0 15px;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\tborder: 1px solid #e1e2e3;\r\n");
      out.write("\t\t\tcolor: #1A0DAB;\r\n");
      out.write("\t\t\tmargin: 0 5px 0 5px;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#pager span{\r\n");
      out.write("\t\t\theight: 40px;\r\n");
      out.write("\t\t\tpadding: 8px 15px 0 15px;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t\tmargin: 0 5px 0 5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#pager a:hover{\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\tbackground: #F2F8FF;\r\n");
      out.write("\t\t\tborder: 1px #3388FF solid;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#footer{\r\n");
      out.write("\t\t\theight: 50px;\r\n");
      out.write("\t\t\tpadding: 15px 0 0 143px;\r\n");
      out.write("\t\t\tbackground: #F1F1F1;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#footer a{\r\n");
      out.write("\t\t\tcolor: gray;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#footer a:hover{\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

	String pa = request.getParameter("pa");
	int offset = 0;
	int eachpage = 10;
	if(pa!=null){
		try{
			offset = Integer.valueOf(pa);
		}catch (NumberFormatException e){
			offset = 0;
		}
		if(offset<0)
			offset = 0;
	}
	String wd = request.getParameter("wd");
	ArrayList<Qdata> reslist =  null;
	int totalRe = 0;
	if(wd.length()>0){
		Searcher searcher = new Searcher();
    	reslist = searcher.getQueryResult(wd,offset*eachpage,eachpage,56,150);
    	totalRe = searcher.getTotal();
	}

      out.write("\r\n");
      out.write("   \r\n");
      out.write("<body class=\"metro\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t<div id=\"navdiv\" >\r\n");
      out.write("\t\t<img src=\"images/logo.png\"/></span><input id=\"searchinput\" type=\"text\" value=\"");
      out.print(wd );
      out.write("\"/><a id=\"searchbut\" class=\"button large primary\">Search</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"tabdiv\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"selected\">Web</a><a href=\"#\">Images</a><a href=\"#\">Videos</a><a href=\"#\">Scholar</a><a href=\"#\">Translate</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<div id=\"resultdiv\">\r\n");
      out.write("\t\t<div id=\"resTotal\">About ");
      out.print( totalRe );
      out.write(" results </div>\r\n");
      out.write("\t\t");

		if(reslist!=null){
			for(int i = 0;i<reslist.size();i++){
				Qdata data = reslist.get(i);
				String hrefStr = data.getHref().replace("http://","");
				int hrefLen = Math.min(hrefStr.length(),40);
				String contentStr = data.getContent();
				String titleStr = data.getTitle();
				String item = "<div class=\"reslistdiv\">"+
					"<a target=\"_blank\" href=\""+data.getHref()+"\"><h4>"+titleStr+"</h4></a>"+
					"<div class=\"href\">"+hrefStr.substring(0,hrefLen)+"<span>"+data.getDate()+"</span></div>"+
					"<div class=\"brief\">"+contentStr+"</div></div>";
				out.print(item);
			}
			
		}
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");

			int offset_1 = offset - 1;
			if(offset_1<0)offset_1 = 0;
			if(totalRe>eachpage){
				out.print("<div id=\"pager\">");
				
				String tmp1 = "<a href=\"Search?wd="+wd+"&&pa="+offset_1+"\"> <i class=\"icon-previous\"> </i></a>";
				out.print(tmp1);
				
				int tpages = totalRe / eachpage;
				if(totalRe%eachpage!=0)
					tpages++;
				int shown = Math.min(tpages,10);
				int sleft = offset - 5;
				int sright = offset + 4;
				if(sleft<=0){
					sleft = 0;
					sright = sleft+shown-1;
				}else if(sright>=tpages){
					sright = tpages - 1;
					sleft = sright-shown+1;
				}
				for(int i = sleft;i<=sright;i++){
					if(i!=offset){
						String tmp3 = "<a href=\"Search?wd="+wd+"&&pa="+i+"\">"+(i+1)+"</a>";
						out.print(tmp3);
					}else {
						String tmp3 = "<span>"+(i+1)+"</span>";
						out.print(tmp3);
					}
				}
				String tmp2 = "<a href=\"Search?wd="+wd+"&&pa="+(offset+1)+"\"> <i class=\"icon-next\"> </i></a>";
				out.print(tmp2);
				out.print("</div>");
			}
		
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t2015-201x, Ganggle &copy; by  <a href=\"#\">zhi jian</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction searchGo(){\r\n");
      out.write("\t\t\tvar wd = $(\"#searchinput\").val();\r\n");
      out.write("\t\t\tif(wd.length>0){\r\n");
      out.write("\t\t\t\twindow.location.href = \"Search?wd=\"+wd;\r\n");
      out.write("\t\t\t\tconsole.log(\"href \" +\" Search?wd=\"+wd);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tconsole.log(\"top : \"+$(\"#footer\").offset().top);\r\n");
      out.write("\t\t\toffset = $(\"#footer\").offset();\r\n");
      out.write("\t\t\tif(offset.top+$(\"#footer\").outerHeight()<$(\"body\").height()){\r\n");
      out.write("\t\t\t\toffset.top = $(\"body\").height() - $(\"#footer\").outerHeight();\r\n");
      out.write("\t\t\t\t$(\"#footer\").offset(offset);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(window).scroll(function(){\r\n");
      out.write("\t\t\t\t$scrolltop = $(window).scrollTop();\r\n");
      out.write("\t\t\t\tif($scrolltop>$(\"#tabdiv\").height()){\r\n");
      out.write("\t\t\t\t\t$(\"#navdiv\").addClass(\"shadow\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#navdiv\").removeClass(\"shadow\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#searchbut\").click(searchGo);\r\n");
      out.write("\t\t\t$(\"#searchinput\").keydown(function(event){\r\n");
      out.write("\t\t\t\t//console.log(\"key code : \"+event.keyCode);\r\n");
      out.write("\t\t\t\tif(event.keyCode=='13'){\r\n");
      out.write("\t\t\t\t\tsearchGo();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</div>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
