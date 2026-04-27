package productmanagement;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            double price = Double.parseDouble(req.getParameter("price"));
            List<Product> list = ProductDAO.priceReport(price);

            req.setAttribute("data", list);
            RequestDispatcher rd = req.getRequestDispatcher("report.jsp");
            rd.forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}