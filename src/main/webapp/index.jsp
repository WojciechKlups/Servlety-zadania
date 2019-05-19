<%--
  Created by IntelliJ IDEA.
  User: Wojtek
  Date: 19.05.2019
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz</title>
</head>
<body>
    <h1>Podaj swoje dane:</h1>
    <form action="formServlet" method="post">
        Nazwa użytkownika: <br>
        <input type="text" name="username"> <br>
        Hasło: <br>
        <input type="password" name="password"> <br>
        Płeć: <br>
        <input type="radio" name="gender" value="male">Facet <br>
        <input type="radio" name="gender" value="female">Babka <br>
        Hobby: <br>
        <input type="checkbox" name="hobby" value="rower">rower <br>
        <input type="checkbox" name="hobby" value="programowanie">programowanie <br>
        <input type="checkbox" name="hobby" value="filmy">filmy <br>

        <input type="submit" value="Wyślij">
    </form>
</body>
</html>
