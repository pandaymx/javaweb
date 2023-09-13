<%--
  Created by IntelliJ IDEA.
  pojo.User: panda
  Date: 2023/9/13
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="pojo.User"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setUsername("蔡徐坤");
  user.setPassword("鸡你太美");
  request.setAttribute("userobj",user);
%>
${userobj}
${userobj.username}
${userobj.password}
</body>
</html>
