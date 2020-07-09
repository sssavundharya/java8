/*Given an ArrayList with 5 Employee(id,name,location,salary) objects,
write a program to extract the location details of each Employee 
and store it in an ArrayList, with the help of Function. */
package demoFunctionalInterface;

import java.util.ArrayList;
import java.util.Currency;

interface empInterface{
	void details(ArrayList<Employee> all);
}
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

public class Employee01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee(01,"abc",20,"pune"));
		al.add(new Employee(02,"abcd",24,"banglore"));
		al.add(new Employee(03,"siowj",30,"pune"));
		al.add(new Employee(04,"aisifd",24,"pune"));
		al.add(new Employee(05,"ajkhw",24,"banglore"));
		ArrayList <String> locationList = new ArrayList<>();
		empInterface test = (all)->{
			all.forEach(currObj->{
				locationList.add(currObj.location);
				//System.out.println(currObj.location);
			});
			//for(Employee currObj : all) System.out.println(currObj.location);
		};
		
		test.details(al);
		System.out.println(locationList);

		
	}
}

