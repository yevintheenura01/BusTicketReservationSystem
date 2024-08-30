package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String CardHolderName = request.getParameter("CardHolderName");
		String CardNumber =request.getParameter("CardNumber");
		String CVC = request.getParameter("CVC");
		String Expiry =request.getParameter("Expiry"); 
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertcustomer(CardHolderName, CardNumber, CVC, Expiry);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('successful');");
			out.println("location='success.jsp'");
			out.println("</script>");
		
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("CustomerInsert.jsp");
			dis2.forward(request, response);
		}
	}

}
