package cn.java.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class PayFilter
 */
@WebFilter(urlPatterns = "/*")
public class PayFilter implements Filter {

    /**
     * Default constructor.
     */
    public PayFilter() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        HttpServletRequest hr = (HttpServletRequest) request;
        String context = ((HttpServletRequest) request).getContextPath();
        String username = (String) hr.getSession().getAttribute("username");
        String url = hr.getRequestURI();
        List<String> list = new ArrayList<>();
        list.add(context + "/pages/front/Member_Money_Pay.html");
        if (list.contains(url) != true) {
            chain.doFilter(request, response);
        } else if (list.contains(url) == true && username != null) {
            chain.doFilter(request, response);
        } else {
            /*
             * ((HttpServletResponse) response).sendRedirect(context +
             * "/pages/front/Login.jsp");
             */
            hr.getRequestDispatcher("/pages/front/Login.jsp").forward(request, response);
        }

    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {

    }

}
