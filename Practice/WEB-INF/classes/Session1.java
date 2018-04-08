import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Session1 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("userName");
		out.print("Welcome "+name);
		HttpSession session=request.getSession();
		session.setAttribute("uname",name);
		out.print("<a href='Session2\'>visit</a>");
		out.close();
	}
	catch(Exception e){System.out.println(e);}
	}
}