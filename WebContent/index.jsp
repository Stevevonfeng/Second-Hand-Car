<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>汽车商城主页</title>
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

<!-- Banners -->
<section id="banner" class="banner-section">
  <div class="container">
    <div class="div_zindex">
      <div class="row">
        <div class="col-md-5 col-md-push-7">
          <div class="banner_content">
            <h1>Find the right car for you.</h1>
            <p>We have more than a thousand cars for you to choose. </p>
            <a href="#" class="btn">Read More <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Banners --> 

<!-- Filter-Form -->
<%@ include file = "filter.jsp" %> 
<!-- /Filter-Form --> 

<!-- About -->
<section class="about-us-section section-padding">
  <div class="container">
    <div class="section-header text-center">
      <h2>欢迎来到 <span>汽车商城</span></h2>
      <p>我们专业从事城市运力规划、服务运营、汽车贸易、平行进口汽车销售、汽车金融、网约车运营、新能源汽车、商用物流汽车、商用汽车租赁、新能源汽车充电站建设运营的全汽车产业链、城市运力运营商。全新商业模式加互联网平台运用、汽车、金融、商用汽车、新能源平台整合。致力于服务政府交通运输平台、零售客户、专业机构、为其提供优质的服务及整合方案、提升客户效能、效率、及运营收益实现共赢。我们的使命是：专业、高效、资源整合、创造新动能！ </p>
    </div>
    <div class="row">
      <div class="col-lg-6 col-sm-6">
        <div class="looking-car">
          <div class="looking-cat-image"> <img src="assets/images/looking-used-car.png" alt="Image" /> </div>
          <div class="looking-car-content">
            <h3>寻找 <span>二手车?</span></h3>
            <p>从海量好车中精选最优质车源，在线上线下集中展示售卖，打造线上线下一体的二手车交易闭环,为用户打造“闭着眼买好车”的二手车新零售体验。</p>
            <a href="" class="btn">查看列表<i class="fa fa-chevron-circle-right" aria-hidden="true"></i></a> </div>
        </div>
      </div>
      <div class="col-lg-6 col-sm-6">
        <div class="looking-car">
          <div class="looking-cat-image"> <img src="assets/images/looking-new-car.png" alt="Image" /> </div>
          <div class="looking-car-content">
            <h3>寻找 <span>新车?</span></h3>
            <p>品牌4S店驻店，销售打折特卖车型，客户直接跟4S店进行价格交互。各地的服务中心，在线下为客户提供异地运输、分期付款、汽车保险、上牌等一站式服务。</p>
            <a href="" class="btn">查看列表<i class="fa fa-chevron-circle-right" aria-hidden="true"></i></a> </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /About --> 

