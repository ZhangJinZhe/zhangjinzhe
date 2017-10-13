package cn.java.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.java.service.FrontService;
import cn.java.service.NewsService;
import cn.java.service.impl.FrontServiceImpl;
import cn.java.service.impl.NewsServiceImpl;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FrontServlet")
public class FrontServlet extends HttpServlet {
    private NewsService ns = new NewsServiceImpl();

    private FrontService fd = new FrontServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            List<Map<String, Object>> listNews = ns.selectNews();
            List<Map<String, Object>> list = fd.selectForm(0, 0);
            List<Map<String, Object>> list1 = fd.selectForm(1, 1);

            request.setAttribute("listNews", listNews);
            request.setAttribute("list", list);
            request.setAttribute("list1", list1);
            request.getRequestDispatcher("/pages/front/Index.jsp").forward(request, response);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
