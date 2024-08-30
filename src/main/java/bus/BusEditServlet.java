package bus;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/BusEditServlet")
public class BusEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("BID");
		String busNo = request.getParameter("busNo");
		String type = request.getParameter("type");
		String owner = request.getParameter("owner");
		String cap = request.getParameter("capacity");
		
		boolean isTrue;
		
		isTrue = busDBUtil.busEdit(id, busNo, type, owner, cap);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("manageBus.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("busEdit.jsp");
			dis.forward(request, response);
		}


		
	}

}
