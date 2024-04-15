package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EQualification;
import model.Teacher;
import dao.TeacherDAO;

@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieving form data
        String teacherId = request.getParameter("teacherId");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String qualificationStr = request.getParameter("qualification");
        EQualification qualification = EQualification.valueOf(qualificationStr); // Assuming EQualification is an enum

        // Creating a Teacher object
        Teacher teacher = new Teacher(teacherId, firstName, lastName, qualification, null);

        // Saving the teacher using TeacherDAO
        TeacherDAO teacherDAO = new TeacherDAO();
        teacherDAO.addTeacher(teacher);

        // Redirecting to a success page
        response.sendRedirect("teacherForm.jsp"); // Replace "success.jsp" with your actual success page
    }
}
