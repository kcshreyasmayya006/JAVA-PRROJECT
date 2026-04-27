package productmanagement;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            Product p = new Product();
            p.id = Integer.parseInt(req.getParameter("id"));
            p.name = req.getParameter("name");
            p.category = req.getParameter("category");
            p.price = Double.parseDouble(req.getParameter("price"));
            p.qty = Integer.parseInt(req.getParameter("qty"));

            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE Products SET ProductName=?, Category=?, Price=?, Quantity=? WHERE ProductID=?");

            ps.setString(1, p.name);
            ps.setString(2, p.category);
            ps.setDouble(3, p.price);
            ps.setInt(4, p.qty);
            ps.setInt(5, p.id);

            ps.executeUpdate();
            con.close();

            res.sendRedirect("display");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}