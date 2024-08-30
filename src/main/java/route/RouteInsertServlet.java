package route;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RouteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String RID = request.getParameter("RID");
		String date = request.getParameter("date");
		String depCity = request.getParameter("depCity");
		String desCity = request.getParameter("desCity");
		String depTime = request.getParameter("depTime");
		String arrTime = request.getParameter("arrTime");
		
		boolean isTrue;
		isTrue = RouteDBUtil.insertRoute(RID,date, depCity, desCity, depTime, arrTime);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("manageRoute.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Unsuccessful');");
			out.println("location='routeInsert.jsp'");
			out.println("</script>");
		}
	}

}
