<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/busInsert.css">
<title>Insert Route Insert</title>
</head>
<body>
	<h2>Insert Route Details</h2>
	<form action="routeInsert" method="post">
		<label for="RID">Route ID: </label>
		<input type="text" name = "RID"><br><br>
		
		<label for="date">Date: </label>
		<input type="date" name = "date"><br><br>
		
		<label for="depCity">Departure city: </label>
		<input type="text" name = "depCity"><br><br>
		
		<label for="desCity">Destination city: </label>
		<input type="text" name = "desCity"><br><br>
		
		<label for="depTime">Departure time: </label>
		<input type="time" name = "depTime"><br><br>
		
		<label for="arrTime">Arrival time: </label>
		<input type="time" name = "arrTime"><br><br>
		
		<input type="submit" value="submit" name="submit">
		
	</form>
</body>
</html>