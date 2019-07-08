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
<link rel="stylesheet" href="assets/css/bootstrap.min.css"
	type="text/css">
<!--Custome Style -->
<link rel="stylesheet" href="assets/css/style.css" type="text/css">
<!--OWL Carousel slider-->
<link rel="stylesheet" href="assets/css/owl.carousel.css"
	type="text/css">
<link rel="stylesheet" href="assets/css/owl.transitions.css"
	type="text/css">
<!--slick-slider -->
<link href="assets/css/slick.css" rel="stylesheet">
<!--bootstrap-slider -->
<link href="assets/css/bootstrap-slider.min.css" rel="stylesheet">
<!--FontAwesome Font Style -->
<link href="assets/css/font-awesome.min.css" rel="stylesheet">

<!-- SWITCHER -->
<link rel="stylesheet" id="switcher-css" type="text/css"
	href="assets/switcher/css/switcher.css" media="all" />
<link rel="alternate stylesheet" type="text/css"
	href="assets/switcher/css/red.css" title="red" media="all"
	data-default-color="true" />
<link rel="alternate stylesheet" type="text/css"
	href="assets/switcher/css/orange.css" title="orange" media="all" />
<link rel="alternate stylesheet" type="text/css"
	href="assets/switcher/css/blue.css" title="blue" media="all" />
<link rel="alternate stylesheet" type="text/css"
	href="assets/switcher/css/pink.css" title="pink" media="all" />
<link rel="alternate stylesheet" type="text/css"
	href="assets/switcher/css/green.css" title="green" media="all" />
<link rel="alternate stylesheet" type="text/css"
	href="assets/switcher/css/purple.css" title="purple" media="all" />

