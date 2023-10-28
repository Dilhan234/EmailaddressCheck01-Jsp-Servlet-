

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailCheckServlet
 */
@WebServlet("/EmailCheckServlet")
public class EmailCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        boolean isValid = isValidEmail(email);

        request.setAttribute("email", email);
        request.setAttribute("result", isValid ? "Valid Email" : "Invalid Email");

        RequestDispatcher dispatcher = request.getRequestDispatcher("emailCheck.jsp");
        dispatcher.forward(request, response);
    }

    private boolean isValidEmail(String email) {
        // Add your email validation logic here.
        // You can use regular expressions or other methods to validate the email format.
        // For a basic example, you can check if it contains an "@" symbol.
        return email != null && email.contains("@");
    }
}