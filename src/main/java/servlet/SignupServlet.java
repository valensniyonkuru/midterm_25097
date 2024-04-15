package servlet;

import dao.SignupDAO;
import model.Signup;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SignupServlet", urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        
        Signup signup = new Signup(null, email, username, password, role);

        
        SignupDAO signupDAO = new SignupDAO();
        signupDAO.saveSignup(signup);

        
        response.sendRedirect("login.html");
    }
}
