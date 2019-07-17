<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 	
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" /> 
<meta name="author" content="js代码(www.jsdaima.com)" />
<meta name="copyright" content="js代码(www.jsdaima.com)" />
<!--Bootstrap -->
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
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="http://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="http://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->  
</head>
<body>

     


<!-- Start Switcher -->
<div class="switcher-wrapper">	
    <div class="demo_changer">
        <div class="demo-icon customBgColor"><i class="fa fa-cog fa-spin fa-2x"></i></div>
        <div class="form_holder">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="predefined_styles">
                        <div class="skin-theme-switcher">
                            <h4>Color</h4>
                            <a href="#" data-switchcolor="red" class="styleswitch" style="background-color:#de302f;"> </a>
                            <a href="#" data-switchcolor="orange" class="styleswitch" style="background-color:#f76d2b;"> </a>
                            <a href="#" data-switchcolor="blue" class="styleswitch" style="background-color:#228dcb;"> </a>
                            <a href="#" data-switchcolor="pink" class="styleswitch" style="background-color:#FF2761;"> </a>
                            <a href="#" data-switchcolor="green" class="styleswitch" style="background-color:#2dcc70;"> </a>
                            <a href="#" data-switchcolor="purple" class="styleswitch" style="background-color:#6054c2;"> </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /Switcher -->  
  
<!--Header-->
<%@ include file="head.jsp" %>
<!-- /Header --> 

<!--Page Header-->
<section class="page-header profile_page">
  <div class="container">
    <div class="page-header_wrap">
      <div class="page-heading">
        <h1>Your Profile</h1>
      </div>
      <ul class="coustom-breadcrumb">
        <li><a href="#">Home</a></li>
        <li>Profile</li>
      </ul>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Page Header--> 

<!--Profile-setting-->
<section class="user_profile inner_pages">
  <div class="container">
    <%-- <div class="user_profile_info gray-bg padding_4x4_40">
      <div class="upload_user_logo" > <img src="assets/images/dealer-logo.jpg" alt="image" id="imgs" style="width:225px;height:175px">
        <div class="upload_newlogo">
        
         	<input name="Image"  <c:if test="${user==null }">type="text"</c:if>type="file" id="UserImage">
          <input id="username1" type="hidden" value="${user.getUsername()}">
        </div>
      </div>
      <div class="dealer_info">          
        <h5>
        <c:if test="${user==null }">用户名</c:if>${user.getUsername()}
        </h5>
		<p>
		<c:if test="${user.getAdress()==null}">居住地址 </c:if> ${user.getAdress()}
	    <br>
		<c:if test="${user.getProvince()==null}">省份 </c:if> ${user.getProvince()}
		<c:if test="${user.getPhone()==null}">,联系方式 </c:if>${user.getPhone()}
		</p>
		
      </div>
    </div> --%>
    <%@ include file="headimg.jsp" %>
    <div class="row">
      <div class="col-md-3 col-sm-3">
      <div class="profile_nav">
	  <%@include file="infolist.jsp" %>
      </div>
      </div>
      <div class="col-md-6 col-sm-8">
        <div class="profile_wrap">
          <h5 class="uppercase underline">基础资料</h5>
          <form action="#" method="get">
            <div class="form-group">
              <label class="control-label">用户名</label>
              <input class="form-control white_bg" id="fullname" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">邮箱地址</label>
              <input class="form-control white_bg" id="email" type="email">
            </div>
            <div class="form-group">
              <label class="control-label">手机号码</label>
              <input class="form-control white_bg" id="phone-number" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">出生日期</label>
              <input class="form-control white_bg" id="birth-date" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">居住地址</label>
              <textarea class="form-control white_bg" rows="4"></textarea>
            </div>
            <div class="form-group">
              <label class="control-label">国家</label>
              <input class="form-control white_bg" id="country" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">省份</label>
              <input class="form-control white_bg" id="city" type="text">
            </div>
            <div class="gray-bg field-title">
              <h6>密码更新</h6>
            </div>
            <div class="form-group">
				<label class="control-label">旧密码</label> <input
					class="form-control white_bg" name="userpassword"
					type="password">
			</div>
			<div class="form-group">
				<label class="control-label">新密码</label> <input
					class="form-control white_bg" name="n-password" type="password">
			</div>
			<div class="form-group">
				<label class="control-label">重复密码</label> <input
					class="form-control white_bg" name="c-password" type="password">
			</div>
            <div class="gray-bg field-title">
              <h6>Social Links</h6>
            </div>
            <div class="form-group">
              <label class="control-label">Facebook ID</label>
              <input class="form-control white_bg" id="facebook" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Twitter ID</label>
              <input class="form-control white_bg" id="twitter" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Linkedin ID</label>
              <input class="form-control white_bg" id="linkedin" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Google+ ID</label>
              <input class="form-control white_bg" id="google" type="text">
            </div>
            <div class="form-group">
              <button type="submit" class="btn">Save Changes <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</section>
<!--/Profile-setting--> 

<!--Brands-->
<%@ include file="popularbrands.jsp" %>
<!-- /Brands--> 

<!--Footer -->
<%@ include file="foot.jsp" %>
<!-- /Footer--> 

<!--Back to top-->
<div id="back-top" class="back-top"> <a href="#top"><i class="fa fa-angle-up" aria-hidden="true"></i> </a> </div>
<!--/Back to top--> 

<%@ include file="loginAndRegister.jsp" %>

</body>

<script type="text/javascript">
/* $(function(){
	
	  /* $.ajax({
          url: 'GetImgServlet',
          type: 'get',
          data: {username:$("#username1").val()},
          dateType:"text",
          success: function (rs) {
          	if(rs!=""&&rs!='null'){
          		$("#UserImage").parent().css({"opacity":"0"});
          		var rs = "/imgs/"+rs;
	            	$("#imgs").attr("src", rs);
          	}
          }
      }); */
}) */
	
	$("#UserImage").change(function (e) {
		
        var file = e.target.files || e.dataTransfer.files;  //获取目标文件
        
        console.log(file[0])
        if (file) {   
        	 $("#UserImage").parent().css({"opacity":"0"});  
            var reader = new FileReader();   
            reader.onload = function () {
            	 
                $("#imgs").attr("src", this.result);
            };
            reader.readAsDataURL(file[0]);  
        }   
        
        var formdata = new FormData();
        formdata.append('username',$("#username1").val());
		formdata.append('head', $('#UserImage')[0].files[0]);
        $.ajax({
            url: 'User-Image',
            type: 'post',
            contentType: false,
            processData: false,
            data: formdata,
            success: function (data) {
               
            }
        });
  });

</script>

</html>
