package endterm4;

public class Student {
	 int eno;  
	   String name; 
	   int age;
	   float salary; 
	   String dept;
	   
	   public Student(int eno, String name, int age, float salary, String dept) {  
	       super();  
	       this.eno = eno;  
	       this.name = name;  
	       this.age = age;
	       this.salary = salary;
	       this.dept = dept;
	   } 
	   
	 
	   @Override
	   public String toString() {
	       return eno + "   " + name + "  " + age + "   " + salary+" "+dept;
	   }

}
