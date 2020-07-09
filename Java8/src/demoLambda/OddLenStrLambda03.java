/* Create an ArrayList al and add 10 different words.
Write a code to print all the Strings whose length is odd, using lambda expression.*/
package demoLambda;

import java.util.ArrayList;
import java.util.Scanner;

public class OddLenStrLambda03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<String>();
		for(int i=0;i<3;i++) {
			al.add(scan.next());
		}
		al.forEach(s->{
			if(s.length()%2!=0){
				System.out.print(s+" ");
			}
		});
	}
}
