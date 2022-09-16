package adventureLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/searchHelp")
public class SearchHelp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<link href=\"style.css\" rel=\"stylesheet\">\n");
        printWriter.println("</head>");
        printWriter.println("<p>You went away from that place and you met hospital.</p>");
        printWriter.println("<p>  <IMG class=\"displayed\" src = \"https://www.seoulkoreatour.net/wp-content/uploads/2019/07/10112_hospital3.png\" width = \"400\" height = \"256\">\n</p>");
        printWriter.println("<p>Do you want to enter?</p>");
        printWriter.println("<button class=\"btn\" onclick=\"window.location='/hospital'\">LET'S GO</button>");
        printWriter.println("<button class=\"btn\" onclick=\"window.location='/away'\">NO, GO AWAY</button>\\n");
        printWriter.println("</html>");
    }
}
