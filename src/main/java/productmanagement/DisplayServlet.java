package productmanagement;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            List<Product> list = ProductDAO.getAll();
            req.setAttribute("data", list);
            RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
            rd.forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}