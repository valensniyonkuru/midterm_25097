package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartmentDAO;
import model.Department;

@WebServlet("/department")
public class DepartmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String departmentId = request.getParameter("departmentId");
        if (departmentId != null && !departmentId.isEmpty()) {
            DepartmentDAO departmentDAO = new DepartmentDAO();
            Department department = departmentDAO.getDepartmentById(departmentId);
            if (department != null) {
                // Forward to a JSP or return JSON/XML response
                request.setAttribute("department", department);
                request.getRequestDispatcher("department.jsp").forward(request, response);
            } else {
                response.getWriter().println("Department not found.");
            }
        } else {
            response.getWriter().println("Invalid department ID.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save departments
    }
}
