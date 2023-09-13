package lister;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ALister implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("发送了request请求");
    }
}
