package DispData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class DispData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		       response.setContentType("text/html"); 
		       PrintWriter out = response.getWriter(); 
		       try{ 
		          String rollno=request.getParameter("rollno"); 
		          int rn=Integer.valueOf(rollno); 
		          Class.forName("com.mysql.jdbc.Driver"); 
		          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/endterm","root","sushma"); 
		          PreparedStatement ps=con.prepareStatement("select * from disp where rollno=?"); 
		          ps.setInt(1,rn); 
		          out.print("<table width=50% border=1>"); 
		          out.print("<caption>Result:</caption>"); 
		          ResultSet rs=ps.executeQuery(); 
		        
		          ResultSetMetaData rsmd=rs.getMetaData(); 
		          int total=rsmd.getColumnCount(); 
		          out.print("<tr>"); 
		          for(int i=1;i<=total;i++) 
		          { 
		              out.print("<th>"+rsmd.getColumnName(i)+"</th>"); 
		          } 
		          out.print("<th>Status</th></tr>"); 
		          
		         while(rs.next()) 
		         { 
		              out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getInt(2)+   "</td><td>"+rs.getString(4)+"</td><td>"+ rs.getString(5)+"</td><td>"); 
		if(rs.getInt(4)>=40) 
		out.print("<td>Pass</td>"+"</td></tr>");
		else
		out.print("<td>Fail</td>"+"</td></tr>");
		} 
		out.print("</table>"); 
		}catch (Exception e2) {e2.printStackTrace();} 
		finally{out.close();} 
		} 

}
