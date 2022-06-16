<%-- 
    Document   : error
    Created on : Jun 16, 2022, 2:55:23 PM
    Author     : Anar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>why are you here ?</title>
    </head>
    <body>
    <center>
        <%
            String msg = request.getParameter("msg");
        %>
        <%=msg%>
    </center>
</body>
</html>
