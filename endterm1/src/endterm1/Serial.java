package endterm1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import endterm1.student;

public class Serial {
	public static void main(String args[]){    
		  try
		{    
		          student s1 =new student(1,"sushma", 100000, 5);   
//		          Student s2 = new Student(2,"Akash", 1000);
		          FileOutputStream fout=new FileOutputStream("C:\\Users\\sushma\\OneDrive\\Documents\\f.txt");    
		          ObjectOutputStream out=new ObjectOutputStream(fout);    
		           out.writeObject(s1);
//		           out.writeObject(s2);
		          out.flush();    
		          out.close();    
		          System.out.println("success");    
		  }
		catch(Exception e){
		          System.out.println(e);
		}    
		 }    
		}    


