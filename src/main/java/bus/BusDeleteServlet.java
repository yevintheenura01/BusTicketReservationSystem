package bus;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




public class BusDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("BID");
		
		boolean isTrue;
		
		isTrue = busDBUtil.busDelete(id);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("manageBus.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Unsuccessful');");
			out.println("location='manageBus.jsp'");
			out.println("</script>");
		}
	}

}
