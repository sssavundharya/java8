/*Create an ArrayList al and add 25 random numbers. 
Write a code to print all the prime numbers that are present in it, using lambda expression.*/
package demoLambda;

import java.util.ArrayList;

public class PrimeUsingLambda01 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<25;i++) {
			al.add((int)(Math.random()*100));
			//System.out.print(al+" ");
		}
		System.out.println(al);
		al.forEach(a->{
			int count=0;
			if(a>1) {
				for(int j=2;j<=a/2;j++) {
					if(a%j==0) {
						count=1;
						break;
					}
				}
				if(count==0)System.out.print(a+" ");
			}
		}
		);
		
	}

}
