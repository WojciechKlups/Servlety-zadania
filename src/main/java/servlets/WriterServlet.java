package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/writerServlet")
public class WriterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();

        Map<String, String[]> parameterMap = request.getParameterMap();

        //Spos 1
        parameterMap.entrySet().forEach((entry) -> {
            String[] value = entry.getValue();
            String key = entry.getKey();
            writer.println("<html>");
            writer.println("<div>");
            writer.println(key + ": " + value[0]);
            writer.println("</div>");
            writer.println("</html>");
        });
        //Spos 2
//        parameterMap.forEach((key, value) -> {
//            writer.println("<html>");
//            writer.println("<div>");
//            writer.println(key + ": "value[0]);
//            writer.println("</div>");
//            writer.println("</html>");
//        });
    }
}
