<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Buses</title>
    <link rel="stylesheet" href="css/manageBus.css">
</head>
<body>
   

    <main id="content">
        <section>
            <h2>Manage Buses</h2>
            <form method = "post" action = "BusServlet">
            	<input type ="submit" value ="View" name = "submit">
            	<a href="adminDashboard.jsp">
            	<input type="button" value="Home" name="back"></a>
            </form>
            <table>
                <tr>
                    <th>Bus ID</th>
                    <th>Bus Number</th>
                    <th>Type</th>
                    <th>Owner</th>
                    <th>Capacity</th>
                    <th>Actions</th>
                </tr>
                
               
				<c:forEach items="${buses}" var="bus">
				
				<c:set var="id" value="${bus.BID}"/>
				<c:set var="no" value="${bus.busNo}"/>
				<c:set var="type" value="${bus.type}"/>
				<c:set var="owner" value="${bus.owner}"/>
				<c:set var="cap" value="${bus.capacity}"/>
				
				
				<tr>
        			<td>${bus.BID}</td>
        			<td>${bus.busNo}</td>
        			<td>${bus.type}</td>
        			<td>${bus.owner}</td>
        			<td>${bus.capacity}</td>
        			<td>
        				<c:url value="busEdit.jsp" var="busEdit">
        					<c:param name="id" value="${id}"/>
        					<c:param name="no" value="${no}"/>
        					<c:param name="type" value="${type}"/>
        					<c:param name="owner" value="${owner}"/>
        					<c:param name="cap" value="${cap}"/>
        				</c:url>
        				<a href ="${busEdit}">
            			<input type="button" name="edit" value="Edit"></a>
            			
            			<c:url value= "busDelete.jsp" var="busDelete">
            				<c:param name="id" value="${id}"/>
        					<c:param name="no" value="${no}"/>
        					<c:param name="type" value="${type}"/>
        					<c:param name="owner" value="${owner}"/>
        					<c:param name="cap" value="${cap}"/>
            			</c:url>
            			
            			<a href = "${busDelete}">
            			<input type="button" name="delete" value="Delete"></a>
        			</td>
    			</tr>
				</c:forEach>
				
				
            </table>
           
            <a href ="busInsert.jsp">
            <button>Add bus</button></a> 
        </section>
    </main>   
</body>
</html>
