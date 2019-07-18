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
			
			<div class="form-group content" id="comments"><!-- 
					<input rows="1" class="form-control" class="sendInput" maxlength="1000" placeholder="" > -->
					
					 
					
					 <%-- <c:forEach items="${ename}" var="eee" >
					 <input rows="1" class="form-control" class="sendInput" maxlength="1000" placeholder="${ eee.email}:${eee.text }">
					  
					  <br/>
					  
					</c:forEach>  --%>
					
					
			</div>
			
			<section class="section-padding  parallex-bg">
  <div class="container div_zindex">
    <div class="row">
      <div id="testimonial-slider">
         
     <!-- <div class="testimonial-m" style="visibility: hidden;">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-1.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Donald Brooks</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div> -->
        
        
        <c:forEach items="${comments }" var="com" >
        	
      		<div class="testimonial-m" style="height:260.8px">
	          <div class="testimonial-img"> <img src="/imgs/${com.img }" alt="" style="width: 205px;height: 205px"/> </div>
	          <div class="testimonial-content">
	            <div class="testimonial-heading">
	              <h5>${com.name }</h5>
	              <span class="client-designation">${com.email }</span> </div>
	            <p>${com.text }</p>
	          </div>
        	</div>
        	
        	<!-- <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-2.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Enzo Giovanotelli</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p></p>
          </div>
        </div> -->
      </c:forEach>
             
      </div>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
		</div>
		<div class="comment_form">
			<h6>发表评论</h6>
			
			<form action="addcomment">
			
				<div class="form-group">
					<input type="text" class="form-control" name="namec" placeholder="用户名" id="namec">
				</div>
				<div class="form-group">
					<input type="email" class="form-control" name = "emailc" placeholder="邮箱" id="emailc">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" name="textc" placeholder="评论" id="textc">
				</div>
				
				<div class="form-group">
					<input type="button" class="btn click" value="提交">
				</div>
				<input type="hidden" value="${car.vid }" id="carvid" name="vid">
			</form>
		</div>
 	</body>

<script type="text/javascript">
	$(function(){
		var usernamec = "${user.username }";
		var emailc = "${user.email }";
		$("#namec").val(usernamec);
		$("#emailc").val(emailc);
	});
	
	$(".click").click(function(){
		var usernamec = "${user.username }";
		var emailc = "${user.email }";
		var textc = $("#textc").val();
		var vid = $("#carvid").val();
		$.ajax({
			type:"get",
			url:"addcomment",
			data:{username:usernamec,email:emailc,textc:textc,vid:vid},
			dataType:"json",
			success:function(rs){
				alert("添加评论成功");
			}
		});
	})
</script>
</html>