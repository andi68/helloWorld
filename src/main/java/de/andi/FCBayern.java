package de.andi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * FCB Servlet.
 */
@WebServlet(urlPatterns = { "/fcb" })
public class FCBayern extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello Bayern Fan!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
        out.println("<img src=\"static/img/fcb.jpg\" alt=\"FCB\" />");


    }

    //    @Override
    //    public void destroy() {
    //        // do nothing.
    //    }
}
