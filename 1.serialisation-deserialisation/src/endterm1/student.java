package endterm1;

import java.io.Serializable; 

public class student implements Serializable {  
      int rno;  
      String name; 
      float  fees;
      int salary;
 public student(int id, String name, float fees, int salary) {  
     this.rno = id;  
     this.name = name;  
     this.fees = fees;
     this.salary = salary;
 }  
public String toString() {
     return rno + " "  + name + " "+ fees +" "+ salary + "\n";
}  
}
