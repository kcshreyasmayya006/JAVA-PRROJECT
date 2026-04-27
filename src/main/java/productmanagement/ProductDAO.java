package productmanagement;

import java.sql.*;
import java.util.*;

public class ProductDAO {

    public static void add(Product p) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO Products VALUES(?,?,?,?,?)");

        ps.setInt(1, p.id);
        ps.setString(2, p.name);
        ps.setString(3, p.category);
        ps.setDouble(4, p.price);
        ps.setInt(5, p.qty);

        ps.executeUpdate();
        con.close();
    }

    public static List<Product> getAll() throws Exception {
        List<Product> list = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM Products");

        while (rs.next()) {
            Product p = new Product();
            p.id = rs.getInt(1);
            p.name = rs.getString(2);
            p.category = rs.getString(3);
            p.price = rs.getDouble(4);
            p.qty = rs.getInt(5);
            list.add(p);
        }
        con.close();
        return list;
    }

    public static void delete(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM Products WHERE ProductID=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    public static List<Product> priceReport(double price) throws Exception {
        List<Product> list = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM Products WHERE Price > ?");
        ps.setDouble(1, price);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Product p = new Product();
            p.id = rs.getInt(1);
            p.name = rs.getString(2);
            p.category = rs.getString(3);
            p.price = rs.getDouble(4);
            p.qty = rs.getInt(5);
            list.add(p);
        }
        con.close();
        return list;
    }
}