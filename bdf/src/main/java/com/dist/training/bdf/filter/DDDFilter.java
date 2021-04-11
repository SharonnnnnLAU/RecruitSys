package com.dist.training.bdf.filter;

import org.jasig.cas.client.authentication.AuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DDDFilter {

  /**
   * ajax请求重定向问题的处理方法
   */
  public void ajaxRedirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
    if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
      response.setHeader("REDIRECT", "REDIRECT"); //表示重定向
      response.setHeader("CONTENTPATH", request.getContextPath() + "/index"); //重定向的路径
      response.setStatus(HttpServletResponse.SC_FORBIDDEN); //拒绝访问.
    } else {
      response.sendRedirect(request.getContextPath() + "/index");
    }
  }

}
