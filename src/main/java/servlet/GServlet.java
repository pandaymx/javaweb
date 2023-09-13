package servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/g")
public class GServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        context.getAttribute("name");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // 获取值
        out.print("name"+":"+context.getAttribute("name"));
        // 移除其中的值
        context.removeAttribute("name");
    }
}

