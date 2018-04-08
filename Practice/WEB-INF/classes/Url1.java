import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Url1 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("userName");
		out.print("Welcome "+name);
		
		out.print("<a href='Url2?uname="+name+"'>visit</a>");
		out.close();
	}
	catch(Exception e){System.out.println(e);}
	}
}