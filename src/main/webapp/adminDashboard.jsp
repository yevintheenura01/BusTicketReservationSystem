<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard Bus Reservation System</title>
    <link rel="stylesheet" href="css/adminDash.css">
</head>
<body>
    <header>
        <h1>Admin Dashboard</h1>
        <nav>
            <ul>
                
                <li><a href="#" onclick="loadContent('manageBus.jsp')">Manage Buses</a></li>
                <li><a href="#" onclick="loadContent('manageRoute.jsp')">Manage Routes</a></li>
            </ul>

        </nav>
    </header>

    <main id="content">
    	
        <!-- Content of the dashboard goes here -->
       	<div id="welcome-message">
            <h2>Welcome to the Admin Dashboard</h2>
            <p>Current Date and Time: <span id="datetime"></span></p>
        </div>
    </main>

    <footer>
        <p>&copy; 2023 BuyBus Ticket Reservation System</p>
    </footer>

   
     <script>
        function loadContent(page) {
            fetch(page)
                .then(response => response.text())
                .then(data => {
                    document.getElementById('content').innerHTML = data;
                })
                .catch(error => {
                    console.error('Error loading content:', error);
                });
        }
        
     // Update the current date and time every second
        setInterval(function () {
            const dateTimeElement = document.getElementById('datetime');
            const now = new Date();
            dateTimeElement.textContent = now.toLocaleString();
        }, 1000);
    </script>
    
</body>
</html>
