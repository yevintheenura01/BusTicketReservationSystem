package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserInputDAO;
import com.entity.UserInput;

@WebServlet("/UserInputServlet")
public class UserInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        UserInput user = new UserInput(name, email);
        UserInputDAO dao = new UserInputDAO();
        dao.insertUser(user);

        response.sendRedirect("index.jsp");
    }
}
