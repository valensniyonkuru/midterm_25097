package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AcademicUnitDAO;
import model.AcademicUnit;

@WebServlet("/academicUnit")
public class AcademicUnitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String academicId = request.getParameter("academicId");
        if (academicId != null && !academicId.isEmpty()) {
            AcademicUnitDAO academicUnitDAO = new AcademicUnitDAO();
            AcademicUnit academicUnit = academicUnitDAO.getAcademicUnitById(academicId);
            if (academicUnit != null) {
                // Forward to a JSP or return JSON/XML response
                request.setAttribute("academicUnit", academicUnit);
                request.getRequestDispatcher("academicUnit.jsp").forward(request, response);
            } else {
                response.getWriter().println("Academic unit not found.");
            }
        } else {
            response.getWriter().println("Invalid academic unit ID.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests to update or save academic units
    }
}
