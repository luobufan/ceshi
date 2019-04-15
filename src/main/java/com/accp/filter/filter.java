package com.accp.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author ACER
 * @create 2018-12-2018/12/16-15:39
 */
@WebFilter(filterName = "*", urlPatterns = { "/*" })
public class filter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        fc.doFilter(req, res);
    }

    public void destroy() {

    }
}
