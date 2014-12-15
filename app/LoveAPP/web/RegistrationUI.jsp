<%-- 
    Document   : RegisterUI
    Created on : Dec 15, 2014, 12:32:35 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LoveAPP - Registration</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
    </head>
    <body>

        <div class="container">
            <form class="form-signin" action="RegistrationServlet" method="POST">
                <h2 class="form-signin-heading">Registration</h2>
                <input type="text" class="form-control" placeholder="Email ID" name="email" required autofocus><br>
                <input type="password" class="form-control" placeholder="Password" name="password" required><br>
                <input type="text" class="form-control" placeholder="Full Name" name="fullName" required><br>
                <input type="text" class="form-control" placeholder="Nick Name" name="nickName" required><br>
                <div class="btn-group" data-toggle="buttons">
                    <label class="btn btn-primary">
                        <input type="radio" name="gender" id="m"> Male
                    </label>
                    <label class="btn btn-primary">
                        <input type="radio" name="gender" id="f"> Female
                    </label>
                </div>
                <br><br>
                <input type="text" class="form-control" placeholder="Handphone Number" name="hpNumber" required><br>
                <input type="text" class="form-control" placeholder="Home/Office Number" name="hNumber" required><br>
                <input type="text" class="form-control" placeholder="Company" name="company" required><br>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>
        </div>

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
