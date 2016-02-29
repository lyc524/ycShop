<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#login{float:left; width:200px; height:100px; background-color: #888; padding-top: 2px;}
.lgline{float:left;width:100%; height: 30px;}
</style>

<script type="text/javascript">
function check(){
	if(fm.username.value==""){
		alert("name is not null!");
		fm.username.focus();
	}
	if(fm.userpwd.value==""){
		alert("pwd is not null!");
		fm.userpwd.focus();
	}
}
</script>

</head>

<body>
<form action="login" name="fm" method="post">
<div id="login">
<div class="lgline">用户名:<input type="text" style="width: 100px; " name="username"></div>
<div class="lgline">密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" style="width: 100px; " name="userpwd"></div>
<div class="lgline" style="text-align: center;">
<input type="submit" value="登录" name="btnlogin">
<input type="reset" value="reset" name="btnReg">
</div>
</div>
</form>
</body>
</html>