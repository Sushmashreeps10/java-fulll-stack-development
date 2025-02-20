package repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class StudentRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techmahindra_assessment","root","sushma");  
			Statement stmt=con.createStatement(); 
                        int ans=1;
                        do {
                            System.out.println("1. Insert a record ");
                            System.out.println("2. Delete a record ");
                            System.out.println("3. Modify/Edit a record ");
                            System.out.println("3. Display list of records ");
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter your choice:");
                            int ch = sc.nextInt();
                            String sname,email,address;
                            int sid,addmission_year;
                            String query="";
                           
                            switch(ch) {
                               case 1:
                                   System.out.println("Enter student id:");
                                   sid = sc.nextInt();
                                   System.out.println("Enter student name:");
                                   sname = sc.next();
                                   System.out.println("Enter student email:");
                                   email = sc.next();
                                   System.out.println("Enter student address:");
                                   address = sc.next();
                              
                                   System.out.println("Enter student Addmission year:");
                                   addmission_year = sc.nextInt();
                                   query = "INSERT INTO student " + "VALUES (" + sid+ ",'" + sname+"','"+email+"','"+address+"',"+addmission_year+")";
                                   stmt.executeUpdate(query);
                                   break;
                               case 2:
                                   System.out.println("Enter student number:");
                                   sid = sc.nextInt();
                                   query = "delete from  emp where rno='"+sid+"'";
                                   stmt.executeUpdate(query);
                                   System.out.println("Record is deleted from the table successfully..................");
                                   break;
                               	case 3:
                                   PreparedStatement ps = null;
                                   query = "update emp set name=? where rno=? ";
                                   ps = con.prepareStatement(query);
                                   System.out.println("Enter student number:");
                                   sid = sc.nextInt();
                                   System.out.println("Enter student name:");
                                   sname = sc.next();
                                   ps.setString(1, sname);
                                   ps.setInt(2, sid);
                                   ps.executeUpdate();
                                   System.out.println("Record is updated successfully......");                        
                                   break;
                               case 4:
                                   ResultSet rs=stmt.executeQuery("select * from emp");  
			                      while(rs.next())  
			                          System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
                                  }
                                  System.out.println("Enter another(1/0)");
                                  ans = sc.nextInt();
                          }while(ans==1);    
			
			con.close();  
		}catch(Exception e){ System.out.println(e);} 
	}

}