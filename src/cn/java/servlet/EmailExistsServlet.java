package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import cn.java.service.UserService;
import cn.java.service.impl.UserServiceImpl;

/**
 * Servlet implementation class EmailExistsServlet
 */
@SuppressWarnings("serial")
@WebServlet("/EmailExistsServlet")
public class EmailExistsServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // 1、获取ajax传递过来的参数信息
            String email = request.getParameter("email");
            // 2、调用业务方法，判断username是否存在
            boolean flag = us.isEmailExists(email);
            // 3、给ajax返回数据
            JSONObject json = new JSONObject("{flag:" + flag + "}");
            response.getOutputStream().write(json.toString().getBytes("utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }
}
