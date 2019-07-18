<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购买账单</title>
<link>
</head>
<body>
	<%@ include file="head.jsp"%>
	<!-- 

Page Header
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
  Dark Overlay
  <div class="dark-overlay"></div>
</section>
/Page Header 

 -->

	<!--Profile-setting-->
	<section class="user_profile inner_pages">
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-sm-8">
				<div class="profile_wrap">
					<h5 class="uppercase underline">账单</h5>
					<form action="goodorder?vid=${param.vid}" method="get">
						<!-- 获取登录用户的id -->
						<input type="hidden" name="nowuserid" value="${user.userid}">
						<div class="form-group">
							<label class="control-label">账单号</label> <input
								class="form-control white_bg" id="billnum" type="text" name="billnum">
						</div>
						<div class="form-group">
							<label class="control-label">车辆ID</label> <input
								class="form-control white_bg" id="vid" type="text" name="vid"
								value="${param.vid}">
						</div>
						<div class="form-group">
							<label class="control-label">价格</label> <input
								class="form-control white_bg" id="price" type="text" name="price"
								value="${carbill.price }">
						</div>
						<div class="form-group">
							<label class="control-label">商品描述</label> <input
								class="form-control white_bg" id="des" type="text" name="des"
								value="${carbill.brand } ${carbill.model}  ${carbill.year}  ${carbill.newcar}${carbill.usedcar}">
						</div>
						<div class="form-group">
							<button type="submit" class="btn">
								确认支付 <span class="angle_arrow"> <i
									class="fa fa-angle-right" aria-hidden="true"></i>
								</span>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--/Profile-setting-->


	<!--Brands-->
	<%@ include file="popularbrands.jsp"%>
	<!-- /Brands-->

	<!--Footer -->
	<%@ include file="foot.jsp"%>
	<!-- /Footer-->

	<!--Back to top-->
	<div id="back-top" class="back-top">
		<a href="#top"><i class="fa fa-angle-up" aria-hidden="true"></i> </a>
	</div>
	<!--/Back to top-->

	<%@ include file="loginAndRegister.jsp"%>

</body>
<script type="text/javascript">
	function GetDateNow() {
		var vNow = new Date();
		var sNow = "";
		sNow += String(vNow.getFullYear());
		sNow += String(vNow.getMonth() + 1);
		sNow += String(vNow.getDate());
		sNow += String(vNow.getHours());
		sNow += String(vNow.getMinutes());
		sNow += String(vNow.getSeconds());
		sNow += String(vNow.getMilliseconds());
		document.getElementById("billnum").value = sNow;
		//document.getElementById("WIDsubject").value = "测试";
		//document.getElementById("WIDtotal_amount").value = "0.01";
	}

	GetDateNow();
</script>
</html>