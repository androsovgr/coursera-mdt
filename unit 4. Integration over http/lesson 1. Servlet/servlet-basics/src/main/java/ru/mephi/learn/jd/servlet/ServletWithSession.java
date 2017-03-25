package ru.mephi.learn.jd.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/servlet-session/*")
public class ServletWithSession extends HttpServlet {

  private static final long serialVersionUID = 4258606639328082L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession ses = req.getSession();
    String key = (String) ses.getAttribute("key");
    if (key == null) {
      key = UUID.randomUUID().toString();
      ses.setAttribute("key", key);
    }
    Writer wr = resp.getWriter();
    wr.write("Your key is: " + key);
  }

}
