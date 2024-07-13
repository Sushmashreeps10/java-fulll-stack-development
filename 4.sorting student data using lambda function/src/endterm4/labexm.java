package endterm4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import endterm4.Student;

public class labexm {
	public static void main(String[] args) {
        List <Student> s = new <Student>ArrayList();
      s.add(new Student(1,"abc",20,20000.00f,"a"));
      s.add(new Student(2,"xyz",15,15000.00f,"b"));
      s.add(new Student(3,"def",10,10000.00f,"c"));
      s.add(new Student(4,"sushma",18, 200000,"d"));
      System.out.println("Sorting on the basis of name...");  
 
       // implementing lambda expression  
       Collections.sort(s,(s1,s2)->{return s1.name.compareTo(s2.name);});  
        for(Student l:s){  
           System.out.println(l);  
       }  
       System.out.println("Sorting on the basis of dept...");  
        
        // implementing lambda expression  
        Collections.sort(s,(s1,s2)->{return s1.dept.compareTo(s2.dept);});  
         for(Student l:s){  
            System.out.println(l);  
        } 
       System.out.println("Sorting by age");  
 
       Collections.sort(s,(s1,s2)-> s1.age - s2.age); 
       s.forEach((l)->System.out.println(l)); 
       
       System.out.println("Sorting by salary");  
 
       Collections.sort(s,(s1,s2)-> (int)s1.salary - (int)s2.salary); 
       s.forEach((l)->System.out.println(l));
       
   }

}
