<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="user_profile_info gray-bg padding_4x4_40">
     <div class="upload_user_logo" > <img src="assets/images/dealer-logo.jpg" alt="image" id="imgs" style="width:225px;height:175px">
        <div class="upload_newlogo">
        
         	<input name="Image"  <c:if test="${user==null }">type="text"</c:if>type="file" id="UserImage">
          <input id="username1" type="hidden" value="${user.getUsername()}">
        </div>
      </div>
      <div class="dealer_info">
        <h5>
        <c:if test="${user==null }">用户名</c:if>${user.getUsername()}
        </h5>
		<p>
		<c:if test="${user.getAdress()==null}">居住地址 </c:if> ${user.getAdress()}
	    <br>
		<c:if test="${user.getProvince()==null}">省份 </c:if> ${user.getProvince()}
		<c:if test="${user.getPhone()==null}">,联系方式 </c:if>${user.getPhone()}
		</p>
      </div>
    </div>
</body>
<script type="text/javascript">
$(function(){
	$.ajax({
          url: 'GetImgServlet',
          type: 'get',
          data: {username:$("#username1").val()},
          dateType:"text",
          success: function (rs) {
          	if(rs!=""&&rs!='null'){
          		$("#UserImage").parent().css({"opacity":"0"});
          		var rs = "/imgs/"+rs;
	            	$("#imgs").attr("src", rs);
          	}
          }
      });
})
</script>
</html>