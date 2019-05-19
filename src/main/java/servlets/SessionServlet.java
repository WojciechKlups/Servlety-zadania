package servlets;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionServlet")
public class SessionServlet extends HttpServlet {

    private static final String USER_SESSION_ATTRIBUTE_NAME = "user";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(5); //ustawianie czasu trwania sesji

        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");

        User user = (User) session.getAttribute(USER_SESSION_ATTRIBUTE_NAME);

        if (user == null) {
            user = createUser(firstName, lastName);
            if (user != null) {
                session.setAttribute(USER_SESSION_ATTRIBUTE_NAME, user);
            }
        }
        sendResponse(response, user);
    }

    private void sendResponse(HttpServletResponse response, User user) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (user == null){

            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");

            writer.println("<div>");
            writer.print("Witaj Nieznajomy!");
            writer.println("</div>");
        } else {
                writer.println("<div>");
                writer.print("Witaj " + user.getFirstName() + " " + user.getLastName());
                writer.println("</div>");
            }
        writer.println("</html>");
    }

    private User createUser(String firstName, String lastName) {

        if (firstName != null && lastName != null) {
            return new User(firstName, lastName);
        }
        return null;
    }
}
