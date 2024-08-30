<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Bus Details</title>
<link rel="stylesheet" href="css/busInsert.css">
</head>
<body>
	<h2>Insert Bus Details</h2>
	<form action="busInsert" method="post">
		<label for="busID">Bus ID: </label>
		<input type="text" name = "busID"><br><br>
		
		<label for="busNo">Bus No.: </label>
		<input type="text" name = "busNo"><br><br>
		
		<label for="type">Type: </label>
		<input type="text" name = "type"><br><br>
		
		<label for="owner">Owner: </label>
		<input type="text" name = "owner"><br><br>
		
		<label for="cap">Capacity: </label>
		<input type="text" name = "cap"><br><br>
		
		<input type="submit" value="submit" name="submit">
		
	</form>

</body>
</html>