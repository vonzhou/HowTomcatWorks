import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = response.getWriter();
        out.print("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");

        // Writer 中的 autoFlush 设置为 true，println会自动刷新
        out.println("Hello. Roses are red.");
        // 但是 print 不会，所以看不到这一行
        out.print("Violets are blue.");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }

}
