package bus;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Bus> buses = BusDAO.getAllBuses();
			System.out.println(buses + "me details");
			request.setAttribute("buses", buses);
			
			RequestDispatcher dis = request.getRequestDispatcher("manageBus.jsp");
			dis.forward(request, response);
			System.out.println("read pass kara");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
		
		



