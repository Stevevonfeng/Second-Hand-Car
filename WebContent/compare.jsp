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
<section class="page-header compare_page">
  <div class="container">
    <div class="page-header_wrap">
      <div class="page-heading">
        <h1>Compare Inventorys</h1>
      </div>
      <ul class="coustom-breadcrumb">
        <li><a href="#">Home</a></li>
        <li>Compare Inventorys</li>
      </ul>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Page Header--> 

<!-- Filter-Form -->
<section id="filter_form" class="inner-filter gray-bg">
  <div class="container">
    <h3>Find Your Dream Car <span>(Easy search from here)</span></h3>
    <div class="row">
      <form action="#" method="get">
        <div class="form-group col-md-3 col-sm-6 black_input">
          <div class="select">
            <select class="form-control">
              <option value="">Select Location </option>
              <option value="">Location 1 </option>
              <option value="">Location 1 </option>
            </select>
          </div>
        </div>
        <div class="form-group col-md-3 col-sm-6 black_input">
          <div class="select">
            <select class="form-control">
              <option>Select Brand</option>
              <option>Audi</option>
              <option>BMW</option>
              <option>Nissan</option>
              <option>Toyota</option>
            </select>
          </div>
        </div>
        <div class="form-group col-md-3 col-sm-6 black_input">
          <div class="select">
            <select class="form-control">
              <option>Select Model</option>
              <option>Series 1</option>
              <option>Series 2</option>
              <option>Series 3</option>
            </select>
          </div>
        </div>
        <div class="form-group col-md-3 col-sm-6 black_input">
          <div class="select">
            <select class="form-control">
              <option>Year of Model </option>
              <option>2016</option>
              <option>2015</option>
              <option>2014</option>
            </select>
          </div>
        </div>
        <div class="form-group col-md-6 col-sm-6 black_input">
          <label class="form-label">Price Range ($)</label>
          <input id="price_range" type="text" class="span2" value="" data-slider-min="50" data-slider-max="6000" data-slider-step="5" data-slider-value="[1000,5000]"/>
        </div>
        <div class="form-group col-md-3 col-sm-6 black_input">
          <div class="select">
            <select class="form-control">
              <option>Type of Car </option>
              <option>New Car</option>
              <option>Used Car</option>
            </select>
          </div>
        </div>
        <div class="form-group col-md-3 col-sm-6">
          <button type="submit" class="btn btn-block"><i class="fa fa-search" aria-hidden="true"></i> Search Car </button>
        </div>
      </form>
    </div>
  </div>
</section>
<!-- /Filter-Form --> 

