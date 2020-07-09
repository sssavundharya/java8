/* Create an interface Test with an abstract method "int myFunction".
This function takes three integer parameters.

Write a program to create two Test reference variables t1 and t2.
t1 should add three integer parameters and t2 should multiply three integer parameters, using lambda expression.

Call myFunction using t1 and t2 reference variables, by passing three integer values and print the result.*/

package demoInterface;

interface  Test{
	 int myFunction(int x,int y,int z);
 }
public class InterfaceLambda02 {

	public static void main(String[] args) {
		
		Test t1=(x,y,z)->(x+y+z);
		Test t2=(x,y,z)->(x*y*z);
		
		int add=t1.myFunction(12, 13, 5);
		 int mul=t2.myFunction(2, 8, 5);
		 System.out.println(add+" "+mul);
		
	}

}
