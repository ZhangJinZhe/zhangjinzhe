package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.java.service.UserService;
import cn.java.service.impl.UserServiceImpl;

/**
 * Servlet implementation class RegistServlet
 */
@SuppressWarnings("serial")
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    private UserService us = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String smsCode = request.getParameter("smsCode");
            System.out.println(smsCode);
            String checkSmsCode = request.getSession().getAttribute("smsCode") + "";
            /* if (smsCode.equals(checkSmsCode)) { */

            boolean result = us.Regist(username, password, email, phone);
            if (result) {
                response.sendRedirect("/easybuy2/LoginCookie");
            } else {
                response.sendRedirect("/easybuy2/pages/front/Regist.jsp");
            }
            /*
             * } else {
             * response.sendRedirect("/easybuy2/pages/front/Regist.jsp"); }
             */
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
