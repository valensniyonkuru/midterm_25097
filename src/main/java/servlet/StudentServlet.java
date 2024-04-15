package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import model.Student;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentId = request.getParameter("studentId");
        if (studentId != null && !studentId.isEmpty()) {
            StudentDAO studentDAO = new StudentDAO();
            Student student = studentDAO.getStudentById(studentId);
            if (student != null) {
                // Forward to a JSP or return JSON/XML response
                request.setAttribute("student", student);
                request.getRequestDispatcher("student.jsp").forward(request, response);
            } else {
                response.getWriter().println("Student not found.");
            }
        } else {
            response.getWriter().println("Invalid student ID.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save students
    }
}
