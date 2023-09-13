package pojo;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        HttpSessionBindingListener.super.valueBound(event);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        HttpSessionBindingListener.super.valueUnbound(event);
    }

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "pojo.User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
