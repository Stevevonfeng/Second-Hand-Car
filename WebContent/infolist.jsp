<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
		<ul>
			<li class="active"><a href="User?act=ToUpdate&username=${user.getUsername()}">资料设置</a></li>
			<li><a href="my-vehicles.jsp">我的车库</a></li>
			<li><a href="post-vehicle.jsp">我要卖车</a></li>
			<li><a href="User?act=SignOut&username=${user.getUsername()}">退出登录</a></li>
		</ul>


</body>
</html>