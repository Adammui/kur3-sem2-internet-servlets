import java.io.*;
import java.sql.*;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection2 extends HttpServlet implements Servlet {

    static String url = "jdbc:postgresql://localhost:5432/contacts?currentSchema=public";
    static String user = "postgres";
    static String password = "123";
    Connection connection;

    public void init() throws ServletException {
        super.init();
        System.out.println("DBConnection:init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("DBConnection:destroy");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse rs) throws ServletException, IOException {

        rs.setCharacterEncoding("CP1251");
        String id = req.getParameter("id");
        PrintWriter pw = rs.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
            pw.println("Driver is registered!");

            connection = DriverManager.getConnection(url, user, password);
            pw.println("You are connected");

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM contacts WHERE id=?");
            statement.setInt(1, Integer.parseInt(id));//указываем маркер по очереди в самом запросе и его значение
            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                pw.print("There is row with such id!");
                return;
            }
            resultSet = statement.executeQuery();
            String result = "";
            while (resultSet.next()) {
                result += "id:" + resultSet.getInt(1) + "; surname:" + resultSet.getString(2) + "; phone:" + resultSet.getString(3) +";\n";
            }
            pw.println(result);

            statement.close();
            resultSet.close();

            connection.close();
            return;
        } catch (SQLException e) {
            pw.println(e.getMessage());
        } catch (NumberFormatException n) {
            pw.println(n.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}