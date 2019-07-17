<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css" type="text/css">
	<!--Custome Style -->
	<link rel="stylesheet" href="assets/css/style.css" type="text/css">
	<!--OWL Carousel slider-->
	<link rel="stylesheet" href="assets/css/owl.carousel.css" type="text/css">
	<link rel="stylesheet" href="assets/css/owl.transitions.css" type="text/css">
	<!--slick-slider -->
	<link href="assets/css/slick.css" rel="stylesheet">
	<!--bootstrap-slider -->
	<link href="assets/css/bootstrap-slider.min.css" rel="stylesheet">
	<!--FontAwesome Font Style -->
	<link href="assets/css/font-awesome.min.css" rel="stylesheet">
	
	
	<!-- SWITCHER -->
			<link rel="stylesheet" id="switcher-css" type="text/css" href="assets/switcher/css/switcher.css" media="all" />
			<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/red.css" title="red" media="all" data-default-color="true" />
			<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/orange.css" title="orange" media="all" />
			<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/blue.css" title="blue" media="all" />
			<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/pink.css" title="pink" media="all" />
			<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/green.css" title="green" media="all" />
			<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/purple.css" title="purple" media="all" />
	        
	<!-- Fav and touch icons -->
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/images/favicon-icon/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/images/favicon-icon/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/images/favicon-icon/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed" href="assets/images/favicon-icon/apple-touch-icon-57-precomposed.png">
	<link rel="shortcut icon" href="assets/images/favicon-icon/favicon.png">
	<!-- Google-Font-->
	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
	<script type="text/javascript" src="js/jquery-2.2.3.min.js" ></script>
    <body>
    	<!--Vehicle-Video 修改-->
		<div class="video_wrap">
			<h6>评论</h6>
			
			<div class="form-group content"><!-- 
					<input rows="1" class="form-control" class="sendInput" maxlength="1000" placeholder="" > -->
					
					  
					
					 <c:forEach items="${ename}" var="eee" >
					 <input rows="1" class="form-control" class="sendInput" maxlength="1000" placeholder="${ eee.email}:${eee.text }">
					  
					  <br/>
					  
					</c:forEach> 
					
					
			</div>
		</div>
		<div class="comment_form">
			<h6>发表评论</h6>
			
			<form action="addcomment">
			
				<div class="form-group">
					<input type="text" class="form-control" name="name" placeholder="用户名">
				</div>
				<div class="form-group">
					<input type="email" class="form-control" name = "email" placeholder="邮箱">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" name="textc" placeholder="评论">
				</div>
				
				<div class="form-group">
					<input type="submit" class="btn click" value="提交">
				</div>
				<input type="hidden" value="${car.vid }" id="carvid" name="vid">
			</form>
		</div>
 	</body>

<script type="text/javascript">
	var index = 1;
	$(".click").click(function(){
		var vid = $("#carvid").val();
		var mtext = $(".text").val();
		var lines = mtext.split(/\r*\n/);
		$(".content").append("<textarea rows=\""+lines.length+"\" class=\"form-control\" class=\"sendInput\" maxlength=\"1000\" placeholder=\"评论展示\">"+mtext+"</textarea>");
		$(".text").val("");
	})
</script>
</html>