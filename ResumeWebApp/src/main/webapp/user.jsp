<%-- 
    Document   : user
    Created on : Jun 16, 2022, 2:13:04 PM
    Author     : Anar
--%>

<%@page import="entity.User"%>
<%@page import="main.Contextt"%>
<%@page import="daoInter.UserDaoInter"%>
<%@page import="daoImpl.UserDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       UserDaoInter udao = Contextt.instanceUserDao();
       User u = udao.getById(3);
       out.println("name = " + u.getName());
       %>
    </body>
</html>
