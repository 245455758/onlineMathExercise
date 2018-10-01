<%--
  Created by IntelliJ IDEA.
  User: MrTrouble
  Date: 2018/9/30
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这里是登陆界面</title>
</head>
<body>
	${msg }
    <form action="${pageContext.request.contextPath }/user/login.action">
        学号：<input type="text" name="user.studentId" /><br/>
        密码：<input type="password" name="user.password" /><br/>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
