/*  Create an Employee class with
1. Instance variables: empNo, name, age, location.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Employee objects into an ArrayList,
2. Filter the Employee objects whose location is Pune,
3. Store them in a separate ArrayList and print their details.*/

package demoStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class Employee{
	int empNo,age;
	String name,location;
	Employee(int empNo,String name,int age,String location){
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.location=location;
	}
}

public class EmployeeCollectFilter02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee(01,"abc",20,"pune"));
		al.add(new Employee(02,"abcd",24,"banglore"));
		al.add(new Employee(03,"siowj",30,"pune"));
		al.add(new Employee(04,"aisifd",24,"pune"));
		al.add(new Employee(05,"ajkhw",24,"banglore"));

		List<Employee>li=al.stream()
				.filter(emp->emp.location=="pune")
				.collect(Collectors.toList());
		//System.out.println(li);
		li.forEach(list->{
			System.out.println(list.empNo+" "+list.name+" "+list.age+" "+list.location);
		});

		

	}

}
