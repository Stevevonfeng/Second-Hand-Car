<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section id="filter_form" class="gray-bg">
	<div class="container">
		<h3>
			寻找你的梦之车 <span>(从这里轻松搜索)</span>
		</h3>
		<div class="row">
			<form action="#" method="get">
				<div class="form-group col-md-3 col-sm-6 black_input">
					<div class="select">
						<select class="form-control">
							<option value="">选择您的位置</option>
							<option value="">Location 1</option>
							<option value="">Location 1</option>
						</select>
					</div>
				</div>
				<div class="form-group col-md-3 col-sm-6 black_input">
					<div class="select">
						<select class="form-control">
							<option>选择品牌</option>
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
							<option>选择车型</option>
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
					<label class="form-label">价格区间 ($)</label> <input id="price_range"
						type="text" class="span2" value="" data-slider-min="50"
						data-slider-max="6000" data-slider-step="5"
						data-slider-value="[1000,5000]" />
				</div>
				<div class="form-group col-md-3 col-sm-6 black_input">
					<div class="select">
						<select class="form-control">
							<option>汽车类型</option>
							<option>新车</option>
							<option>二手车</option>
						</select>
					</div>
				</div>
				<div class="form-group col-md-3 col-sm-6">
					<button type="submit" class="btn btn-block">
						<i class="fa fa-search" aria-hidden="true"></i> 搜索车辆
					</button>
				</div>
			</form>
		</div>
	</div>
	</section>

</body>
</html>