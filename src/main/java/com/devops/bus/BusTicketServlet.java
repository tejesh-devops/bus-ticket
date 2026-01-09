package com.devops.bus;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BusTicketServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        String busName = "KSRTC Express";
        int ticketPrice = 500;

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Bus Ticket Booking</h2>");

        response.getWriter().println("<form method='post'>");
        response.getWriter().println("Passenger Name: <input type='text' name='name'/><br><br>");
        response.getWriter().println("Number of Seats: <input type='number' name='seats'/><br><br>");
        response.getWriter().println("<input type='submit' value='Book Ticket'/>");
        response.getWriter().println("</form>");

        response.getWriter().println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        int seats = Integer.parseInt(request.getParameter("seats"));

        String busName = "KSRTC Express";
        int ticketPrice = 500;
        int totalAmount = seats * ticketPrice;

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Booking Confirmed</h2>");
        response.getWriter().println("Passenger Name : " + name + "<br>");
        response.getWriter().println("Bus Name : " + busName + "<br>");
        response.getWriter().println("Seats Booked : " + seats + "<br>");
        response.getWriter().println("Total Amount : ₹" + totalAmount + "<br>");
        response.getWriter().println("<b>Status : CONFIRMED</b>");
        response.getWriter().println("</body></html>");
    }
}