<!-- Resent Cat-->
<section class="section-padding gray-bg">
  <div class="container">
    <div class="section-header text-center">
      <h2><span>为您找到</span>最优惠的价格</h2>
      <p>为您提供全国汽车降价信息,包括各种品牌、车型及各地的汽车报价排行榜、汽车4S店降价信息,是您买到您心动的汽车首选网站。</p>
    </div>
    <div class="row"> 
      
      <!-- Nav tabs -->
      <div class="recent-tab">
        <ul class="nav nav-tabs" role="tablist">
          <li role="presentation" class="active"><a href="#resentnewcar" role="tab" data-toggle="tab">New Car</a></li>
          <li role="presentation"><a href="#resentusecar" role="tab" data-toggle="tab">Use Car</a></li>
        </ul>
      </div>
      <!-- Recently Listed New Cars -->
      <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="resentnewcar">
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-1.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare4">
                    <label for="compare4">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Ford Shelby GT350</a></h6>
                <span class="price">$45,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-2.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare5">
                    <label for="compare5">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">BMW 535i</a></h6>
                <span class="price">$20,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-3.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare6">
                    <label for="compare6">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Volvo v40</a></h6>
                <span class="price">$60,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-4.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare7">
                    <label for="compare7">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Audi TT RS</a></h6>
                <span class="price">$90,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-5.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare8">
                    <label for="compare8">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Audi A3</a></h6>
                <span class="price">$49,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-6.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare9">
                    <label for="compare9">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">BMW 535i</a></h6>
                <span class="price">$20,000</span> </div>
            </div>
          </div>
        </div>
        
        <!-- Recently Listed Used Cars -->
        <div role="tabpanel" class="tab-pane" id="resentusecar">
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-4.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare90">
                    <label for="compare9">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Audi TT RS</a></h6>
                <span class="price">$90,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-5.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare10">
                    <label for="compare10">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Audi A3</a></h6>
                <span class="price">$49,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-6.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare11">
                    <label for="compare11">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">BMW 535i</a></h6>
                <span class="price">$20,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-1.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare12">
                    <label for="compare12">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Ford Shelby GT350</a></h6>
                <span class="price">$45,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-2.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare13">
                    <label for="compare13">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">BMW 535i</a></h6>
                <span class="price">$20,000</span> </div>
            </div>
          </div>
          <div class="col-list-3">
            <div class="recent-car-list">
              <div class="car-info-box"> <a href="#"><img src="assets/images/recent-car-3.jpg" class="img-responsive" alt=""></a>
                <div class="compare_item">
                  <div class="checkbox">
                    <input type="checkbox" id="compare14">
                    <label for="compare14">Compare</label>
                  </div>
                </div>
                <ul>
                  <li><i class="fa fa-road" aria-hidden="true"></i>20,000 km</li>
                  <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 Model</li>
                  <li><i class="fa fa-map-marker" aria-hidden="true"></i>Colorado, USA</li>
                </ul>
              </div>
              <div class="car-title-m">
                <h6><a href="#">Volvo v40</a></h6>
                <span class="price">$60,000</span> </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Resent Cat --> 

<!-- Fun Facts-->
<section class="fun-facts-section">
  <div class="container div_zindex">
    <div class="row">
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-calendar" aria-hidden="true"></i>40+</h2>
            <p>年的商业经验</p>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-car" aria-hidden="true"></i>1200+</h2>
            <p>新车供您选择</p>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-car" aria-hidden="true"></i>1000+</h2>
            <p>二手车等你来拿</p>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-user-circle-o" aria-hidden="true"></i>600K+</h2>
            <p>满意客户</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Fun Facts--> 

