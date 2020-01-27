<%-- 
    Document   : login
    Created on : 26 sty 2020, 10:08:18
    Author     : Bartem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="loginRequest" class="pl.tjee.bg.projekt.controller.LoginRequestBean" scope="request"/> 
<jsp:setProperty name="loginRequest" property="*"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <main>
    <nav>
    <a class="nav-link" href=".">Powrót</a>
    </nav>
    <h1>Logowanie</h1>
    <form action="login.jsp" method="post">
        <label>
            <span>Login</span>
            <input type="text" name="name"/>
        </label>
        <br/>
        <label>
            <span>Hasło</span>
            <input type="password" name="password"/>
        </label>
        <br/>
        <input class="button" type="submit" value="Login"/>
    </form>
</main>
        <jsp:getProperty name="loginRequest" property="password"/>
        <jsp:getProperty name="loginRequest" property="name"/>
    </body>
</html>
