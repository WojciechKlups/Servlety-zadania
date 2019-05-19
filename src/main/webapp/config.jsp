<%--
  Created by IntelliJ IDEA.
  User: Wojtek
  Date: 19.05.2019
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Config</title>
</head>
<body>
    <h1>Nazwa użytkownika:</h1>
        <form action="/initServlet" method="post">
            Nazwa użytkownika: <br>
            <input type="text" name="username">
            <input type="submit" value="Wyślij">
        </form>
</body>
</html>
