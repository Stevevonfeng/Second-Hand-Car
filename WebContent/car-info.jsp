<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购买账单</title>
<link >
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
					<h5 class="uppercase underline">订单信息</h5>
					<form action="index.jsp" method="get">
						<div class="form-group">
							<label class="control-label">车辆ID</label> 
							<input class="form-control white_bg" id="vid" type="text" value="${param.vid}">
						</div>
						<div class="form-group">
							<label class="control-label">品牌</label> 
							<input class="form-control white_bg" id="brand" type="text" value="${car.brand}">
						</div>
						<div class="form-group">
							<label class="control-label">车型</label> 
							<input class="form-control white_bg" id="model" type="text" value="${car.model}">
						</div>
						<div class="form-group">
							<label class="control-label">生产年日</label> 
							<input class="form-control white_bg" id="year" type="text" value="${car.year}">
						</div>
						<div class="form-group">
							<label class="control-label">用油类型</label> 
							<input class="form-control white_bg" id="fuel" type="text" value="${car.fuel}">
						</div>
						<div class="form-group">
							<label class="control-label">新/旧车</label>
							<input class="form-control white_bg" id="carNO" type="text" value="${car.newcar}${car.usedcar}">
						</div>
						<div class="form-group">
							<label class="control-label">价格</label> 
							<input class="form-control white_bg" id="price" type="text" value="${car.price}">
						</div>
						<div class="form-group">
							<button type="submit" class="btn">确认支付 
								<span class="angle_arrow">
									<i class="fa fa-angle-right" aria-hidden="true"></i>
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
</html>