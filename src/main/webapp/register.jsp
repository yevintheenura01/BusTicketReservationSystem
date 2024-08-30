<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel ="stylesheet" type="text/css" href="./reg.css">
</head>
<body>
    
     <div class ="reg">
    <h1>Registration form</h1>
    <form action="Insert" method="post">
       <p> Name:</p>
       <input type="text" name= "name" required>
       <p> Email:</p>
       <input type="text" name="email" required>
       <p> Phone Number:</p>
       <input type="text" name="phone" required>
       <p>User Name:</p>
       <input type="text" name="un" required>
       <p>password:</p>
       <input type="text" name="pw" required><br>
       <button type="submit" name="submit" value="Register">Register</button>
       <p><a href="login.jsp">Are you already register</a></p>
       
       
       
    </form>
    </div>

</body>
</html>