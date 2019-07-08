<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="sidebar_widget">
		<div class="widget_heading">
			<h5>
				<i class="fa fa-filter" aria-hidden="true"></i> Find Your Dream Car
			</h5>
		</div>
		<div class="sidebar_filter">
			<form action="#" method="get">
				<div class="form-group select">
					<select class="form-control">
						<option>Select Location</option>
						<option>Audi</option>
						<option>BMW</option>
						<option>Nissan</option>
						<option>Toyota</option>
						<option>Volvo</option>
						<option>Mazda</option>
						<option>Mercedes-Benz</option>
						<option>Lotus</option>
					</select>
				</div>
				<div class="form-group select">
					<select class="form-control">
						<option>Select Brand</option>
						<option>Audi</option>
						<option>BMW</option>
						<option>Nissan</option>
						<option>Toyota</option>
						<option>Volvo</option>
						<option>Mazda</option>
						<option>Mercedes-Benz</option>
						<option>Lotus</option>
					</select>
				</div>
				<div class="form-group select">
					<select class="form-control">
						<option>Select Model</option>
						<option>Series 1</option>
						<option>Series 2</option>
						<option>Series 3</option>
						<option>Series 4</option>
						<option>Series 6</option>
					</select>
				</div>
				<div class="form-group select">
					<select class="form-control">
						<option>Year of Model</option>
						<option>2016</option>
						<option>2015</option>
						<option>2014</option>
						<option>2013</option>
						<option>2012</option>
						<option>2011</option>
						<option>2010</option>
						<option>2009</option>
						<option>2008</option>
					</select>
				</div>
				<div class="form-group">
					<label class="form-label">Price Range ($)</label> <input
						id="price_range" type="text" class="span2" value=""
						data-slider-min="50" data-slider-max="6000" data-slider-step="5"
						data-slider-value="[1000,5000]" />
				</div>
				<div class="form-group select">
					<select class="form-control">
						<option>Type of Car</option>
						<option>New Car</option>
						<option>Used Car</option>
					</select>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-block">
						<i class="fa fa-search" aria-hidden="true"></i> Search Car
					</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>