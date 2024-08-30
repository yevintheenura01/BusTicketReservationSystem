<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/busEdit.css">
<title>Edit route Details</title>
</head>
<body>
	<%
		String RID = request.getParameter("RID");
		String date = request.getParameter("date");
		String depCity = request.getParameter("depCity");
		String desCity = request.getParameter("desCity");
		String depTime = request.getParameter("depTime");
		String arrTime = request.getParameter("arrTime");
	%>
    <h2>Edit Routes</h2>
    <form action="routeEdit" method="post">
        Route ID:<input type="text" name="RID" value="<%= RID %>" readonly /><br />
        Date: <input type="date" name="date" value="<%= date %>" /><br />
        Departure City: <input type="text" name="depCity" value="<%= depCity %>" /><br />
        Destination City: <input type="text" name="desCity" value="<%= desCity %>" /><br />
        Departure Time: <input type="time" name="depTime" value="<%= depTime %>" /><br />
        Arrival Time: <input type="time" name="arrTime" value="<%= arrTime %>" /><br />
        <input type="submit" value="Save" name="submit" />
    </form>

</body>
</html>