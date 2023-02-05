import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.http.HttpClient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class Sss extends HttpServlet implements Servlet {
    private ServletConfig configServ;
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        rs.setContentType("text/html;charset=utf-8");
    }
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        rs.setContentType("text/html;charset=utf-8");
    }
    public Sss() {
        super();
        System.out.println("Sss:constructor");
    }
    public void init(ServletConfig sc) throws ServletException {
        super.init(sc);
        this.configServ=sc;
        configServ.getServletContext().log("Sss:init");
    }
    public void destroy() {
        super.destroy();
        configServ.getServletContext().log("Sss:destroy");
    }
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        super.service(req, resp);
        configServ.getServletContext().log("Sss:service");
        RequestDispatcher requestDispatcher = null; // Данные будут доступны другому сервлету

        String _click = req.getParameter("click");

        PrintWriter printWriter = resp.getWriter();


        if (_click == null) {     // По гиперссылке
            printWriter.println("Sss:doGet");
        } else {

            if (_click.equalsIgnoreCase("value")) { // переадресация на Ggg
                resp.sendRedirect("Ggg");
            }

            if (_click.equalsIgnoreCase("value1")) {    // POST запрос с Sss
                printWriter.println("Sss:POST in service");
            }

            if (_click.equalsIgnoreCase("value2")) {
                resp.sendRedirect("Ggg?param2=testvalue");
                printWriter.println("<br/>POST Sss -> Ggg");
            }

            if (_click.equalsIgnoreCase("value3")) {
                resp.sendRedirect("redirect.html");
            }

            if (_click.equalsIgnoreCase("value4")) {
                requestDispatcher = req.getRequestDispatcher("Ggg");
                requestDispatcher.forward(req, resp);
            }

            if(_click.equalsIgnoreCase("value5")){
                requestDispatcher = req.getRequestDispatcher("Ggg");
                requestDispatcher.forward(req, resp);
            }

            if(_click.equalsIgnoreCase("value6")) {
                HttpClient hc = new HttpClient();
                GetMethod gm = new GetMethod("http://localhost:8080/InP_Lab3/Ggg?click=example&p1=Julia&p2=Chistyakova");

                hc.executeMethod(gm);
                resp.setContentType("text/html");
                PrintWriter pw = resp.getWriter();
                pw.println(gm.getResponseBodyAsString());
                pw.flush();
            }
            if (_click.equalsIgnoreCase("value7")) {
                RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("redirect.html");
                requestDispatcher2.forward(req, resp);
            }
            if (_click.equalsIgnoreCase("value8")) {
                resp.sendRedirect("Ggg?param2=testvalue2");
            }

            if(_click.equalsIgnoreCase("value9")) {
                HttpClient hc2 = new HttpClient();
                PostMethod gm2 = new PostMethod("http://localhost:8080/InP_Lab3/Ggg");
                gm2.addParameter("click","example");
                gm2.addParameter("p1","Julia");
                gm2.addParameter("p2","Chistyakova");
                hc2.executeMethod(gm2);
                resp.setContentType("text/html");
                PrintWriter pw = resp.getWriter();
                pw.println(gm2.getResponseBodyAsString());
                pw.flush();
            }
        }
    }
}
