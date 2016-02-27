<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/yc.css">
<script type="text/javascript">
function check(){
	if(fm.userName.value==""){
		alert("username can not empty!")
		fm.userName.focus();
		return false;
	}
	
	if(fm.userPwd.value==""){
		alert("userPwd can not empty!")
		fm.userPwd.focus();
		return false;
	}
}
</script>
</head>
<body>

<%-- <jsp:include page="../top.jsp"></jsp:include> --%>
<form action="" method="post" name="fm" >
<div id="body">
<table>
<tr>
<td>用户名：<input type="text" name="userName"></td>
</tr>
<tr>
<td>密码：<input type="text" name="userPwd"></td>
</tr>
<tr>
<td>email:<input type="text" name="email"></td>
</tr>
<tr>
<td>tel:<input type="text" name="tel"></td>
</tr>
<tr>
<td><input type="submit" value="注册" name="save" onclick="check()"><input type="reset" value="重置" name="reset"></td>
</tr>
</table>
</div>
</form>
<%-- <jsp:include page="../bottom.jsp"></jsp:include> --%>

</body>
</html>