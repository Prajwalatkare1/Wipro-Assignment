package Servlets_Task;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Questions_Input extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));

        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        RequestDispatcher rd = request.getRequestDispatcher("grade");
        rd.forward(request, response);
    }
}
