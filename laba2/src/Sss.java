import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Sss extends HttpServlet implements Servlet {
    public Sss() {
        super();
        System.out.println("Sss:constructor");
    }
    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Sss:init");
    }
    public void destroy() {
        super.destroy();
        System.out.println("Sss:destroy");
    }
    protected void service(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        System.out.println("Sss: service: " + rq.getMethod());

        PrintWriter pw = rs.getWriter();
        pw.println("<html><body>"
                + "<h2>Sss: service with method - " + rq.getMethod() + "</h2>"
                + "<h3>ServerName: " + rq.getServerName() + "</h3>"
                + "<h3>LocalAddr: " + rq.getLocalAddr() + "</h3>"
                + "<br>Sss: FirstName = " + rq.getParameter("firstname")
                + "<br>Sss: LastName = " + rq.getParameter("lastname")
                + "</body></html>");
    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        pw.println("<html><body>"
                + "<br>Ppp:doPost:firstname = " + rq.getParameter("firstname")
                + "<br>Ppp:doPost:lastname = " + rq.getParameter("lastname")
                + "</body></html>");
        pw.close();
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        pw.println("<html><body>"
                +"<br>Sss: FirstName = " + rq.getParameter("firstname")
                +"<br>Sss: LastName = " + rq.getParameter("lastname")
                +"<br>Sss: getRemoteHost: " + rq.getQueryString()
                +"</body></html>");
        pw.close();
    }
}
