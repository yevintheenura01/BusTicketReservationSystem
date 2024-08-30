package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.conn.DBConnection;

@WebServlet("/CheckDatabaseConnectionServlet")
public class CheckDatabaseConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Check the database connection
        Connection connection = DBConnection.getConnection();
        boolean isDatabaseConnected = (connection != null);

        // Store the result in a request attribute
        request.setAttribute("isDatabaseConnected", isDatabaseConnected);

        // Forward to a JSP page for displaying the result
        request.getRequestDispatcher("database-connection-check.jsp").forward(request, response);
    }
}
