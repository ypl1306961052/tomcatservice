package ypl.servlet;
/*
作者：ypl
创建时间：2020-5-31-21:55-2020
*/


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wxt.ypl
 * @version V1.0
 * @Title: IndexServlet
 * @Package com.ypl.servlet
 * @Description: (用一句话描述该文件做什么)
 * @date 2020-5-31 21:55
 */


public class IndexServlet extends HttpServlet {
    private AtomicInteger atomicInteger=new AtomicInteger(0);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(atomicInteger.incrementAndGet());
        resp.setContentType("text/html;charset=utf8");
        resp.getWriter().print("你好");
    }
}
