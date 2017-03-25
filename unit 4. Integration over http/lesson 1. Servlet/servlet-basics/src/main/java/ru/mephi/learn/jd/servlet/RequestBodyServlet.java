package ru.mephi.learn.jd.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/request-body/*")
public class RequestBodyServlet extends HttpServlet {
  private static final long serialVersionUID = 6888854279866443559L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
      throws ServletException, IOException {
    BufferedReader requestReader = req.getReader();
    PrintWriter wr = resp.getWriter();
    wr.write("Your request was:");
    for (String redLine = requestReader.readLine(); redLine != null; 
        redLine = requestReader.readLine()) {
      System.out.println(redLine);
      wr.println(redLine);
    }
  }
}
