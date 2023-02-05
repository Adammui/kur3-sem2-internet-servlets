import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection extends HttpServlet implements Servlet {

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

        PrintWriter pw = rs.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
            pw.println("Driver is registered!");

            connection = DriverManager.getConnection(url, user, password);
            pw.println("You are connected");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" SELECT * FROM contacts; ");
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