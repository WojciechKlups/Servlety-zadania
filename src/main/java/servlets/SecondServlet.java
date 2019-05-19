package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        System.out.println("Twoje imie to " + name);

        Map<String, String[]> parameterMap = request.getParameterMap();

        //Sposób 1
        System.out.println("Twoje imie: " + Arrays.toString(parameterMap.get("name")) + " Twoj wiek: " +
                Arrays.toString(parameterMap.get("age")) + " Twoje hobby: " + Arrays.toString(parameterMap.get("hobby")));

        //Sposób 2
        System.out.println(
                "Imię: " + parameterMap.get("name")[0] + "\n" +
                        "Wiek: " + parameterMap.get("age")[0] + "\n" +
                        "Hobby" + parameterMap.get("hobby")[0] + ", " + parameterMap.get("hobby")[1]
        );
        }

    }
