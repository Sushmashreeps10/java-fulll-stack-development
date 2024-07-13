package endterm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import endterm2.AgeComparator;
import endterm2.FeesComparator;
import endterm2.NameComparator;
import endterm2.Student;

public class Temp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList sl=new ArrayList(); 
		sl.add(new Student(1,"sushma",10000.00f,"cse",1,1,18)); 
		sl.add(new Student(2,"akash",15000.00f,"ise",1,2,20)); 
		sl.add(new Student(3,"joyce",17000.00f,"ece",1,1,19)); 
		sl.add(new Student(3,"prerana",12000.00f,"eee",1,1,19)); 
		sl.add(new Student(3,"shree",11000.00f,"mech",1,1,21));
		System.out.println("Sorting by year"); 
		System.out.println("_______________"); 
		Collections.sort(sl,new NameComparator()); 
		Iterator itr=sl.iterator(); 
		while(itr.hasNext()){ 
			Student st=(Student)itr.next(); 
			System.out.println(st ); 
		} 
		System.out.println("Sorting by age"); 
		System.out.println("______________"); 
		Collections.sort(sl,new AgeComparator()); 
		Iterator itr2=sl.iterator(); 
		while(itr2.hasNext()) { 
		           Student st=(Student)itr2.next(); 
		           System.out.println(st ); 
		} 
		System.out.println("Sorting by fees"); 
		System.out.println("______________"); 
		Collections.sort(sl,new FeesComparator()); 
		Iterator itr1=sl.iterator(); 
		while(itr1.hasNext()){ 
			Student st=(Student)itr1.next(); 
		              System.out.println(st); 
	               }
	}

}
