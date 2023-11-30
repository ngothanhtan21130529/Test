<%@ page import="com.mysql.cj.Session" %><%--
  Created by IntelliJ IDEA.
  User: nttan
  Date: 11/29/2023
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%= session.getAttribute("user")%></h1>
<a href="logout?data=<%session.getAttribute("user");%>"> Đăng xuất</a>
<h1>Hhahahahaha</h1>
<h2>Hhehefjef</h2>
</body>
</html>