<!--Featured Car-->
<section class="section-padding">
  <div class="container">
    <div class="section-header text-center">
      <h2>特色汽车 <span>特别优惠</span></h2>
      <p>爱看不看，爱买不买；好（豪）车霸气，错过难开! </p>
    </div>
    <div class="row">
      <div class="col-list-3">
        <div class="featured-car-list">
          <div class="featured-car-img"> <a href=""><img src="assets/images/featured-img-1.jpg" class="img-responsive" alt="Image"></a>
            <div class="label_icon">New</div>
            <div class="compare_item">
              <div class="checkbox">
                <input  type="checkbox" id="compare">
                <label for="compare">Compare</label>
              </div>
            </div>
          </div>
          <div class="featured-car-content">
            <h6><a href="#">Maserati QUATTROPORTE 1,6</a></h6>
            <div class="price_info">
              <p class="featured-price">$90,000</p>
              <div class="car-location"><span><i class="fa fa-map-marker" aria-hidden="true"></i> Colorado, USA</span></div>
            </div>
            <ul>
              <li><i class="fa fa-road" aria-hidden="true"></i>0,000 km</li>
              <li><i class="fa fa-tachometer" aria-hidden="true"></i>30.000 miles</li>
              <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 model</li>
              <li><i class="fa fa-car" aria-hidden="true"></i>Diesel</li>
              <li><i class="fa fa-user" aria-hidden="true"></i>5 seats</li>
              <li><i class="fa fa-superpowers" aria-hidden="true"></i>143 kW</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="col-list-3">
        <div class="featured-car-list">
          <div class="featured-car-img"> <a href=""><img src="assets/images/featured-img-2.jpg" class="img-responsive" alt="Image"></a>
            <div class="label_icon">Used</div>
            <div class="compare_item">
              <div class="checkbox">
                <input type="checkbox" id="compare2">
                <label for="compare2">Compare</label>
              </div>
            </div>
          </div>
          <div class="featured-car-content">
            <h6><a href="#">Mazda CX-5 SX, V6, ABS, Sunroof</a></h6>
            <div class="price_info">
              <p class="featured-price">$90,000</p>
              <div class="car-location"><span><i class="fa fa-map-marker" aria-hidden="true"></i> Colorado, USA</span></div>
            </div>
            <ul>
              <li><i class="fa fa-road" aria-hidden="true"></i>0,000 km</li>
              <li><i class="fa fa-tachometer" aria-hidden="true"></i>30.000 miles</li>
              <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 model</li>
              <li><i class="fa fa-car" aria-hidden="true"></i>Diesel</li>
              <li><i class="fa fa-user" aria-hidden="true"></i>5 seats</li>
              <li><i class="fa fa-superpowers" aria-hidden="true"></i>143 kW</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="col-list-3">
        <div class="featured-car-list">
          <div class="featured-car-img"> <a href=""><img src="assets/images/featured-img-3.jpg" class="img-responsive" alt="Image"></a>
            <div class="label_icon">Used</div>
            <div class="compare_item">
              <div class="checkbox">
                <input type="checkbox" id="compare3">
                <label for="compare3">Compare</label>
              </div>
            </div>
          </div>
          <div class="featured-car-content">
            <h6><a href="#">BMW 535i</a></h6>
            <div class="price_info">
              <p class="featured-price">$90,000</p>
              <div class="car-location"><span><i class="fa fa-map-marker" aria-hidden="true"></i> Colorado, USA</span></div>
            </div>
            <ul>
              <li><i class="fa fa-road" aria-hidden="true"></i>0,000 km</li>
              <li><i class="fa fa-tachometer" aria-hidden="true"></i>30.000 miles</li>
              <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 model</li>
              <li><i class="fa fa-car" aria-hidden="true"></i>Diesel</li>
              <li><i class="fa fa-user" aria-hidden="true"></i>5 seats</li>
              <li><i class="fa fa-superpowers" aria-hidden="true"></i>143 kW</li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Featured Car--> 

<!--Trending Car-->
<section class="section-padding gray-bg">
  <div class="container">
    <div class="section-header text-center">
      <h2>趋势 <span>年度最佳汽车</span></h2>
      <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. </p>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div id="trending_slider">
          <div class="trending-car-m">
            <div class="trending-car-img"> <img src="assets/images/trending-car-img-1.jpg" alt="Image" class="img-responsive" /> </div>
            <div class="trending-hover">
              <h4><a href="#">Ford Shelby GT350</a></h4>
            </div>
          </div>
          <div class="trending-car-m">
            <div class="trending-car-img"> <img src="assets/images/trending-car-img-2.jpg" alt="Image" class="img-responsive" /> </div>
            <div class="trending-hover">
              <h4><a href="#">Toyota Corolla</a></h4>
            </div>
          </div>
          <div class="trending-car-m">
            <div class="trending-car-img"> <img src="assets/images/trending-car-img-3.jpg" alt="Image" class="img-responsive" /> </div>
            <div class="trending-hover">
              <h4><a href="#">Volvo v40</a></h4>
            </div>
          </div>
          <div class="trending-car-m">
            <div class="trending-car-img"> <img src="assets/images/trending-car-img-1.jpg" alt="Image" class="img-responsive" /> </div>
            <div class="trending-hover">
              <h4><a href="#">Toyota Corolla</a></h4>
            </div>
          </div>
          <div class="trending-car-m">
            <div class="trending-car-img"> <img src="assets/images/trending-car-img-2.jpg" alt="Image" class="img-responsive" /> </div>
            <div class="trending-hover">
              <h4><a href="#">Mazda CX-5 SX, V6, ABS</a></h4>
            </div>
          </div>
          <div class="trending-car-m">
            <div class="trending-car-img"> <img src="assets/images/trending-car-img-3.jpg" alt="Image" class="img-responsive" /> </div>
            <div class="trending-hover">
              <h4><a href="#">BMW 535i</a></h4>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Trending Car--> 

