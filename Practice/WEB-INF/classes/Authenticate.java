import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Authenticate extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		
		if(name.equals("Ankitha") && pass.equals("password"))
		{
			out.println("<html><body><h1>Succesfully logged in Ankitha!</h1></body></html>");
			
		}
		else out.println("<html><body><h3>Invalid login credentials!</h3></body></html>");
		Enumeration e=req.getParameterNames();
			while(e.hasMoreElements())
			{
				String pname=(String)e.nextElement();
				out.println("<p>Parameter Name:"+pname+"\tParameter Value:"+ req.getParameter(pname)+"<br/></p>");
			}
	}
}