package com.javarush.quest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loser")
public class Loser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<link href=\"style.css\" rel=\"stylesheet\">\n");
        printWriter.println("</head>");
        printWriter.println("<p>Your scream has been heard, three hellhounds came to eat you.<p>");
        printWriter.println("<p>YOU LOSE<p>");
        printWriter.println("<p>START AGAIN?</p>");
        printWriter.println("  <button class=\"btnBack\" onclick=\"window.location='index.jsp'\">YES</button>\n");
        printWriter.println("</html>");
    }
}
