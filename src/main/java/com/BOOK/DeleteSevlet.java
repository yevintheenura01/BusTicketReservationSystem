package com.BOOK;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DeleteSevlet")
public class DeleteSevlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookingId = request.getParameter("bookid"); 

        
        if (bookingId != null && !bookingId.isEmpty()) {
           
            boolean isDeleted = BOOKDButil.deleteBOOK(bookingId);

            if (isDeleted) {
               
                List<BOOK12> updatedBookings = BOOKDButil.getBOOK1(bookingId);
                request.setAttribute("BookDetails", updatedBookings);
                request.getRequestDispatcher("deleteticket.jsp").forward(request, response);
            } else {
              
                response.sendRedirect("deleteticket.jsp"); 
            }
        } else {
            
            response.sendRedirect("deleteticket.jsp");
        }
    }
}
