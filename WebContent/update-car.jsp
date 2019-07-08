<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title></title>
<script src="assets/js/jquery.min.js"></script>
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
  <div class="container">
	 <div class="col-md-6 col-sm-8">
        <div class="profile_wrap">
          <h5 class="uppercase underline">Post a New Vehicle</h5>   
          <form action="UpdateCar" method="post" enctype="multipart/form-data">
          
 
              <input type="hidden" id="vid" name="vid" value="${param.vid}">
              <input type="hidden" id="filename" name="filename" value="${param.filename}">
           
            <div class="form-group">
              <label class="control-label">Vehicles Title</label>
              <input class="form-control white_bg" name="vehiclestitle" id="vehiclestitle" type="text">
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
              <input class="form-control white_bg" name="price" id="price" type="text">
            </div>
            
            <div class="vehicle_img" id="carimg">
            	
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
              <input class="form-control white_bg" id="kms" name="kms" type="text">
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
              <input class="form-control white_bg" id="engiendescription" name="engiendescription" type="text">
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
              <input class="form-control white_bg" id="mileage_h" name="mileage_h" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Fuel Tank Capacity</label>
              <input class="form-control white_bg" id="capacity" name="capacity" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Seating Capacity</label>
              <input class="form-control white_bg" id="s_capacity" name="s_capacity" type="text">
            </div>
            <div class="form-group">
              <label class="control-label">Transmission Type</label>
              <input class="form-control white_bg" id="transmission" name="transmission" type="text">
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
              <button type="submit" class="btn">修 改<span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></button>
            </div>
          </form>
        </div>
      </div>
      </div>
</body>
<script type="text/javascript">
$(function(){                
	$.ajax({
		type:"get",
		url:"FindServlet",
		data:{vid:$("#vid").val()},
		dataType:"json",
		success:function(rs){
			$('#vid').val(rs.vid);
			$('#vehiclestitle').val(rs.vehiclestitle);
			$('#brand').val(rs.brand);
			$('#model').val(rs.model);
			$('#version').val(rs.version);
			$('#vod').val(rs.vod);
			$('#price').val(rs.price);
			//$('#carimg').append("<img src='dbimgs/"+rs.upload+"'>");
			$('#userid').val(rs.userid);
			$('#year').val(rs.year);
			$('#owners').val(rs.owners);
			$('#kms').val(rs.kms);
			$('#fuel').val(rs.fuel);
			$('#engien').val(rs.engien);
			$('#engiendescription').val(rs.engiendescription);
			$('#cylinders').val(rs.cylinders);
			$('#mileage').val(rs.mileage);
			$('#mileage_h').val(rs.mileage_h);
			$('#capacity').val(rs.capacity);
			$('#s_capacity').val(rs.s_capacity);
			$('#transmission').val(rs.transmission);
			if(rs.air_conditioner!=null){
				$('#air_conditioner').attr("checked","checked");
			}if(rs.door!=null){
				$('#door').attr("checked","checked");
			}if(rs.antilock!=null){
				$('#antilock').attr("checked","checked");
			}if(rs.brake!=null){
				$('#brake').attr("checked","checked");
			}if(rs.steering!=null){
				$('#steering').attr("checked","checked");
			}if(rs.airbag!=null){
				$('#airbag').attr("checked","checked");
			}if(rs.windows!=null){
				$('#windows').attr("checked","checked");
			}if(rs.passenger_airbag!=null){
				$('#passenger_airbag').attr("checked","checked");
			}if(rs.player!=null){
				$('#player').attr("checked","checked");
			}if(rs.sensor!=null){
				$('#sensor').attr("checked","checked");
			}if(rs.seats!=null){
				$('#seats').attr("checked","checked");
			}if(rs.engine_warning!=null){
				$('#engine_warning').attr("checked","checked");
			}if(rs.locking!=null){
				$('#locking').attr("checked","checked");
			}if(rs.headlamps!=null){
				$('#headlamps').attr("checked","checked");
			}if(rs.newcar!=null){
				$('#newcar').attr("checked","checked");
			}if(rs.usedcar!=null){
				$('#usedcar').attr("checked","checked");
			}
		}
	});	
})
</script>
</html>