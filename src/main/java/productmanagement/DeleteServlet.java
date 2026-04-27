package productmanagement;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(req.getParameter("id"));
            ProductDAO.delete(id);
            res.sendRedirect("display");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}