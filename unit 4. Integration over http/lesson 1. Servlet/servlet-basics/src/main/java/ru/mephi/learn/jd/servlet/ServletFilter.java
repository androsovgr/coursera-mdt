package ru.mephi.learn.jd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/*" })
public class ServletFilter implements Filter {

  public void init(FilterConfig filterConfig) throws ServletException {
  }

  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    if (Math.random() > 0.5) {
      chain.doFilter(request, response);
    } else {
      response.setCharacterEncoding("UTF-8");
      PrintWriter wr = response.getWriter();
      wr.write("Запрещено");
    }
  }

  public void destroy() {
  }
}
