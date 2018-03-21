import java.sql.*;
import javax.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class formservlet extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
try
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
try
{
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/test";
	String username = "root";
	String password = "cse2";
Connection con = DriverManager.getConnection(url, username, password);
Statement st=con.createStatement();
String x=req.getParameter("ename");
String y=req.getParameter("dept");
String sql="insert into emp values('"+x+"','"+y+"')";
st.executeUpdate(sql);
out.println("<h1> Record inserted successfully</h1>");
RequestDispatcher rd=req.getRequestDispatcher("/form.html");
rd.include(req,res);
}//try
catch(ClassNotFoundException cnfe)
{
 out.println("class not found");
}
}//try
catch(SQLException se)
{
throw new RuntimeException("not connected",se);
}//catch
}//doPost
}//main class