<!--Compare-->
<section class="compare-page inner_pages">
  <div class="container">
    <div class="compare_info">
      <h4>Compare Hyundai Elantra 1.6 SX and Ford Figo 1.5D Base MT and Hyundai Elantra 2.0 SX</h4>
      <div class="compare_product_img">
        <div class="inventory_info_list">
          <ul>
            <li id="filter_toggle" class="search_other_inventory"><i class="fa fa-search" aria-hidden="true"></i> Search Other Inventory</li>
            <li><a href="#"><img src="assets/images/recent-car-2.jpg" alt="image"></a></li>
            <li><a href="#"><img src="assets/images/recent-car-3.jpg" alt="image"></a></li>
            <li><a href="#"><img src="assets/images/recent-car-4.jpg" alt="image"></a></li>
          </ul>
        </div>
        <table>
          <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
        </table>
      </div>
      <div class="compare_product_title gray-bg">
        <div class="inventory_info_list">
          <ul>
            <li class="listing_heading">Compare <br>
              Inventorys <span class="td_divider"></span></li>
            <li><a href="#">Hyundai Elantra 1.6 SX</a>
              <p class="price">$90,000</p>
              <span class="vs">V/s</span></li>
            <li><a href="#">Ford Figo 1.5D Base MT</a>
              <p class="price">$85,000</p>
              <span class="vs">V/s</span></li>
            <li><a href="#">Hyundai Elantra 2.0 SX</a>
              <p class="price">$75,000</p>
            </li>
          </ul>
        </div>
      </div>
      <div class="compare_product_info"> 
        <!--Basic-Info-Table-->
        <div class="inventory_info_list">
          <div class="listing_heading">
            <div>BASIC INFO</div>
            <div>&nbsp;</div>
            <div>&nbsp;</div>
            <div>&nbsp;</div>
          </div>
          <ul>
            <li class="info_heading">
              <div>Model Year</div>
              <div>No. of Owners</div>
              <div>KMs Driven</div>
              <div>Fuel Type</div>
            </li>
            <li>
              <div>2010</div>
              <div>4</div>
              <div>30,000</div>
              <div>Diesel</div>
            </li>
            <li>
              <div>2005</div>
              <div>2</div>
              <div>55,000</div>
              <div>Diesel</div>
            </li>
            <li>
              <div>2010</div>
              <div>1</div>
              <div>95,000</div>
              <div>Diesel</div>
            </li>
          </ul>
        </div>
        
        <!--Technical-Specification-Table-->
        <div class="inventory_info_list">
          <div class="listing_heading">
            <div>Technical Specification</div>
            <div>&nbsp;</div>
            <div>&nbsp;</div>
            <div>&nbsp;</div>
          </div>
          <ul>
            <li class="info_heading">
              <div>Engine Type</div>
              <div>Engine Description</div>
              <div>No. of Cylinders</div>
              <div>Mileage-City</div>
              <div>Mileage-Highway</div>
              <div>Fuel Tank Capacity</div>
              <div>Seating Capacity</div>
              <div>Transmission Type</div>
            </li>
            <li>
              <div>TDCI Diesel Engine</div>
              <div>1.5KW</div>
              <div>4</div>
              <div>22.4kmpl</div>
              <div>25.83kmpl</div>
              <div>40 (Liters)</div>
              <div>5</div>
              <div>Manual</div>
            </li>
            <li>
              <div>TDCI Diesel Engine</div>
              <div>1.9KW</div>
              <div>5</div>
              <div>32.4kmpl</div>
              <div>48.83kmpl</div>
              <div>60 (Liters)</div>
              <div>5</div>
              <div>Automatic</div>
            </li>
            <li>
              <div>TDCI Diesel Engine</div>
              <div>1.6KW</div>
              <div>6</div>
              <div>21.4kmpl</div>
              <div>28.83kmpl</div>
              <div>42 (Liters)</div>
              <div>6</div>
              <div>Manual</div>
            </li>
          </ul>
        </div>
        
        <!--Accessories-->
        <div class="inventory_info_list">
          <div class="listing_heading">
            <div>Accessories</div>
            <div>&nbsp;</div>
            <div>&nbsp;</div>
            <div>&nbsp;</div>
          </div>
          <ul>
            <li class="info_heading">
              <div>Air Conditioner</div>
              <div>AntiLock Braking System</div>
              <div>Power Steering</div>
              <div>Power Windows</div>
              <div>CD Player</div>
              <div>Leather Seats</div>
              <div>Central Locking</div>
              <div>Power Door Locks</div>
              <div>Brake Assist</div>
              <div>Driver Airbag</div>
              <div>Passenger Airbag</div>
              <div>Crash Sensor</div>
              <div>Engine Check Warning</div>
              <div>Automatic Headlamps</div>
            </li>
            <li>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
            </li>
            <li>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-close" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
            </li>
            <li>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-close" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-close" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-close" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
              <div><i class="fa fa-check" aria-hidden="true"></i></div>
            </li>
          </ul>
        </div>
        <div class="inventory_info_list text-center">
          <ul>
            <li>&nbsp;</li>
            <li><a href="#" class="btn">View Detail</a></li>
            <li><a href="#" class="btn">View Detail</a></li>
            <li><a href="#" class="btn">View Detail</a></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</section>
<!--/Compare--> 

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
