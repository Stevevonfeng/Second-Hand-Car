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

	<!-- Listing-detail-header -->
	<section class="listing_detail_header">
		<div class="container">
			<div class="listing_detail_head white-text div_zindex row">
				<div class="col-md-9">
					<h2>BMW 535i, Navi, Leather, ABS</h2>
					<div class="car-location">
						<span><i class="fa fa-map-marker" aria-hidden="true"></i>
							12250 F Garvey Ave South West Covina, CA 91791</span>
					</div>
					<div class="add_compare">
						<div class="checkbox">
							<input value="" id="compare14" type="checkbox"> <label
								for="compare14">Add to Compare</label>
						</div>
						<div class="share_vehicle">
							<p>
								Share: <a href="#"><i class="fa fa-facebook-square"
									aria-hidden="true"></i></a> <a href="#"><i
									class="fa fa-twitter-square" aria-hidden="true"></i></a> <a
									href="#"><i class="fa fa-linkedin-square"
									aria-hidden="true"></i></a> <a href="#"><i
									class="fa fa-google-plus-square" aria-hidden="true"></i></a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="price_info">
						<p>${car.price }</p>
						<p class="old_price">$95,000</p>
					</div>
				</div>
			</div>
		</div>
		<div class="dark-overlay"></div>
	</section>
	<!-- /Listing-detail-header -->

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
					<i class="fa fa-money" aria-hidden="true"></i> 我要购买
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
    <div class="row">
      <div class="col-md-9">
        <div class="listing_images">
          <div class="listing_images_slider">
            <div><img src="assets/images/listing_img3.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img4.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img5.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img2.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img1.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img3.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img5.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img2.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img1.jpg" alt="image"></div>
          </div>
          <div class="listing_images_slider_nav">
            <div><img src="assets/images/listing_img3.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img4.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img5.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img2.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img1.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img3.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img5.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img2.jpg" alt="image"></div>
            <div><img src="assets/images/listing_img1.jpg" alt="image"></div>
          </div>
        </div>


		<!--大致信息部分-->
        <div class="main_features">
          <ul>
            <li> <i class="fa fa-tachometer" aria-hidden="true"></i>
              <h5>${car.kms }</h5>
              <p>总公里数</p>
            </li>
            <li> <i class="fa fa-calendar" aria-hidden="true"></i>
              <h5>2010</h5>
              <p>登记日期</p>
            </li>
            <li> <i class="fa fa-cogs" aria-hidden="true"></i>
              <h5>柴油机</h5>
              <p>汽油种类</p>
            </li>
            <li> <i class="fa fa-power-off" aria-hidden="true"></i>
              <h5>自动</h5>
              <p>传输</p>
            </li>
            <li> <i class="fa fa-superpowers" aria-hidden="true"></i>
              <h5>153KW</h5>
              <p>发动机功率</p>
            </li>
            <li> <i class="fa fa-user-plus" aria-hidden="true"></i>
              <h5>5</h5>
              <p>座位</p>
            </li>
          </ul>
        </div>


		<!--具体信息部分-->
        <div class="listing_more_info">
          <div class="listing_detail_wrap"> 
            <!-- Nav tabs -->
            <ul class="nav nav-tabs gray-bg" role="tablist">
              <li role="presentation" class="active"><a href="#vehicle-overview " aria-controls="vehicle-overview" role="tab" data-toggle="tab">车辆基本信息</a></li>
              <li role="presentation"><a href="#specification" aria-controls="specification" role="tab" data-toggle="tab">车辆总体规格</a></li>
              <li role="presentation"><a href="#accessories" aria-controls="accessories" role="tab" data-toggle="tab">车辆内饰</a></li>
            </ul>
            
            <!-- Tab panes -->
            <div class="tab-content"> 
              <!-- vehicle-overview -->
              <div role="tabpanel" class="tab-pane active" id="vehicle-overview">
                <h4>What is Lorem Ipsum?</h4>
                <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable.</p>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>
                <h4>What is Lorem Ipsum?</h4>
                <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable.</p>
              </div>
              
              <!-- Technical-Specification -->
              <div role="tabpanel" class="tab-pane" id="specification">
                <div class="table-responsive"> 
                  <!--Basic-Info-Table-->
                  <table>
                    <thead>
                      <tr>
                        <th colspan="2">基本信息</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>登记时间</td>
                        <td>${car.year }</td>
                      </tr>
                      <tr>
                        <td>卖家姓名</td>
                        <td>姓名</td>
                      </tr>
                      <tr>
                        <td>行驶总里程(km)</td>
                        <td>30,000</td>
                      </tr>
                      <tr>
                        <td>汽油种类</td>
                        <td>柴油机</td>
                      </tr>
                    </tbody>
                  </table>
                  
                  <!--Technical-Specification-Table-->
                  <table>
                    <thead>
                      <tr>
                        <th colspan="2">技术规格</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>引擎类型</td>
                        <td>TDCI 柴油发动机</td>
                      </tr>
                      <tr>
                        <td>引擎说明</td>
                        <td>1.5KW</td>
                      </tr>
                      <tr>
                        <td>气缸数量</td>
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
                        <td>油箱容量（升）</td>
                        <td>40 </td>
                      </tr>
                      <tr>
                        <td>座位</td>
                        <td>5</td>
                      </tr>
                      <tr>
                        <td>传输类型</td>
                        <td>手动</td>
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
                      <th colspan="2">内饰</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>冷气机</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>防锁刹车系统</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>动力转向</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>电动窗</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>激光唱机</td>
                      <td><i class="fa fa-close" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>皮革座椅</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>中央锁定</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>电动门锁</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>制动辅助</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>驾驶员安全气囊</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>乘客安全气囊</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>碰撞传感器</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>发动机检查警告</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                      <td>自动大灯</td>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
          
          
          
        </div>
      </div>
      
      <!--Side-Bar-->
      <aside class="col-md-3">
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5><i class="fa fa-calculator" aria-hidden="true"></i> Financing Calculator </h5>
          </div>
          <div class="financing_calculatoe">
            <form action="#" method="get">
              <div class="form-group">
                <label class="form-label">车辆价格（￥/万元）</label>
                <input class="form-control" type="text">
              </div>
              <div class="form-group">
                <label class="form-label">降价（￥）</label>
                <input class="form-control" type="text">
              </div>
              <div class="form-group">
                <label class="form-label">利率</label>
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
                <label class="form-label">年数</label>
                <div class="select">
                  <select class="form-control">
                    <option>3 </option>
                    <option>4 </option>
                    <option>5 </option>
                    <option>6 </option>
                    <option>7 </option>
                    <option>8 </option>
                  </select>
                </div>
              </div>
              <div class="form-group">
                <button type="submit" class="btn btn-block">计算</button>
              </div>
            </form>
          </div>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5><i class="fa fa-address-card-o" aria-hidden="true"></i> 卖家信息 </h5>
          </div>
          <div class="dealer_detail"> <img src="assets/images/dealer_img.jpg" alt="image">
            <p><span>姓名:</span> 卖家姓名</p>
            <p><span>邮箱:</span> contact@example.com</p>
            <p><span>电话:</span> +61-1234-5678-09</p>
            <a href="#" class="btn btn-xs">查看详细资料</a> </div>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5><i class="fa fa-envelope" aria-hidden="true"></i> 给卖家留言</h5>
          </div>
          <form action="#">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="姓名">
            </div>
            <div class="form-group">
              <input type="email" class="form-control" placeholder="邮箱">
            </div>
            <div class="form-group">
              <textarea rows="4" class="form-control" placeholder="留言文字"></textarea>
            </div>
            <div class="form-group">
              <input type="submit" value="发送留言" class="btn btn-block">
            </div>
          </form>
        </div>
      </aside>
      <!--/Side-Bar--> 
      
    </div>
    <div class="space-20"></div>
    <div class="divider"></div>
    
    <!--Similar-Cars-->
    <div class="similar_cars">
      <h3>类似汽车</h3>
      <div class="row">
        <div class="col-md-3 grid_listing">
          <div class="product-listing-m gray-bg">
            <div class="product-listing-img"> <a href="#"><img src="assets/images/featured-img-3.jpg" class="img-responsive" alt="image" /> </a>
              <div class="label_icon">新</div>
              <div class="compare_item">
                <div class="checkbox">
                  <input type="checkbox" value="" id="compare13">
                  <label for="compare13">相比</label>
                </div>
              </div>
            </div>
            <div class="product-listing-content">
              <h5><a href="#">Maserati QUATTROPORTE 1,6</a></h5>
              <p class="list-price">￥ 万元</p>
              <div class="car-location"><span><i class="fa fa-map-marker" aria-hidden="true"></i> 本地/外地</span></div>
              <ul class="features_list">
                <li><i class="fa fa-road" aria-hidden="true"></i>35,000 公里</li>
                <li><i class="fa fa-tachometer" aria-hidden="true"></i>30.000 英里</li>
                <li><i class="fa fa-calendar" aria-hidden="true"></i>2005 年型号</li>
                <li><i class="fa fa-car" aria-hidden="true"></i>柴油机</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
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


	<!--Schedule-Test-Drive -->
	<div class="modal fade" id="schedule">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title">Schedule Test Drive</h3>
				</div>
				<div class="modal-body">
					<form action="#" method="get">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Full Name">
						</div>
						<div class="form-group">
							<input type="email" class="form-control"
								placeholder="Email Address">
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Phone Number">
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Best Time (00:00am)">
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Best Date (dd/mm/yyyy)">
						</div>
						<div class="form-group">
							<textarea rows="4" class="form-control" placeholder="Message"></textarea>
						</div>
						<div class="form-group">
							<input type="submit" value="Submit Query" class="btn btn-block">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--/Schedule-Test-Drive -->

	<!--Make-Offer -->
	<%@ include file = "offer.jsp" %>
	<!--/Make-Offer -->

	<!--Email-to-Friend -->
	<div class="modal fade" id="email_friend">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title">Email to a Friend</h3>
				</div>
				<div class="modal-body">
					<form action="#" method="get">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Your Name">
						</div>
						<div class="form-group">
							<input type="email" class="form-control"
								placeholder="Your Email Address">
						</div>
						<div class="form-group">
							<input type="email" class="form-control"
								placeholder="Friend Email Address">
						</div>
						<div class="form-group">
							<textarea rows="4" class="form-control" placeholder="Message"></textarea>
						</div>
						<div class="form-group">
							<input type="submit" value="Submit Query" class="btn btn-block">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--/Email-to-Friend -->

	<!--Request-More-Info -->
	<div class="modal fade" id="more_info">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title">Request More Info</h3>
				</div>
				<div class="modal-body">
					<form action="#" method="get">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Full Name">
						</div>
						<div class="form-group">
							<input type="email" class="form-control"
								placeholder="Email Address">
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Phone Number">
						</div>
						<div class="form-group">
							<textarea rows="4" class="form-control" placeholder="Message"></textarea>
						</div>
						<div class="form-group">
							<input type="submit" value="Submit Query" class="btn btn-block">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--/Request-More-Info -->

</body>
</html>

