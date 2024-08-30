<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8">
    <title>Admin Login</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
    <div class="login-container">
        <form action="loginServlet" method="post">
            <h2>Admin Login</h2>
            <div class="input-container">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username">
            </div>
            <div class="input-container">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password">
            </div>
            <input type="submit" name="submit" value="Login">
        </form>
    </div>
</body>
</html>
