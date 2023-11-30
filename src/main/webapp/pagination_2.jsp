<%--
  Created by IntelliJ IDEA.
  User: nttan
  Date: 11/28/2023
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="test.Pagination" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: nttan
  Date: 11/28/2023
  Time: 9:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ket qua</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<%
    Pagination pagination=new Pagination();
    pagination.Connection();

%>
<%
    int total=10;//biến đại diện cho tổng số lượng đếm được từ database
    int size=5;//biến đại diện cho số lượng phần tử ở mỗi trang
    int pages=total/size;//số lượng trang
    if(total%size!=0){
        pages++;
    }
%>
<ul>
    <%
      int index=(int) request.getAttribute("index");
        String sql="Select img_url from imgs where id between " + index + " and  "+ (index + 4);


    %>
    <% Statement statement =pagination.Connection().createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){ %>
    <h1><%=resultSet.getString(1)%></h1>
    <%
        }
        resultSet.close();
        try {
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        pagination.Connection().close();
    %>

    <li id="test_1"><i class="fa-solid fa-angle-left"></i></li>
        <% int i = 0;
            while (i < pages) { %>
        <li><a href="./test?index=<%=i%>" name="link" ><%=i%></a></li>
        <% i++;
        } %>

    <li id="test_2"><i class="fa-solid fa-angle-right"></i></li>
</ul>
</body>
</html>

</body>
</html>
