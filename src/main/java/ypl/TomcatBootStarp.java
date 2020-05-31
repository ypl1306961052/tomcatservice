package ypl;
/*
作者：ypl
创建时间：2020-5-31-21:45-2020
*/


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import ypl.servlet.IndexServlet;

/**
 * @author wxt.ypl
 * @version V1.0
 * @Title: TomcatBootStarp
 * @Package com.ypl
 * @Description: (用一句话描述该文件做什么)
 * @date 2020-5-31 21:45
 */


public class TomcatBootStarp {
    public static void main(String[] args) {

        Tomcat tomcat = new Tomcat();
        //设置connect
        Connector connector = new Connector();
        connector.setURIEncoding("UTF-8");
        connector.setPort(8080);
        tomcat.getService().addConnector(connector);


        Context context = tomcat.addContext("/ypl/", null);
        Tomcat.addServlet(context, "myServlet", new IndexServlet());
        context.addServletMappingDecoded("/index", "myServlet");
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
