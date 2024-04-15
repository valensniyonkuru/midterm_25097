package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentRegistrationDAO;
import model.StudentRegistration;

@WebServlet("/studentRegistration")
public class StudentRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String registrationId = request.getParameter("registrationId");
        if (registrationId != null && !registrationId.isEmpty()) {
            StudentRegistrationDAO studentRegistrationDAO = new StudentRegistrationDAO();
            StudentRegistration studentRegistration = studentRegistrationDAO.getStudentRegistrationById(registrationId);
            if (studentRegistration != null) {
                // Forward to a JSP or return JSON/XML response
                request.setAttribute("studentRegistration", studentRegistration);
                request.getRequestDispatcher("studentRegistration.jsp").forward(request, response);
            } else {
                response.getWriter().println("Student registration not found.");
            }
        } else {
            response.getWriter().println("Invalid student registration ID.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save student registrations
    }
}
