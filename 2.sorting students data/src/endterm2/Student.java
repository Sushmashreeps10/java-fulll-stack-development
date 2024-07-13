package endterm2;

import java.util.Comparator;

import endterm2.Student;

public class Student {
	int rollno;
	String name;
	float fees;
	String branch;
	int year;
	int sem;
	int age;
    static String clg;

    public Student(int rollno,String name,float fees,String branch,int year,int sem,int age) {
    	this.rollno = rollno;
    	this.name = name;
    	this.fees = fees;
    	this.branch = branch;
    	this.year = year;
    	this.sem = sem;
    	this.age = age;
    	clg="PU";
    }
    @Override
    public String toString() {
    	return rollno + " "+ name + " " + fees + " " + branch + " " + year + sem + " " + age + " " + clg + "\n";
    }
}
class AgeComparator implements Comparator { 
	public int compare(Object o1, Object o2) { 
		Student s1=(Student)o1; 
		Student s2=(Student)o2; 
		if(s1.year==s2.year) 
			return 0; 
		else if(s1.year>s2.year) 
			return 1; 
		else
			return -1; 
	} 
} 
class NameComparator implements Comparator{
	public int compare(Object o1, Object o2) { 
		Student s1=(Student)o1; 
		Student s2=(Student)o2; 
		return	s1.name.compareTo(s2.name); 
} 
} 
class FeesComparator implements Comparator { 
	public int compare(Object o1,Object o2) { 
		Student s1=(Student)o1; 
		Student s2=(Student)o2; 
		if(s1.fees==s2.fees) 
			return 0; 
		else if(s1.fees>s2.fees) 
			return 1; 
		else
			return -1; 
	} 

}
