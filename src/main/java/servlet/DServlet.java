package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(urlPatterns = {"/d"},initParams = {
        // 配置初始化参数
        @WebInitParam(name = "蔡徐坤" ,value = "27"),
        @WebInitParam(name = "宣言",value = "鸡你太美")})
public class DServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // 获取config对象
        ServletConfig config = getServletConfig();
        // 返回 servlet 的初始化参数的名称的集合
        Enumeration<String> names = config.getInitParameterNames();
        // 遍历集合获取初始化参数名称
        while (names.hasMoreElements()){
            // 获取初始化参数名称
            String name = names.nextElement();
            // 获取相应的初始参数的值
            String value = config.getInitParameter(name);
            out.print(name+":"+value+"<br/>");
        }
    }
}
