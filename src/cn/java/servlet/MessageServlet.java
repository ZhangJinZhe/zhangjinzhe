package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import cn.java.utils.HttpClientUtil;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
    private static String Uid = "做个幸福的米虫";

    private static String Key = "04bef299cd8c20344d96";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 手机号码，多个号码如13800000000,13800000001,13800000002
        String phone = request.getParameter("phone");

        // 短信内容
        String smsText = (int) (Math.random() * 1000000) + "";

        HttpClientUtil client = HttpClientUtil.getInstance();

        // UTF发送
        int flag = client.sendMsgUtf8(Uid, Key, smsText, phone);
        if (flag > 0) {
            request.getSession().setAttribute("smsCode", smsText);
            System.out.println("UTF8成功发送条数==" + flag);
        } else {
            System.out.println(client.getErrorMsg(flag));
        }
        JSONObject json = new JSONObject("{flag:" + flag + "}");
        response.getOutputStream().write(json.toString().getBytes("utf-8"));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doGet(request, response);
    }

}
