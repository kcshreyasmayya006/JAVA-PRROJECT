package productmanagement;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            Product p = new Product();
            p.id = Integer.parseInt(req.getParameter("id"));
            p.name = req.getParameter("name");
            p.category = req.getParameter("category");
            p.price = Double.parseDouble(req.getParameter("price"));
            p.qty = Integer.parseInt(req.getParameter("qty"));

            ProductDAO.add(p);
            res.sendRedirect("display");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}