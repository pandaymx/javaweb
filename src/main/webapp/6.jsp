<%@ page import="java.util.ArrayList" %>
<%@ page import="pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2023/9/13
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> list = new ArrayList<>();
    list.add(new User("迪迦","我是迪迦"));
    list.add(new User("诺亚","嘎巴得"));
    list.add(new User("丽娜","亚麻得"));
    request.setAttribute("list",list);
%>

<c:forEach items="${list}" var="s">
    账号:${s.username},密码:${s.password}<br>
</c:forEach>
</body>
</html>
