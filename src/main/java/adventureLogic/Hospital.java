package adventureLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hospital")
public class Hospital extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<link href=\"style.css\" rel=\"stylesheet\">\n");
        printWriter.println("</head>");
        printWriter.println("<p>You entered in hospital... </p>");
        printWriter.println("<p><IMG class=\"displayed\" src = \"https://static8.depositphotos.com/1027309/944/i/600/depositphotos_9449756-stock-photo-abandoned-surgery-room.jpg\" width = \"256\" height = \"400\">\n</p>");
        printWriter.println("<p>Oh my God! It is so dirty inside! If I had a broom I would broom this entire floor!</p>");
        printWriter.println("<p>Ok. Let's find the administration office.</p>");
        printWriter.println("<p>You found the administration office on the second floor.</p>");
        printWriter.println("<p>Inside you met a dead body of a doctor. And near his leg you noticed a package of medicine.</p>");
        printWriter.println("<p>Will you take it or do you feel disgusted to touch it?</p>");
        printWriter.println("<button class=\"btnBack\" onclick=\"window.location='/takeMedicine'\">TAKE IT</button>\n");
        printWriter.println("<button class=\"btnBack\" onclick=\"window.location='/refuseMedicine'\">REFUSE IT</button>\n");

        printWriter.println("</html>");
    }
}
