package adventureLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/gasoline")
public class Gasoline extends HttpServlet {
   static String[] medicine = new String[1];
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String medic = req.getParameter("click");
        if (medic.equals("medicine")){
            medicine[0] = medic;
        }
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<link href=\"style.css\" rel=\"stylesheet\">\n");
        printWriter.println("</head>");
        printWriter.println("<p>You went away from hospital. Because it smelled so bad!</p>");
        printWriter.println("<p>Let's walk a little to find somebody alive!</p>");
        printWriter.println("<p>500 meters from hospital you found a gasoline station and an abandoned car.</p>");
        printWriter.println("<p>You checked a car and found a phone. You tried to turn it on.</p>");
        printWriter.println("<p>Oh my Lord! It has battery! (Thank you Elon Musk, for your moderns phones \"TeslaMob 1.6\"!) </p>");
        printWriter.println("<p> You tried to call 112. <p>");
        if (req.getParameter("click").equals("medicine")){
            printWriter.println("<p> It takes a lot of time to be answered! </p>");
            printWriter.println("<p> Policeman answered!!!</p>");
            printWriter.println("<p>-Hello. How can I help you? </p>");
            printWriter.println("<p>-Please I need to eat and find a place to be saved! </p>");
            printWriter.println("<p>-Ok, ser. Where are you? </p>");
            printWriter.println("<p>");
        }else if (req.getParameter("click").equals("refuse")){
            printWriter.println("<p> During phone call you feel big head ache and die! </p>");
            printWriter.println("<p> YOU LOSE </p>");

        }
        printWriter.println("</html>");
    }
}
