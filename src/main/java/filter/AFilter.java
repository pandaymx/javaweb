package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/a")
public class AFilter implements Filter {
    public AFilter() {
        System.out.println("filter无参构造");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter被初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter被执行了");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("filter被结束了");
    }

    @Override
    public void destroy() {
        System.out.println("filter过滤器执行");
    }
}
