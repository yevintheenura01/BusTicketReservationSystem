<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>Insert User Data</title>
</head>
<body>
    <h1>Insert User Data</h1>
    <form action="UserInputServlet" method="post">
        <label>Name: <input type="text" name="name"></label>
        <br>
        <label>Email: <input type="text" name="email"></label>
        <br>
        <input type="submit" value="Submit">
    </form>
    
     <h1>User Details</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Age</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
