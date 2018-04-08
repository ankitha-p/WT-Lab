import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
//import java.util.*;
public class HelloWorld extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse res)throws
		ServletException, IOException
	{
			res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>HelloWorld</h1>");
	out.println("<h2>Noepe</h2>");
	out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
		out.println("<p>Protocol: " + request.getProtocol() + "</p>");
		out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
		out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
		// Generate a random number upon each request
		out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
	    //out.println("<p> Header:<strong>"+request.getHeader() + "</strong></p>");
		out.println("<p> Servlet path:<strong>"+request.getServletPath() + "</strong></p>");
		out.println("<p> QuerySting:<strong>"+request.getQueryString() + "</strong></p>");
		out.println("<p> get path translated:<strong>"+request.getPathTranslated() +"</strong></p>");
		out.println("<p> remote user:<strong>"+request.getRemoteUser() + "</strong></p>");
	out.println("</body>");
	out.println("</html>");
	}
}
