<%@page import="org.apache.commons.lang.StringEscapeUtils"%>
<%@page import="search.Qdata"%>
<%@page import="java.util.ArrayList"%>
<%@page import="search.Searcher"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="product" content="Metro UI CSS Framework">
    <meta name="description" content="Simple responsive css framework">
    <meta name="author" content="Sergey S. Pimenov, Ukraine, Kiev">
    <meta name="keywords" content="js, css, metro, framework, windows 8, metro ui">

	
    <link href="css/metro-bootstrap.css" rel="stylesheet">
    <link href="css/metro-bootstrap-responsive.css" rel="stylesheet">
    <link href="css/iconFont.css" rel="stylesheet">
    <link href="css/docs.css" rel="stylesheet">
    <link href="js/prettify/prettify.css" rel="stylesheet">

    <!-- Load JavaScript Libraries -->
    <script src="js/jquery/jquery.min.js"></script>
    <script src="js/jquery/jquery.widget.min.js"></script>
    <script src="js/jquery/jquery.mousewheel.js"></script>
    <script src="js/prettify/prettify.js"></script>


    <title>Ganggle</title>

    <style>
/*		div{border: 1px solid; box-sizing: border-box;}*/
		#navdiv {height: 55px; min-width: 800px;background: white; position:fixed;top:0;width: 100%;}
		#navdiv .button{margin-top: 8px;height: 35px;padding-top: 7px;}
		#navdiv input{
			margin-top: 8px;
			height: 35px;
			box-sizing: border-box;
			width: 500px;
			font-size: 14pt;
			font-family:arial;
			margin-left: 0;
			color:  black;
		}
		#navdiv img{
			height: 40px;
			margin:10px 10px 0 10px;
		}
		#bar{height: 1000px;}
		.wrapper{
/*			border:1px solid;*/
		}

		#tabdiv{
			padding: 55px 0 0 143px;
			background: #F1F1F1;
			height: 90px;
		}
		#tabdiv a{
			font-size: 11pt;
			text-align: center;
			height: 35px;
			width: 70px;
			display: inline-block;
			margin: 0;
			padding-top: 5px;
			box-sizing: border-box;
			color: gray;
		}
		#tabdiv a:hover{
			color: black;
		}
		#tabdiv .selected{
			border-bottom:2px solid blue;
			cursor: text;
			color: black;
		}
		#resTotal{
			color: gray;
			padding-bottom: 20px;
		}
		#resultdiv{
			padding: 20px 0 0 143px;
		}
		#resultdiv .reslistdiv{
			width: 538px;
			padding: 0 0 20px 0;
		}
		#resultdiv .reslistdiv h4{
			font-family:arial;
			font-weight: normal;
			font-size:14pt;
			color: blue;
			margin: 0;
		}
		#resultdiv .reslistdiv h4:hover{
			text-decoration: underline;
			cursor: pointer;
		}
		#resultdiv .reslistdiv em{
			font-style: normal;
			color: #e00000;
		}
		#resultdiv .reslistdiv .brief{
			font-size: 11pt;
			padding:0;
		}
		#resultdiv .reslistdiv .href{
			font-size: 10.5pt;
			color: #008000;
		}
		#resultdiv .reslistdiv .href span{
			padding-left: 10px;
		}
		#pager{
			padding: 15px 0 40px 136px;
		}
		#pager a{
			height: 40px;
			padding: 8px 15px 0 15px;
			display: inline-block;
			border: 1px solid #e1e2e3;
			color: #1A0DAB;
			margin: 0 5px 0 5px;
			
		}
		#pager span{
			height: 40px;
			padding: 8px 15px 0 15px;
			display: inline-block;
			color: black;
			margin: 0 5px 0 5px;
		}
		#pager a:hover{
			cursor: pointer;
			background: #F2F8FF;
			border: 1px #3388FF solid;
		}
		#footer{
			height: 50px;
			padding: 15px 0 0 143px;
			background: #F1F1F1;
			
		}
		#footer a{
			color: gray;
		}
		#footer a:hover{
			color: black;
		}
    </style>
</head>

<%
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
%>
   
<body class="metro">
<div class="wrapper">
	<div id="navdiv" >
		<img src="images/logo.png"/></span><input id="searchinput" type="text" value="<%=wd %>"/><a id="searchbut" class="button large primary">Search</a>
	</div>
	<div id="tabdiv">
		<a href="#" class="selected">Web</a><a href="#">Images</a><a href="#">Videos</a><a href="#">Scholar</a><a href="#">Translate</a>
	</div>	
	<div id="resultdiv">
		<div id="resTotal">About <%= totalRe %> results </div>
		<%
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
		%>
	</div>
	
		<%
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
		%>
	
	<div id="footer">
		2015-201x, Ganggle &copy; by  <a href="#">zhi jian</a>
	</div>
	<script type="text/javascript">
		function searchGo(){
			var wd = $("#searchinput").val();
			if(wd.length>0){
				window.location.href = "Search?wd="+wd;
				console.log("href " +" Search?wd="+wd);
			}
		}
		$(function(){
			console.log("top : "+$("#footer").offset().top);
			offset = $("#footer").offset();
			if(offset.top+$("#footer").outerHeight()<$("body").height()){
				offset.top = $("body").height() - $("#footer").outerHeight();
				$("#footer").offset(offset);
			}
			$(window).scroll(function(){
				$scrolltop = $(window).scrollTop();
				if($scrolltop>$("#tabdiv").height()){
					$("#navdiv").addClass("shadow");
				}else{
					$("#navdiv").removeClass("shadow");
				}
				return false;
			});
			
			$("#searchbut").click(searchGo);
			$("#searchinput").keydown(function(event){
				//console.log("key code : "+event.keyCode);
				if(event.keyCode=='13'){
					searchGo();
				}
			});
		});		
	</script>
	
</div>	
</body>
</html>