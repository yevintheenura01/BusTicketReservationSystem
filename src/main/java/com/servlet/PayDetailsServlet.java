package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.dao.PayDBUtil;






public class PayDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("userName");
		String passengerEmail = request.getParameter("passengerEmail");
		String seatQty = request.getParameter("seatQty");
		
		
		boolean isTrue;
		isTrue = PayDBUtil.insertPay(userName,passengerEmail, seatQty);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("CustomerInsert.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Unsuccessful');");
			out.println("location='book.jsp'");
			out.println("</script>");
		}
	}

}
