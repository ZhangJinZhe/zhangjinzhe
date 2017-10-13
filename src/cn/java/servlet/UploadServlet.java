package cn.java.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.java.utils.UploadUtils;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* UploadUtils.UploadFile(request, "upload"); */

        Map<String, Object> map = UploadUtils.UploadFile(request, "upload", "utf-8", 1024 * 1024 * 3, 1024 * 1024 * 15);
        System.out.println(map);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
