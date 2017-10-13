package cn.java.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.java.service.UserService;
import cn.java.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    UserService us = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();
            Map<String, String[]> params = request.getParameterMap();
            String[] Login = params.get("Login");

            String LoginValue = "";
            for (String string : Login) {
                LoginValue = LoginValue + string + ",";
            }
            LoginValue = LoginValue.substring(0, LoginValue.length() - 1);

            String str[] = LoginValue.split(",");
            Boolean flag = us.isUserExists(str[0]);

            if (flag == true) {
                if (str[1].equals(us.password(str[0]))) {
                    System.out.println("登录成功");

                    session.setAttribute("username", str[0]);
                    System.out.println(str[0]);
                    request.getRequestDispatcher("/FrontServlet").forward(request, response);

                } else {
                    System.out.println("登录失败");
                    request.getRequestDispatcher("/pages/front/Login.jsp").forward(request, response);
                }
            } else {
                System.out.println("登录失败");
                request.getRequestDispatcher("/pages/front/Login.jsp").forward(request, response);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
