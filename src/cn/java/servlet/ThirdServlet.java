package cn.java.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import cn.java.service.FrontService;
import cn.java.service.NewsService;
import cn.java.service.impl.FrontServiceImpl;
import cn.java.service.impl.NewsServiceImpl;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
    private NewsService ns = new NewsServiceImpl();

    private FrontService fd = new FrontServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            JSONObject json = new JSONObject();

            String secondId = request.getParameter("secondId");
            int id1 = Integer.parseInt(secondId);

            List<Map<String, Object>> list3 = fd.thirdForm(id1, 1);

            json.put("list3", list3);

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
