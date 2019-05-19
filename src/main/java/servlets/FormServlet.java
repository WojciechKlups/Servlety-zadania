package servlets;

import model.FormUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/formServlet")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        FormUser user = createUserFromRequest(request);

        sendResponse(response, user);

    }

    private void sendResponse(HttpServletResponse response, FormUser user) throws IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Żądanie zostało wykonane pomyślnie");
        writer.println("<div>");
        writer.print("Username: " + user.getUserName());
        writer.println("</div>");
        writer.println("<div>");
        writer.print("Password: " + user.getPassword());
        writer.println("</div>");
        writer.println("<div>");
        writer.print("Gender: " + user.getGender());
        writer.println("</div>");
        writer.println("<div>");
        writer.print("Hobby: " + Arrays.toString(user.getHobby()));
        writer.println("</div>");

    }

    private FormUser createUserFromRequest(HttpServletRequest request) {
        FormUser user = new FormUser();
        user.setUserName(request.getParameter("username"));
        user.setPassword(request.getParameter("password").replaceAll(".","*"));
        user.setGender(request.getParameter("gender"));
        user.setHobby(request.getParameterValues("hobby"));

        return user;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
