<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
  window.onload = function(){
	        (function(){
                return document.getElementById("result").value === "true" ? document.getElementsByClassName("display")[0].innerText="做对了！！！":document.getElementsByClassName("display")[0].innerText="做错了！！！";
		        })()
  }
</script>
</head>
<body>
<input type="hidden" id="result" value="${q1judge }"/>
<span class="display"></span>
</body>
</html>