package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lifecycleServlet")
public class LifecycleServlet extends HttpServlet {

    public LifecycleServlet() {
        super();
        System.out.println("Konstruktor LifecycleServlet");
    }

    @Override
    public void destroy() {
        System.out.println("Wywołanie metody destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Wywoływanie metody init");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Wywołanie metody doGet");
    }
}