<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="assets/images/favicon-icon/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="assets/images/favicon-icon/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="assets/images/favicon-icon/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/images/favicon-icon/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="assets/images/favicon-icon/favicon.png">
<!-- Google-Font-->
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900"
	rel="stylesheet">
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
			<div class="demo-icon customBgColor">
				<i class="fa fa-cog fa-spin fa-2x"></i>
			</div>
			<div class="form_holder">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="predefined_styles">
							<div class="skin-theme-switcher">
								<h4>Color</h4>
								<a href="#" data-switchcolor="red" class="styleswitch"
									style="background-color: #de302f;"> </a> <a href="#"
									data-switchcolor="orange" class="styleswitch"
									style="background-color: #f76d2b;"> </a> <a href="#"
									data-switchcolor="blue" class="styleswitch"
									style="background-color: #228dcb;"> </a> <a href="#"
									data-switchcolor="pink" class="styleswitch"
									style="background-color: #FF2761;"> </a> <a href="#"
									data-switchcolor="green" class="styleswitch"
									style="background-color: #2dcc70;"> </a> <a href="#"
									data-switchcolor="purple" class="styleswitch"
									style="background-color: #6054c2;"> </a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /Switcher -->

	<!--Header-->
	<%@ include file="head.jsp"%>
	<!-- /Header -->

	<!--Listing-Image-Slider-->
	<section id="listing_img_slider">
		<div>
			<img src="assets/images/listing_img1.jpg" class="img-responsive"
				alt="image">
		</div>
		<div>
			<img src="assets/images/listing_img2.jpg" class="img-responsive"
				alt="image">
		</div>
		<div>
			<img src="assets/images/listing_img3.jpg" class="img-responsive"
				alt="image">
		</div>
		<div>
			<img src="assets/images/listing_img4.jpg" class="img-responsive"
				alt="image">
		</div>
		<div>
			<img src="assets/images/listing_img5.jpg" class="img-responsive"
				alt="image">
		</div>
		<div>
			<img src="assets/images/listing_img1.jpg" class="img-responsive"
				alt="image">
		</div>
	</section>
	<!--/Listing-Image-Slider-->

	<section class="listing_other_info secondary-bg">
		<div class="container">
			<div id="filter_toggle" class="search_other">
				<i class="fa fa-filter" aria-hidden="true"></i> Search Car
			</div>
			<div id="other_info">
				<i class="fa fa-info-circle" aria-hidden="true"></i>
			</div>
			<div id="info_toggle">
				<button type="button" data-toggle="modal" data-target="#schedule">
					<i class="fa fa-car" aria-hidden="true"></i> Schedule Test Drive
				</button>
				<button type="button" data-toggle="modal" data-target="#make_offer">
					<i class="fa fa-money" aria-hidden="true"></i> Make an Offer
				</button>
				<button type="button" data-toggle="modal"
					data-target="#email_friend">
					<i class="fa fa-envelope" aria-hidden="true"></i> Email to a Friend
				</button>
				<button type="button" data-toggle="modal" data-target="#more_info">
					<i class="fa fa-file-text-o" aria-hidden="true"></i> Request More
					Info
				</button>
			</div>
		</div>
	</section>

	<!-- Filter-Form -->
	<section id="filter_form" class="inner-filter gray-bg">
		<div class="container">
			<h3>
				Find Your Dream Car <span>(Easy search from here)</span>
			</h3>
			<div class="row">
				<form action="#" method="get">
					<div class="form-group col-md-3 col-sm-6 black_input">
						<div class="select">
							<select class="form-control">
								<option value="">Select Location</option>
								<option value="">Location 1</option>
								<option value="">Location 1</option>
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
								<option>Year of Model</option>
								<option>2016</option>
								<option>2015</option>
								<option>2014</option>
							</select>
						</div>
					</div>
					<div class="form-group col-md-6 col-sm-6 black_input">
						<label class="form-label">Price Range ($)</label> <input
							id="price_range" type="text" class="span2" value=""
							data-slider-min="50" data-slider-max="6000" data-slider-step="5"
							data-slider-value="[1000,5000]" />
					</div>
					<div class="form-group col-md-3 col-sm-6 black_input">
						<div class="select">
							<select class="form-control">
								<option>Type of Car</option>
								<option>New Car</option>
								<option>Used Car</option>
							</select>
						</div>
					</div>
					<div class="form-group col-md-3 col-sm-6">
						<button type="submit" class="btn btn-block">
							<i class="fa fa-search" aria-hidden="true"></i> Search Car
						</button>
					</div>
				</form>
			</div>
		</div>
	</section>
	<!-- /Filter-Form -->

	<!--Listing-detail-->
	<section class="listing-detail">
		<div class="container">
			<div class="listing_detail_head row">
				<div class="col-md-9">
					<h2>BMW 535i, Navi, Leather, ABS</h2>
					<div class="car-location">
						<span><i class="fa fa-map-marker" aria-hidden="true"></i>
							12250 F Garvey Ave South West Covina, CA 91791</span>
					</div>
				</div>
				<div class="col-md-3">
					<div class="price_info">
						<p>$90,000</p>
						<p class="old_price">$95,000</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-9">
					<div class="main_features">
						<ul>
							<li><i class="fa fa-tachometer" aria-hidden="true"></i>
								<h5>13,000</h5>
								<p>Total Kilometres</p></li>
							<li><i class="fa fa-calendar" aria-hidden="true"></i>
								<h5>2010</h5>
								<p>Reg.Year</p></li>
							<li><i class="fa fa-cogs" aria-hidden="true"></i>
								<h5>Diesel</h5>
								<p>Fuel Type</p></li>
							<li><i class="fa fa-power-off" aria-hidden="true"></i>
								<h5>Automatic</h5>
								<p>Transmission</p></li>
							<li><i class="fa fa-superpowers" aria-hidden="true"></i>
								<h5>153KW</h5>
								<p>Engine</p></li>
							<li><i class="fa fa-user-plus" aria-hidden="true"></i>
								<h5>5</h5>
								<p>Seats</p></li>
						</ul>
					</div>
					<div class="listing_more_info">
						<div class="listing_detail_wrap">
							<!-- Nav tabs -->
							<ul class="nav nav-tabs gray-bg" role="tablist">
								<li role="presentation" class="active"><a
									href="#vehicle-overview " aria-controls="vehicle-overview"
									role="tab" data-toggle="tab">Vehicle Overview </a></li>
								<li role="presentation"><a href="#specification"
									aria-controls="specification" role="tab" data-toggle="tab">Technical
										Specification</a></li>
								<li role="presentation"><a href="#accessories"
									aria-controls="accessories" role="tab" data-toggle="tab">Accessories</a></li>
							</ul>

							<!-- Tab panes -->
							<div class="tab-content">
								<!-- vehicle-overview -->
								<div role="tabpanel" class="tab-pane active"
									id="vehicle-overview">
									<h4>What is Lorem Ipsum?</h4>
									<p>There are many variations of passages of Lorem Ipsum
										available, but the majority have suffered alteration in some
										form, by injected humour, or randomised words which don't look
										even slightly believable. If you are going to use a passage of
										Lorem Ipsum, you need to be sure there isn't anything
										embarrassing hidden in the middle of text. All the Lorem Ipsum
										generators on the Internet tend to repeat predefined chunks as
										necessary, making this the first true generator on the
										Internet. It uses a dictionary of over 200 Latin words,
										combined with a handful of model sentence structures, to
										generate Lorem Ipsum which looks reasonable.</p>
									<p>Lorem Ipsum is simply dummy text of the printing and
										typesetting industry. Lorem Ipsum has been the industry's
										standard dummy text ever since the 1500s, when an unknown
										printer took a galley of type and scrambled it to make a type
										specimen book. It has survived not only five centuries, but
										also the leap into electronic typesetting, remaining
										essentially unchanged.</p>
									<h4>What is Lorem Ipsum?</h4>
									<p>There are many variations of passages of Lorem Ipsum
										available, but the majority have suffered alteration in some
										form, by injected humour, or randomised words which don't look
										even slightly believable. If you are going to use a passage of
										Lorem Ipsum, you need to be sure there isn't anything
										embarrassing hidden in the middle of text. All the Lorem Ipsum
										generators on the Internet tend to repeat predefined chunks as
										necessary, making this the first true generator on the
										Internet. It uses a dictionary of over 200 Latin words,
										combined with a handful of model sentence structures, to
										generate Lorem Ipsum which looks reasonable.</p>
								</div>

								<!-- Technical-Specification -->
								<div role="tabpanel" class="tab-pane" id="specification">
									<div class="table-responsive">
										<!--Basic-Info-Table-->
										<table>
											<thead>
												<tr>
													<th colspan="2">BASIC INFO</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>Model Year</td>
													<td>2010</td>
												</tr>
												<tr>
													<td>No. of Owners</td>
													<td>4</td>
												</tr>
												<tr>
													<td>KMs Driven</td>
													<td>30,000</td>
												</tr>
												<tr>
													<td>Fuel Type</td>
													<td>Diesel</td>
												</tr>
											</tbody>
										</table>

										<!--Technical-Specification-Table-->
										<table>
											<thead>
												<tr>
													<th colspan="2">Technical Specification</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>Engine Type</td>
													<td>TDCI Diesel Engine</td>
												</tr>
												<tr>
													<td>Engine Description</td>
													<td>1.5KW</td>
												</tr>
												<tr>
													<td>No. of Cylinders</td>
													<td>4</td>
												</tr>
												<tr>
													<td>Mileage-City</td>
													<td>22.4kmpl</td>
												</tr>
												<tr>
													<td>Mileage-Highway</td>
													<td>25.83kmpl</td>
												</tr>
												<tr>
													<td>Fuel Tank Capacity</td>
													<td>40 (Liters)</td>
												</tr>
												<tr>
													<td>Seating Capacity</td>
													<td>5</td>
												</tr>
												<tr>
													<td>Transmission Type</td>
													<td>Manual</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>

								<!-- Accessories -->
								<div role="tabpanel" class="tab-pane" id="accessories">
									<!--Accessories-->
									<table>
										<thead>
											<tr>
												<th colspan="2">Accessories</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>Air Conditioner</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>AntiLock Braking System</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Power Steering</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Power Windows</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>CD Player</td>
												<td><i class="fa fa-close" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Leather Seats</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Central Locking</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Power Door Locks</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Brake Assist</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Driver Airbag</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Passenger Airbag</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Crash Sensor</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Engine Check Warning</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
											<tr>
												<td>Automatic Headlamps</td>
												<td><i class="fa fa-check" aria-hidden="true"></i></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>

						<!--Comment-Form-->
							<%@ include file="comment.jsp" %>
						<!--/Comment-Form-->

					</div>

				</div>

				<!--Side-Bar-->
				<aside class="col-md-3">
					<div class="add_compare">
						<div class="checkbox">
							<input type="checkbox" value="" id="compare14"> <label
								for="compare14">Add to Compare</label>
						</div>
					</div>
					<div class="share_vehicle">
						<p>
							Share: <a href="#"><i class="fa fa-facebook-square"
								aria-hidden="true"></i></a> <a href="#"><i
								class="fa fa-twitter-square" aria-hidden="true"></i></a> <a href="#"><i
								class="fa fa-linkedin-square" aria-hidden="true"></i></a> <a
								href="#"><i class="fa fa-google-plus-square"
								aria-hidden="true"></i></a>
						</p>
					</div>
					<div class="sidebar_widget">
						<div class="widget_heading">
							<h5>
								<i class="fa fa-calculator" aria-hidden="true"></i> Financing
								Calculator
							</h5>
						</div>
						<div class="financing_calculatoe">
							<form action="#" method="get">
								<div class="form-group">
									<label class="form-label">Vehicle Price ($)</label> <input
										class="form-control" type="text">
								</div>
								<div class="form-group">
									<label class="form-label">Down Price ($)</label> <input
										class="form-control" type="text">
								</div>
								<div class="form-group">
									<label class="form-label">Interest Rate</label>
									<div class="select">
										<select class="form-control select">
											<option>12%</option>
											<option>13%</option>
											<option>14%</option>
											<option>15%</option>
											<option>16%</option>
											<option>17%</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="form-label">Period in Years</label>
									<div class="select">
										<select class="form-control">
											<option>3 Year</option>
											<option>4 Year</option>
											<option>5 Year</option>
											<option>6 Year</option>
											<option>7 Year</option>
											<option>8 Year</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-block">Calcuate</button>
								</div>
							</form>
						</div>
					</div>


					<div class="sidebar_widget">
						<div class="widget_heading">
							<h5>
								<i class="fa fa-address-card-o" aria-hidden="true"></i> Dealer
								Contact
							</h5>
						</div>
						<div class="dealer_detail">
							<img src="assets/images/dealer_img.jpg" alt="image">
							<p>
								<span>Name:</span> Dealer Name
							</p>
							<p>
								<span>Email:</span> contact@example.com
							</p>
							<p>
								<span>Phone:</span> +61-1234-5678-09
							</p>
							<a href="#" class="btn btn-xs">View Profile</a>
						</div>
					</div>
					<div class="sidebar_widget">
						<div class="widget_heading">
							<h5>
								<i class="fa fa-envelope" aria-hidden="true"></i> Message to
								Dealer
							</h5>
						</div>
						<form action="#">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Name">
							</div>
							<div class="form-group">
								<input type="email" class="form-control" placeholder="Email">
							</div>
							<div class="form-group">
								<textarea rows="4" class="form-control" placeholder="Message"></textarea>
							</div>
							<div class="form-group">
								<input type="submit" value="Send Message" class="btn btn-block">
							</div>
						</form>
					</div>
				</aside>
				<!--/Side-Bar-->
			</div>

			<div class="space-20"></div>
			<div class="divider"></div>

			<!--Similar-Cars-->
			<%@ include file="similar-cars.jsp"%>
			<!--/Similar-Cars-->

		</div>
	</section>
	<!--/Listing-detail-->

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

