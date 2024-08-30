package route;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class RouteEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RID = request.getParameter("RID");
		String date = request.getParameter("date");
		String depCity = request.getParameter("depCity");
		String desCity = request.getParameter("desCity");
		String depTime = request.getParameter("depTime");
		String arrTime = request.getParameter("arrTime");
		
		boolean isTrue;
		
		isTrue = RouteDBUtil.routeEdit(RID, date, depCity, desCity, depTime,arrTime);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("manageRoute.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("routeEdit.jsp");
			dis.forward(request, response);
		}
	}

}
