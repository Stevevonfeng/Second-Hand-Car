<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <h1>Post a Vehicle</h1>
      </div>
      <ul class="coustom-breadcrumb">
        <li><a href="#">Home</a></li>
        <li>Post a Vehicle</li>
      </ul>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Page Header--> 

<!--Post-vehicle-->
<section class="user_profile inner_pages">
  <div class="container">
    <div class="user_profile_info gray-bg padding_4x4_40">
      <div class="upload_user_logo"> <img src="assets/images/dealer-logo.jpg" alt="image">
        <div class="upload_newlogo">
          <input name="upload" type="file">
        </div>
      </div>
      <div class="dealer_info">
        <h5>Autospot Used Cars Center </h5>
        <p>P.1225 N Broadway Ave <br>
          Oklahoma City, OK  1234-5678-090</p>
      </div>
    </div>
    <div class="row">
      <div class="col-md-3 col-sm-3">
        <div class="profile_nav">
          <ul>
            <li><a href="profile-settings.jsp">Profile Settings</a></li>
            <li><a href="my-vehicles.jsp">My Vehicles</a></li>
            <li class="active"><a href="post-vehicle.jsp">Post a Vehicles</a></li>
            <li><a href="#">Sign Out</a></li>
          </ul>
        </div>
      </div>
      <div class="col-md-6 col-sm-8">
        <div class="profile_wrap">
          <h5 class="uppercase underline">Post a New Vehicle</h5>
          
          
          
          <form action="PostCarServlet" method="post" enctype="multipart/form-data">
            <div class="form-group">
              <label class="control-label">Vehicles Title</label>
              <input class="form-control white_bg" name="vehiclestitle" id="VehiclesTitle" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Select Make</label>
              <div class="select">
                <select class="form-control white_bg" name="brand" id="brand">
                  <option value="Select Brand">Select Brand</option>
                  <option value="Audi">Audi</option>
                  <option value="BMW">BMW</option>
                  <option value="Nissan">Nissan</option>
                  <option value="Toyota">Toyota</option>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="control-label">Model</label>
              <div class="select">
                <select class="form-control white_bg" name="model" id="model">
                  <option value="Select Model">Select Model</option>
                  <option value="Model 2">Model 2</option>
                  <option value="Model 3">Model 3</option>
                  <option value="Model 4">Model 4</option>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="control-label">Vehicles Version</label>
              <div class="select">
                <select class="form-control white_bg" name="version" id="version">
                  <option value="">Version</option>
                  <option value="Version 1.1">Version 1.1</option>
                  <option value="Version 1.2">Version 1.2</option>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="control-label">Vehicle Overview  Description</label>
              <textarea class="form-control white_bg" rows="4" name="vod" id="vod"></textarea>
            </div>
            <div class="form-group">
              <label class="control-label">Price ($)</label>
              <input class="form-control white_bg" name="price" id="Price" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Upload Images  ( size = 900 x 560 )</label>
              <div class="vehicle_images">
              
                <!-- <div class="upload_more_img"> -->
                  <input name="upload" type="file">
                <!-- </div> -->
              </div>
            </div>
            <div class="gray-bg field-title">
              <h6>Basic Info</h6>
            </div>
            <div class="form-group">
              <label class="control-label">Model Year</label>
              <input class="form-control white_bg" name="year" id="year" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">No. of Owners</label>
              <input class="form-control white_bg" id="owners" name="owners" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">KMs Driven</label>
              <input class="form-control white_bg" id="kws" name="kms" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Fuel Type</label>
              <input class="form-control white_bg" id="fuel" name="fuel" type="text">
            </div>
            <div class="gray-bg field-title">
              <h6>Technical Specification</h6>
            </div>
            <div class="form-group">
              <label class="control-label">Engine Type</label>
              <input class="form-control white_bg" id="engien" name="engien" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Engine Description</label>
              <input class="form-control white_bg" id="engien-description" name="engiendescription" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">No. of Cylinders</label>
              <input class="form-control white_bg" id="cylinders" name="cylinders" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Mileage-City</label>
              <input class="form-control white_bg" id="mileage" name="mileage" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Mileage-Highway</label>
              <input class="form-control white_bg" id="mileage-h" name="mileage_h" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Fuel Tank Capacity</label>
              <input class="form-control white_bg" id="capacity" name="capacity" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Seating Capacity</label>
              <input class="form-control white_bg" id="s-capacity" name="s_capacity" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Transmission Type</label>
              <input class="form-control white_bg" id="Transmission" name="transmission" type="text">
            </div>
            <div class="gray-bg field-title">
              <h6>Accessories</h6>
            </div>
            <div class="vehicle_accessories">
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="air_conditioner" name="accessories" value="air_conditioner" type="checkbox">
                <label for="air_conditioner">Air Conditioner</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="door" name="accessories" value="door" type="checkbox">
                <label for="door">Power Door Locks</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="antiLock" name="accessories" value="antilock" type="checkbox">
                <label for="antiLock">AntiLock Braking System</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="brake" name="accessories" value="brake" type="checkbox">
                <label for="brake">Brake Assist</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="steering" name="accessories" value="steering" type="checkbox">
                <label for="steering">Power Steering</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="airbag" name="accessories" value="airbag" type="checkbox">
                <label for="airbag">Driver Airbag</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="windows" name="accessories" value="windows" type="checkbox">
                <label for="windows">Power Windows</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="passenger_airbag" name="accessories" value="passenger_airbag" type="checkbox">
                <label for="passenger_airbag">Passenger Airbag</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="player" name="accessories" value="player" type="checkbox">
                <label for="player">CD Player</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="sensor" name="accessories" value="sensor" type="checkbox">
                <label for="sensor">Crash Sensor</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="seats" name="accessories" value="seats" type="checkbox">
                <label for="seats">Leather Seats</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="engine_warning" name="accessories" value="engine_warning" type="checkbox">
                <label for="engine_warning">Engine Check Warning</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="locking" name="accessories" value="locking" type="checkbox">
                <label for="locking">Central Locking</label>
              </div>
              <div class="form-group checkbox col-md-6 accessories_list">
                <input id="headlamps" name="accessories" value="headlamps" type="checkbox">
                <label for="headlamps">Automatic Headlamps</label>
              </div>
            </div>
            <div class="vehicle_type">
              <div class="form-group radio col-md-6 accessories_list">
                <input type="radio" name="vehicle_type" value="newcar" id="newcar">
                <label for="newcar">New Car</label>
              </div>
              <div class="form-group radio col-md-6 accessories_list">
                <input type="radio" name="vehicle_type" value="usedcar" id="usedcar">
                <label for="usedcar">Used Car</label>
              </div>
            </div>
            <div class="form-group">
              <button type="submit" class="btn">Submit Vehicle <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</section>
<!--/Post-vehicle--> 

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
