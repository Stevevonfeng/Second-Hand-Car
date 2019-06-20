<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<section class="page-header blog_page">
  <div class="container">
    <div class="page-header_wrap">
      <div class="page-heading">
        <h1>Our Blog</h1>
      </div>
      <ul class="coustom-breadcrumb">
        <li><a href="#">Home</a></li>
        <li>Our Blog</li>
      </ul>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Page Header--> 

<!--Our-Blog-->
<section class="our_blog">
  <div class="container">
    <div class="row">
      <div class="col-lg-9 col-md-8"> 
        <!--article-1-->
        <article class="article_wrap">
          <div class="article_img"> <a href="#"><img src="assets/images/blog_img1.jpg" alt="image"></a>
            <div class="articale_header">
              <h2><a href="#">Lorem Ipsum is simply dummy text.</a></h2>
              <div class="article_meta">
                <ul>
                  <li><i class="fa fa-user-circle-o" aria-hidden="true"></i> <a href="#">Admin</a></li>
                  <li><i class="fa fa-calendar-check-o" aria-hidden="true"></i> 20 Nov 2016</li>
                  <li><i class="fa fa-tags" aria-hidden="true"></i> <a href="#">General</a>, <a href="#">Business</a></li>
                  <li><i class="fa fa-comment" aria-hidden="true"></i> <a href="#">10 Comments</a></li>
                  <li><i class="fa fa-eye" aria-hidden="true"></i> <a href="#">205 Views</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="article_info">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            <a href="#" class="btn">Read More <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
        </article>
        
        <!--article-2-->
        <article class="article_wrap">
          <div class="article_img"> <a href="#"><img src="assets/images/blog_img2.jpg" alt="image"></a>
            <div class="articale_header">
              <h2><a href="#">There are many variations of passages.</a></h2>
              <div class="article_meta">
                <ul>
                  <li><i class="fa fa-user-circle-o" aria-hidden="true"></i> <a href="#">Admin</a></li>
                  <li><i class="fa fa-calendar-check-o" aria-hidden="true"></i> 20 Nov 2016</li>
                  <li><i class="fa fa-tags" aria-hidden="true"></i> <a href="#">General</a>, <a href="#">Business</a></li>
                  <li><i class="fa fa-comment" aria-hidden="true"></i> <a href="#">10 Comments</a></li>
                  <li><i class="fa fa-eye" aria-hidden="true"></i> <a href="#">205 Views</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="article_info">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            <a href="#" class="btn">Read More <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
        </article>
        
        <!--article-3-->
        <article class="article_wrap">
          <div class="article_img"> <a href="#"><img src="assets/images/blog_img3.jpg" alt="image"></a>
            <div class="articale_header">
              <h2><a href="#">Mazda CX-5 SX, V6, ABS, Sunroof </a></h2>
              <div class="article_meta">
                <ul>
                  <li><i class="fa fa-user-circle-o" aria-hidden="true"></i> <a href="#">Admin</a></li>
                  <li><i class="fa fa-calendar-check-o" aria-hidden="true"></i> 20 Nov 2016</li>
                  <li><i class="fa fa-tags" aria-hidden="true"></i> <a href="#">General</a>, <a href="#">Business</a></li>
                  <li><i class="fa fa-comment" aria-hidden="true"></i> <a href="#">10 Comments</a></li>
                  <li><i class="fa fa-eye" aria-hidden="true"></i> <a href="#">205 Views</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="article_info">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            <a href="#" class="btn">Read More <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
        </article>
        
        <!--article-4-->
        <article class="article_wrap">
          <div class="article_img"> <a href="#"><img src="assets/images/blog_img4.jpg" alt="image"></a>
            <div class="articale_header">
              <h2><a href="#">The standard chunk of Lorem Ipsum.</a></h2>
              <div class="article_meta">
                <ul>
                  <li><i class="fa fa-user-circle-o" aria-hidden="true"></i> <a href="#">Admin</a></li>
                  <li><i class="fa fa-calendar-check-o" aria-hidden="true"></i> 20 Nov 2016</li>
                  <li><i class="fa fa-tags" aria-hidden="true"></i> <a href="#">General</a>, <a href="#">Business</a></li>
                  <li><i class="fa fa-comment" aria-hidden="true"></i> <a href="#">10 Comments</a></li>
                  <li><i class="fa fa-eye" aria-hidden="true"></i> <a href="#">205 Views</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="article_info">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            <a href="#" class="btn">Read More <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
        </article>
        <div class="pagination">
          <ul>
            <li class="current">1</li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
          </ul>
        </div>
      </div>
      
      <!--Side-bar-->
      <aside class="col-lg-3 col-md-4">
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5>Search Blog</h5>
          </div>
          <div class="blog_search">
            <form action="#" method="get">
              <input class="form-control" name="#" type="text" placeholder="Search...">
              <button type="submit" class="search_btn"><i class="fa fa-search" aria-hidden="true"></i></button>
            </form>
          </div>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5>Popular Posts</h5>
          </div>
          <div class="popular_post">
            <ul>
              <li>
                <div class="popular_post_img"> <a href="#"><img src="assets/images/post_200x200_1.jpg" alt="image"></a> </div>
                <div class="popular_post_title"> <a href="#">At vero eos et accusamus et iusto odio dignissimos.</a> </div>
              </li>
              <li>
                <div class="popular_post_img"> <a href="#"><img src="assets/images/post_200x200_2.jpg" alt="image"></a> </div>
                <div class="popular_post_title"> <a href="#">On the other hand, we denounce with righteous.</a> </div>
              </li>
              <li>
                <div class="popular_post_img"> <a href="#"><img src="assets/images/post_200x200_3.jpg" alt="image"></a> </div>
                <div class="popular_post_title"> <a href="#">But I must explain to you how all this mistaken idea.</a> </div>
              </li>
              <li>
                <div class="popular_post_img"> <a href="#"><img src="assets/images/post_200x200_4.jpg" alt="image"></a> </div>
                <div class="popular_post_title"> <a href="#">Nor again is there anyone who loves or pursues.</a> </div>
              </li>
            </ul>
          </div>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5>Categories</h5>
          </div>
          <div class="categories_list">
            <ul>
              <li><a href="#">Trends</a></li>
              <li><a href="#">The Works</a></li>
              <li><a href="#">Hand Wash</a></li>
              <li><a href="#">General</a></li>
              <li><a href="#">Business</a></li>
              <li><a href="#">Auto Detail</a></li>
              <li><a href="#">Motorbikes</a></li>
              <li><a href="#">Compacts</a></li>
              <li><a href="#">Vans & Trucks</a></li>
              <li><a href="#">Buy a car</a></li>
              <li><a href="#">Sell your Car</a></li>
              <li><a href="#">Car Land</a></li>
              <li><a href="#">Car Showrooms</a></li>
            </ul>
          </div>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5>Tag Widget</h5>
          </div>
          <div class="tag_list">
            <ul>
              <li><a href="#">Trends</a></li>
              <li><a href="#">The Works</a></li>
              <li><a href="#">Auto Detail</a></li>
              <li><a href="#">Motorbikes</a></li>
              <li><a href="#">Compacts</a></li>
              <li><a href="#">Buy a car</a></li>
              <li><a href="#">Vans & Trucks</a></li>
              <li><a href="#">Car Land</a></li>
              <li><a href="#">Sell your Car</a></li>
              <li><a href="#">Sedans</a></li>
            </ul>
          </div>
        </div>
      </aside>
      <!--/Side-bar--> 
      
    </div>
  </div>
</section>
<!-- /Our-Blog--> 

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
</html>
