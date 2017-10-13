package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCookie
 */

@WebServlet("/LoginCookie")
public class LoginCookie extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1、获取所有的Cookie文件
        Cookie[] cookies = request.getCookies();
        // 2、找出对应的Cookie文件
        if (cookies != null) {// 当Cookie不为空的时候才遍历
            for (Cookie cookie : cookies) {
                // 获取某一个cookie的名字
                String cookieName = cookie.getName();
                if ("Login".equals(cookieName)) {// 已经找到了对应的名字叫goods的文件
                    // 获取cookie中保存的数据
                    String cookieValue = cookie.getValue();
                    System.out.println(cookieValue);
                    String str[] = cookieValue.split(",");
                    System.out.println(str[0]);
                    System.out.println(str[1]);
                    ServletContext context = this.getServletContext();
                    context.setAttribute("Login", str[0]);
                    context.setAttribute("Login1", str[1]);

                }
            }
        }
        request.getRequestDispatcher("/pages/front/Login.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
