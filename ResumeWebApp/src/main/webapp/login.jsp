
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/users.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body class="login_background">
        <form action="login" method="POST">
            <div class="col-4 container login_fix_">
                <center>
                    <h1>login</h1>
                </center>
                <div class="form-control">
                    <label>Email address</label>
                    <input type="email" class="form-control" placeholder="email@example.com" name="email">
                </div>
                <div class="form-control">
                    <label>Password</label>
                    <input type="password" class="form-control" placeholder="Password" name="password">
                </div>
                <button type="submit" class="btn btn-primary" name="login">Login</button>
            </div>
        </form>
    </body>
</html>
