<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/busEdit.css">
    <title>Edit Bus</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String busNo = request.getParameter("no");
		String type = request.getParameter("type");
		String owner = request.getParameter("owner");
		String capacity = request.getParameter("cap");
	%>
    <h2>Edit Bus</h2>
    <form action="BusEdit" method="post">
        Bus ID:<input type="text" name="BID" value="<%= id %>" readonly /><br />
        Bus Number: <input type="text" name="busNo" value="<%= busNo %>" /><br />
        Type: <input type="text" name="type" value="<%= type %>" /><br />
        Owner: <input type="text" name="owner" value="<%= owner %>" /><br />
        Capacity: <input type="text" name="capacity" value="<%= capacity %>" /><br />
        <input type="submit" value="Save" name="submit" />
    </form>
</body>
</html>
