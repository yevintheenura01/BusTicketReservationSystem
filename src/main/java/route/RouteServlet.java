package route;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class RouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Route> routes = RouteDBUtil.getAllRoutes();
			System.out.println(routes + "me details");
			request.setAttribute("routes", routes);
			
			RequestDispatcher dis = request.getRequestDispatcher("manageRoute.jsp");
			dis.forward(request, response);
			System.out.println("read pass kara");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
