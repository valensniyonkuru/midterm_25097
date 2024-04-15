package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourseDAO;
import model.Course;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        CourseDAO courseDAO = new CourseDAO();
        Course course = courseDAO.getCourseById(courseId);
        if (course != null) {
            // Forward to a JSP or return JSON/XML response
            request.setAttribute("course", course);
            request.getRequestDispatcher("course.jsp").forward(request, response);
        } else {
            response.getWriter().println("Course not found.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save courses
    }
}
