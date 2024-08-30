package admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@SuppressWarnings("unused")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = adminDBUtil.validate(username, password);
		
		if(isTrue == true) {
			List<admin> adminDetails = adminDBUtil.getAdmin(username);
				request.setAttribute("adminDetails", adminDetails);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/adminDashboard.jsp");
				dispatcher.forward(request, response);
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('your username or password is incorrect');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
	}
	}


