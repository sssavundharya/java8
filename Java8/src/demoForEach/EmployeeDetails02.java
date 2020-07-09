/*Create an ArrayList and add 5 Employee(id,name,address,salary) objects.
Retrieve the objects from the ArrayList using forEach and print the Employee details.*/

package demoForEach;

import java.util.ArrayList;

class Employee{
	int id,salary;
	String name,address;
	Employee(int id,String name,String address,int salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}
public class EmployeeDetails02 {

	public static void main(String[] args) {
		Employee obj1= new Employee(01,"abc","chennai",30000);
		Employee obj2= new Employee(02,"abc","chennai",30000);
		Employee obj3= new Employee(03,"abc","chennai",30000);
		Employee obj4= new Employee(04,"abc","chennai",30000);
		Employee obj5= new Employee(05,"abc","chennai",30000);
		
		ArrayList<Employee>al=new ArrayList<Employee>();

		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
//		for(Employee obj:al) {
//			System.out.println(obj.id+" "+obj.name+" "+obj.address+" "+obj.salary);
//		}
		al.forEach(list->{
			System.out.println(list.id+" "+list.name+" "+list.address+" "+list.salary);
		});
	}

}
