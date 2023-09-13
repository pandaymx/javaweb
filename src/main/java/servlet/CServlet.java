package servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(value = "/c",loadOnStartup = 0)
public class CServlet implements Servlet {
    public CServlet() {
        System.out.println("无参构造方法");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("实例化servlet对象");
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service方法被执行");
    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {
        System.out.println("servlet被销毁");
    }
}
