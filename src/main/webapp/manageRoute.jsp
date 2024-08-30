<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/manageBus.css">
<title>Manage Routes</title>
</head>
<body>
	<main id="content">
        <section>
            <h2>Manage Routes</h2>
            <form method = "post" action = "routeServlet">
            	<input type ="submit" value ="View" name = "submit">
            	<a href="adminDashboard.jsp">
            	<input type="button" value="Home" name="back"></a>
            </form>
            <table>
                <tr>
                    <th>Route ID</th>
                    <th>Date</th>
                    <th>Departure city</th>
                    <th>Destination city</th>
                    <th>Departure time</th>
                    <th>Arrival time</th>
                    <th>Action</th>
                </tr>
                
               
				<c:forEach items="${routes}" var="route">
				
				<c:set var="RID" value="${route.RID}"/>
				<c:set var="date" value="${route.date}"/>
				<c:set var="depCity" value="${route.depCity}"/>
				<c:set var="desCity" value="${route.desCity}"/>
				<c:set var="depTime" value="${route.depTime}"/>
				<c:set var="arrTime" value="${route.arrTime}"/>
				
				
				<tr>
        			<td>${route.RID}</td>
        			<td>${route.date}</td>
        			<td>${route.depCity}</td>
        			<td>${route.desCity}</td>
        			<td>${route.depTime}</td>
        			<td>${route.arrTime}</td>
        			<td>
        				<c:url value="routeEdit.jsp" var="routeEdit">
        					<c:param name="RID" value="${RID}"/>
        					<c:param name="date" value="${date}"/>
        					<c:param name="depCity" value="${depCity}"/>
        					<c:param name="desCity" value="${desCity}"/>
        					<c:param name="depTime" value="${depTime}"/>
        					<c:param name="arrTime" value="${arrTime}"/>
        				</c:url>
        				<a href ="${routeEdit}">
            			<input type="button" name="edit" value="Edit"></a>
            			
            			<c:url value= "routeDelete.jsp" var="routeDelete">
            				<c:param name="RID" value="${RID}"/>
        					<c:param name="date" value="${date}"/>
        					<c:param name="depCity" value="${depCity}"/>
        					<c:param name="desCity" value="${desCity}"/>
        					<c:param name="depTime" value="${depTime}"/>
        					<c:param name="arrTime" value="${arrTime}"/>
            			</c:url>
            			
            			<a href = "${routeDelete}">
            			<input type="button" name="delete" value="Delete"></a>
        			</td>
    			</tr>
				</c:forEach>
				
				
            </table>
           
            <a href ="routeInsert.jsp">
            <button>Add Route</button></a> 
        </section>
    </main>   

</body>
</html>