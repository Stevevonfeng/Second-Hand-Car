<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--Vehicle-Video 修改-->
	<div class="video_wrap">
		<h6>Watch Video</h6>
		<div class="video-box">
			<iframe class="mfp-iframe"
				src="https://www.youtube.com/embed/rqSoXtKMU3Q" allowfullscreen></iframe>
		</div>
	</div>

	<div class="comment_form">
		<h6>Leave a Comment</h6>
		<form action="#">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Full Name">
			</div>
			<div class="form-group">
				<input type="email" class="form-control" placeholder="Email Address">
			</div>
			<div class="form-group">
				<textarea rows="5" class="form-control" placeholder="Comments"></textarea>
			</div>
			<div class="form-group">
				<input type="submit" class="btn" value="Submit Comment">
			</div>
		</form>
	</div>
</body>
</html>