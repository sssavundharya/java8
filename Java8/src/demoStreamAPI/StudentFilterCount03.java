/* Create a Student class with
1. Instance variables: rollNo, name, mark.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Student objects into and ArrayList,
2. Filter the Student objects who have cleared the test with minimum 50 marks,
3. Get the count of how many have cleared and print it.*/
package demoStreamAPI;

import java.util.ArrayList;
import java.util.List;

class Student{
	int rollno,mark;
	String name;
	Student(int rollno,String name, int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
		
	}
}
public class StudentFilterCount03 {

	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(11,"dsjkh",90));
		al.add(new Student(23,"sfjkf",35));
		al.add(new Student(31,"dsjkh",40));
		al.add(new Student(71,"dsjkh",51));
		long li=al.stream().filter(emp->emp.mark>=50).count();
		System.out.println(li);
		

		
	}

}
