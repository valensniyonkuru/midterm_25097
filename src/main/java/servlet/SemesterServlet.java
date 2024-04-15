package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SemesterDAO;
import model.Semester;

@WebServlet("/semester")
public class SemesterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String semesterId = request.getParameter("semesterId");
        if (semesterId != null && !semesterId.isEmpty()) {
            SemesterDAO semesterDAO = new SemesterDAO();
            Semester semester = semesterDAO.getSemesterById(semesterId);
            if (semester != null) {
                // Forward to a JSP or return JSON/XML response
                request.setAttribute("semester", semester);
                request.getRequestDispatcher("semester.jsp").forward(request, response);
            } else {
                response.getWriter().println("Semester not found.");
            }
        } else {
            response.getWriter().println("Invalid semester ID.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save semesters
    }
}
