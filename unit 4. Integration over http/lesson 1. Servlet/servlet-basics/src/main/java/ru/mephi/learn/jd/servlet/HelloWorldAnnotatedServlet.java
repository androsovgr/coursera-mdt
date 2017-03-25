package ru.mephi.learn.jd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello-world2/*")
public class HelloWorldAnnotatedServlet extends HttpServlet {

  private static final long serialVersionUID = 4801198703811854471L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Hello world with annotation</h1>");
    out.println("<label>Access by URL: " + req.getRequestURL() + "</label>");
    out.println("</body>");
    out.println("</html>");
  }
}
