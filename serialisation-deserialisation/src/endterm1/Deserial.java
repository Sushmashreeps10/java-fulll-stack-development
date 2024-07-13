package endterm1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import endterm1.student;

public class Deserial {
	 public static void main(String args[]){  
         try{  
                FileInputStream fin =  new FileInputStream("C:\\Users\\sushma\\OneDrive\\Documents\\f.txt");
               ObjectInputStream in=new ObjectInputStream(fin);  
               student s=(student)in.readObject();  
               System.out.println(s);  
              in.close();  
  }catch(Exception e){
          System.out.println(e);
  }  
 }  
}
