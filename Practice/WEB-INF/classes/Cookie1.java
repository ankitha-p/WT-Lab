import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cookie1 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("userName");
		out.print("Welcome "+name);
		Cookie ck=new Cookie("uname",name);//creating cookie object
		response.addCookie(ck);//adding cookie in the response
		//creating submit button
		out.print("<form action='Cookie2' method='post'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		out.close();
	}
	catch(Exception e){System.out.println(e);}
	}
}