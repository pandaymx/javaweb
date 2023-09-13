<%--
  Created by IntelliJ IDEA.
  pojo.User: panda
  Date: 2023/9/13
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("userObj", "caixukun");
%>
${userObj}
</body>
</html>
