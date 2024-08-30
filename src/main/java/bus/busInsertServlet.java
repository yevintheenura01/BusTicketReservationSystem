package bus;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




public class busInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String busID = request.getParameter("busID");
		String busNo = request.getParameter("busNo");
		String type = request.getParameter("type");
		String owner = request.getParameter("owner");
		String capacity = request.getParameter("cap");
		
		boolean isTrue;
		isTrue = busDBUtil.insertBus(busID,busNo, type, owner, capacity);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("manageBus.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Unsuccessful');");
			out.println("location='busInsert.jsp'");
			out.println("</script>");
		}
	}
	}


