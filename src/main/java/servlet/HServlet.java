package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/h")
public class HServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // 获取从前端获取的所有资源
        Map<String, String[]> maps = req.getParameterMap();
        Set<String> keys = maps.keySet();
        for (String key : keys) {
            // 当前key上的所有值
            String[] values = req.getParameterValues(key);
            for (String value : values) {
                out.println(key+":"+value);
            }
        }
        Enumeration<String> names = req.getParameterNames();
        while (names.hasMoreElements()){
            String s = names.nextElement();
            String parameter = req.getParameter(s);
            System.out.println(parameter);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/b").forward(req,resp);
    }
}
