<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Bus</title>
<link rel="stylesheet" href="css/busDelete.css">
</head>
<body>
	<%
	String id = request.getParameter("id");
	String busNo = request.getParameter("no");
	String type = request.getParameter("type");
	String owner = request.getParameter("owner");
	String capacity = request.getParameter("cap");
	%>
    <h2>Delete Bus</h2>
    <form action="BusDelete" method="post">
       Bus ID:<input type="text" name="BID" value="<%= id %>" readonly /><br />
        Bus Number: <input type="text" name="busNo" value="<%= busNo %>" /><br />
        Type: <input type="text" name="type" value="<%= type %>" /><br />
        Owner: <input type="text" name="owner" value="<%= owner %>" /><br />
        Capacity: <input type="text" name="capacity" value="<%= capacity %>" /><br />
        <input type="submit" value="Confirm Delete" name="delete" />
    </form>

</body>
</html>