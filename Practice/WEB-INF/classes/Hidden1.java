import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hidden1 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("userName");
		out.print("Welcome "+name);
		
		out.print("<form action='Hidden2' method='post'>");
		
		out.print("<input type='hidden' name='uname' value='"+name+"'>");
		out.print("<input type='submit' value='go'>");
		
		out.print("</form>");
		out.close();
	}
	catch(Exception e){System.out.println(e);}
	}
}