/* Create an interface Vehicle with a default method message() that returns nothing and prints "Inside Vehicle".
Create an interface FourWheeler with a default method message() that returns nothing and prints "Inside FourWheeler".

Create a class Car implementing these two interfaces. 
In this class, Override the message() method and call the message() method of the Vehicle interface using super keyword. 

Instantiate the class, call the message method and observe the output.*/
package demoInterface;

interface Vehicle{
	default void message() {
		System.out.println("Inside vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("inside fourwheeler");
	}
}
public class Car01 implements Vehicle,FourWheeler {

	public static void main(String[] args) {
		Vehicle obj =new Car01();
		obj.message();
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		FourWheeler.super.message();
	}

}
