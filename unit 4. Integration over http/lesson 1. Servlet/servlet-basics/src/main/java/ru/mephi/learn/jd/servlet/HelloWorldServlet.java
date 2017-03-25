package ru.mephi.learn.jd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

  private static final long serialVersionUID = 4801198703811854471L;

  String message;

  public void init() throws ServletException {
    message = getServletConfig().getInitParameter("message");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>" + message + "</h1>");
    out.println("<label>Access by URL: " + req.getRequestURL() + "</label>");
    out.println("</body>");
    out.println("</html>");
  }
}
