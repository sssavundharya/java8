/*Given an ArrayList containing 10 numbers,
 *  write a program to calculate the sum of all the elements, 
 *  with the help of Function.
 */
package demoFunctionalInterface;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

interface suminterface{
	void function(ArrayList<Integer> al);
}
public class Sum02 {
	void  function(ArrayList<Integer> al) {
		//System.out.println(al);
		
		int sum=al.stream().reduce(0,Integer::sum);
		System.out.println(sum);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=0;i<3;i++) {
			a.add(scan.nextInt());
		}
		 Sum02 obj1=new  Sum02();
		 obj1.function(a);
		
	}

}
