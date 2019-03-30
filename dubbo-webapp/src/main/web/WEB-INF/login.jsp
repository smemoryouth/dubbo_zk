<%--
  Created by IntelliJ IDEA.
  User: shilei
  Date: 2019/2/19
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆页面</title>
</head>
<body>
<h1>用户登录</h1>
<form action="/login" method="post">
    <input type="text" name="name" placeholder="用户名"><br>
    <input type="password" name="pwd" placeholder="密码"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>