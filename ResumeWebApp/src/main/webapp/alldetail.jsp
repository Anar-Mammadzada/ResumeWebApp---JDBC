<%-- 
    Document   : alldetail
    Created on : Jun 16, 2022, 2:54:18 PM
    Author     : Anar
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        User u = (User)request.getAttribute("detal");
        %>
        
        <table class="table">
            <thead>
                <tr>
                    <th>name</th>
                    <th>surname</th>
                    <th>address</th>
                    <th>email</th>
                    <th>phone</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=u.getName()%></td>
                    <td><%=u.getSurname()%></td>
                    <td><%=u.getAddress()%></td>
                    <td><%=u.getEmail()%></td>
                    <td><%=u.getPhone()%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
