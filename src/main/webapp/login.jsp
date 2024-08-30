<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
 h2{
 	text-align:center;
 }  
body {
    background-color: #f2f2f2;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

form {
    background-color: #ffffff;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    margin: 100px auto;
    padding: 20px;
    width: 400px;
}

input[type="text"], input[type="password"] {
    background-color: #f2f2f2;
    border: 1px solid #ddd;
    border-radius: 3px;
    margin-bottom: 10px;
    padding: 8px;
    width: 100%;
}

input[type="submit"] {
    background-color: #3498db;
    border: none;
    border-radius: 3px;
    color: white;
    cursor: pointer;
    font-size: 16px;
    margin-top: 10px;
    padding: 8px;
    width: 100%;
}

input[type="submit"]:hover {
    background-color: #258cd1;
}
    </style>
</head>
<body>
    <form action="log" method="post">
        <h2>Login</h2>
        User Name <input type="text" name="uid" required><br>
        Password <input type="password" name="pass" required><br>
        <input type="submit" name="submit" value="Login"><br><br>
        <a href="updateaccount.jsp">Forgot Password</a>
    </form>
</body>
</html>
