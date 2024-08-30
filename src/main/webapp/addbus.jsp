<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/addbus.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
		<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		
		
</head>
<body>

<%-- Check if the error message is set --%>
    <c:if test="${not empty requestScope.error}">
        <script>
            // Display the error message as a popup
            alert("${requestScope.error}");
        </script>
    </c:if>
    
    <!-- Your existing form content here -->
    <form action="BusInsertServlet" method="post">
        <!-- Form fields here -->
    </form>
  <div class="wrapper">
    <form class="form-signin"  action="BusInsertServlet" method="post">       
      <h2 class="form-signin-heading">Enter Bus Details</h2>
      <label>Departure</label>
      <input type="text" class="form-control" name="departure" placeholder="Departure " required/><br>
      <label>Arival</label>
      <input type="text" class="form-control" name="arival" placeholder="Arival" required/><br>
    <!--   <label>Type</label>
      <input type="text" class="form-control" name="type" placeholder="Type" required/><br>
       -->
       <label>Type</label>
		<select class="form-control" name="type" required>
    		<option value="AC">AC</option>
   			 <option value="non AC">non AC</option>
		</select><br>
      <label>Time</label>
      <input type="text" class="form-control" name="time" placeholder="Time"  required/><br>
      <label>Price</label>
      <input type="number" class="form-control" name="price" placeholder="Price" required/><br>
      <label>Route</label>
      <input type="text" class="form-control" name="route" placeholder="Route" required/><br>
            
      <br>
      <br>
      <button  type="submit" value="Create Bus" class="btn btn-lg btn-primary btn-block" >Submit</button>   
    </form>
  </div>
  
</body>
</html>