import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
//import java.util.*;
public class HelloWorld extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws
		ServletException, IOException
	{
			res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>HelloWorld</h1>");
	out.println("</body>");
	out.println("</html>");
	}
}
