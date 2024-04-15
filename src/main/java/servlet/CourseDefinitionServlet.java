package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourseDefinitionDAO;
import model.CourseDefinition;

@WebServlet("/courseDefinition")
public class CourseDefinitionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String courseDefinitionId = request.getParameter("courseDefinitionId");
        if (courseDefinitionId != null && !courseDefinitionId.isEmpty()) {
            CourseDefinitionDAO courseDefinitionDAO = new CourseDefinitionDAO();
            CourseDefinition courseDefinition = courseDefinitionDAO.getCourseDefinitionById(courseDefinitionId);
            if (courseDefinition != null) {
                // Forward to a JSP or return JSON/XML response
                request.setAttribute("courseDefinition", courseDefinition);
                request.getRequestDispatcher("courseDefinition.jsp").forward(request, response);
            } else {
                response.getWriter().println("Course definition not found.");
            }
        } else {
            response.getWriter().println("Invalid course definition ID.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save course definitions
    }
}