<!--Testimonial -->
<section class="section-padding testimonial-section parallex-bg">
  <div class="container div_zindex">
    <div class="section-header white-text text-center">
      <h2>我们的满意<span>客户</span></h2>
      <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. </p>
    </div>
    <div class="row">
      <div id="testimonial-slider">
        <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-1.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Donald Brooks</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div>
        <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-2.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Enzo Giovanotelli</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div>
        <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-1.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Donald Brooks</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div>
        <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-2.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Enzo Giovanotelli</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div>
        <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-1.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Donald Brooks</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div>
        <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/testimonial-img-2.jpg" alt="" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5>Enzo Giovanotelli</h5>
              <span class="client-designation">CEO of xzy company</span> </div>
            <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt .</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Testimonial--> 

<!--Blog -->
<section class="section-padding">
  <div class="container">
    <div class="section-header text-center">
      <h2><span>汽车行业</span>最新动态</h2>
      <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. </p>
    </div>
    <div class="row">
      <div class="col-md-4 col-sm-4">
        <article class="blog-list">
          <div class="blog-info-box"> <a href="#"><img src="assets/images/recent-blog-1.jpg" class="img-responsive" alt="image"></a>
            <ul>
              <li><a href="#"><i class="fa fa-tags" aria-hidden="true"></i>Latest Cars</a></li>
              <li><i class="fa fa-calendar" aria-hidden="true"></i>15 Nov 2016</li>
              <li><a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>10 Comments</a></li>
            </ul>
          </div>
          <div class="blog-content">
            <h5><a href="#">But I must explain to you how all this mistaken idea.</a></h5>
            <p>expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because</p>
            <a href="#" class="btn-link">Read More <i class="fa fa-long-arrow-right" aria-hidden="true"></i></a> </div>
        </article>
      </div>
      <div class="col-md-4 col-sm-4">
        <article class="blog-list">
          <div class="blog-info-box"> <a href="#"><img src="assets/images/recent-blog-2.jpg" class="img-responsive" alt="image"></a>
            <ul>
              <li><a href="#"><i class="fa fa-tags" aria-hidden="true"></i>Latest Cars</a></li>
              <li><i class="fa fa-calendar" aria-hidden="true"></i>10 Nov 2016</li>
              <li><a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>21 Comments</a></li>
            </ul>
          </div>
          <div class="blog-content">
            <h5><a href="#">On the other hand, we denounce with righteous indignation.</a></h5>
            <p>expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because</p>
            <a href="#" class="btn-link">Read More <i class="fa fa-long-arrow-right" aria-hidden="true"></i></a> </div>
        </article>
      </div>
      <div class="col-md-4 col-sm-4">
        <article class="blog-list">
          <div class="blog-info-box"> <a href="#"><img src="assets/images/recent-blog-3.jpg" class="img-responsive" alt="image"></a>
            <ul>
              <li><a href="#"><i class="fa fa-tags" aria-hidden="true"></i>Latest Cars</a></li>
              <li><i class="fa fa-calendar" aria-hidden="true"></i>05 Nov 2016</li>
              <li><a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>18 Comments</a></li>
            </ul>
          </div>
          <div class="blog-content">
            <h5><a href="#">Sed ut perspiciatis unde omnis iste natus error sit voluptatem.</a></h5>
            <p>expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because</p>
            <a href="#" class="btn-link">Read More <i class="fa fa-long-arrow-right" aria-hidden="true"></i></a> </div>
        </article>
      </div>
    </div>
  </div>
</section>
<!-- /Blog--> 

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
