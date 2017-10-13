package cn.java.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELSerlvet
 */
@WebServlet("/ELSerlvet")
public class ELSerlvet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // User user = new User("小张", 20, new Date());
        List<Map<String, Object>> lists = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "張三");
        map.put("1234", "abcd");
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("username", "張si");
        map1.put("1234", "abcd");
        lists.add(map);
        lists.add(map1);
        request.setAttribute("list", lists);
        request.getRequestDispatcher("/pages/test/Test.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
