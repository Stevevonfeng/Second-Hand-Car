<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
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
<section class="page-header listing_page">
  <div class="container">
    <div class="page-header_wrap">
      <div class="page-heading">
        <h1>汽车库存</h1>
      </div>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Page Header--> 

<!--Listing-->
<section class="listing-page">
  <div class="container">
    <div class="row">
    
    	<div class="col-md-9 col-md-push-3">
	  <div class="result-sorting-wrapper">
	    <div class="result-sorting-by">
	      <p>排序方式：</p>
	      <form action="#" method="post">
	        <div class="form-group select sorting-select">
	          <select class="form-control ">
	            <option>价格（从低到高）</option>
	            <option>价格（从高到低）</option>
	          </select>
	        </div>
	      </form>
	    </div>
	  </div>
	  
	  
	  <c:forEach items="${cars }" var="car">
	  
	  
	  <div class="product-listing-m gray-bg">

	    <div class="product-listing-img"> <a href="list?act=CarShow&vid=${car.vid }&brand=${car.brand}"><img src="/imgs/${car.vid }/${car.upload }" class="img-responsive" alt="Image" /> </a>

	      <div class="label_icon">${car.usedcar }${car.newcar }</div>
	      <div class="compare_item">
	        <div class="checkbox">
	          <input type="checkbox" id="${car.vid }" value="${car.vid }" <c:if test="${car.compare eq '1'}"> checked='checked' </c:if>  >
	          <label for="${car.vid }">Compare</label>
	          <script>
	          	$("#${car.vid }").change(function(){
	          		var id = "${car.vid }";
	          		var val = $("#"+id+"").is(":checked");
	          		if(val==true){
	          			$.ajax({
	          				type:"get",
	          				url:"ComparedServlet",
	          				data:{vid:id,compare:'1'}
	          			});
	          		}else{
	          			$.ajax({
	          				type:"get",
	          				url:"ComparedServlet",
	          				data:{vid:id,compare:'0'}
	          			});
	          		}
	          	});
	          </script>
	        </div>
	      </div>
	    </div>
	    <div class="product-listing-content">
	      <h5><a href="list?act=CarShow&vid=${car.vid }&brand=${car.brand}">Mazda CX-5 SX, V6, ABS, Sunroof</a></h5>
	      <p class="list-price">$${car.price }</p>
	      <ul>
	        <li><i class="fa fa-road" aria-hidden="true"></i>${car.kms }km</li>
	        <li><i class="fa fa-tachometer" aria-hidden="true"></i>${car.mileage }miles</li>
	        <li><i class="fa fa-user" aria-hidden="true"></i>${car.seats }seats</li>
	        <li><i class="fa fa-calendar" aria-hidden="true"></i>${car.model }model</li>
	        <li><i class="fa fa-car" aria-hidden="true"></i>${car.fuel }</li>
	        <li><i class="fa fa-superpowers" aria-hidden="true"></i>${car.brand }kW</li>
	      </ul>
	      <a href="list?act=CarShow&vid=${car.vid }&brand=${car.brand}" class="btn">查看详情 <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a>
	      <div class="car-location"><span><i class="fa fa-map-marker" aria-hidden="true"></i>${car.upload }</span></div>
	    </div>
	   
	  </div>
	  </c:forEach>
	  
	  <div class="pagination">
	  
		<c:if test="${cp!=null }">			
	    <ul>
	      <li <c:if test="${cp==1}"> class="disabled" </c:if> >
	      <a href="list?act=ListShow&cp=${cp-1<=0? 1:cp-1}">&laquo;</a>
	      </li>
	      
	      <c:forEach begin="1" end="${totalPage}" var="item">
			<li <c:if test="${item==cp }"> class="active" </c:if> >
				<a href="list?act=ListShow&cp=${item}">${item}</a>
			</li>
			</c:forEach>
	     <li <c:if test="${cp==totalPage}"> class="disabled" </c:if>>
			<a href="list?act=ListShow&cp=${cp+1>totalPage? totalPage:cp+1}">&raquo;</a>
		</li>
	    </ul>
	    </c:if>
	  </div>
	</div>
     
      
      <!--Side-Bar-->
      <aside class="col-md-3 col-md-pull-9">
 		<%@ include file="filter-left.jsp" %>
        
        <div class="sidebar_widget sell_car_quote">
          <div class="white-text div_zindex text-center">
            <h3>Sell Your Car</h3>
            <p>Request a quote and sell your car now!</p>
            <a href="#" class="btn">Request a Quote <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
          <div class="dark-overlay"></div>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5><i class="fa fa-car" aria-hidden="true"></i> Recently Listed Cars</h5>
          </div>
          <div class="recent_addedcars">
            <ul>
              <li class="gray-bg">
                <div class="recent_post_img"> <a href="#"><img src="assets/images/post_200x200_1.jpg" alt="image"></a> </div>
                <div class="recent_post_title"> <a href="#">Ford Shelby GT350</a>
                  <p class="widget_price">$92,000</p>
                </div>
              </li>
              <li class="gray-bg">
                <div class="recent_post_img"> <a href="#"><img src="assets/images/post_200x200_2.jpg" alt="image"></a> </div>
                <div class="recent_post_title"> <a href="#">BMW 535i</a>
                  <p class="widget_price">$92,000</p>
                </div>
              </li>
              <li class="gray-bg">
                <div class="recent_post_img"> <a href="#"><img src="assets/images/post_200x200_3.jpg" alt="image"></a> </div>
                <div class="recent_post_title"> <a href="#">Mazda CX-5 SX, V6, ABS, Sunroof </a>
                  <p class="widget_price">$92,000</p>
                </div>
              </li>
              <li class="gray-bg">
                <div class="recent_post_img"> <a href="#"><img src="assets/images/post_200x200_4.jpg" alt="image"></a> </div>
                <div class="recent_post_title"> <a href="#">Ford Shelby GT350 </a>
                  <p class="widget_price">$92,000</p>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </aside>
      <!--/Side-Bar--> 
    </div>
  </div>
</section>
<!-- /Listing--> 

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
<script>
	function click(a){
		alert(a);
	}
</script>
</html>
