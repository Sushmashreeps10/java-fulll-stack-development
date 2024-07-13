package InsertData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{ 
		    Class.forName("com.mysql.jdbc.Driver"); 
		    Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3305/endterm","root","sushma"); 
		    PreparedStatement st = con.prepareStatement("insert into dis values(?, ?, ?, ?, ?)");
		     st.setString(1, request.getParameter("name"));
		     st.setInt(2, Integer.valueOf(request.getParameter("date")));
		     st.setString(3, request.getParameter("place1"));
		     st.setString(4, request.getParameter("place2"));
		     st.setString(5, request.getParameter("fare"));
//		     
		     st.executeUpdate();
		     st.close();
		     con.close(); 
		     PrintWriter out = response.getWriter();
		     out.println("<html><body><b>Successfully Inserted"
		     + "</b></body></html>");
		}catch(Exception e){
		      System.out.println(e);} 
	}


}
