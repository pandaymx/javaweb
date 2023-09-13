<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2023/9/13
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    HashMap<String,String> map = new HashMap();
    map.put("奥特曼","迪迦");
    map.put("铠甲勇士","帝皇侠");
    map.put("赛尔号","谱尼");
    request.setAttribute("map",map);
    ArrayList arrayList = new ArrayList();
    arrayList.add("迪迦");
    arrayList.add("泰罗");
    arrayList.add("赛罗");
    request.setAttribute("list",arrayList);
%>
${map.奥特曼}
${map.铠甲勇士}
${list[1]}
${list[2]}
</body>
</html>
