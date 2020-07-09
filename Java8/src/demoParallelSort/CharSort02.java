/* Write a program as per the below instructions: 

a) Take any String as a input from the user. 
And convert this string into character array (you may use toCharArrayMethod()). 
b) Sort this character array using parallelSort() method.
 After sorting convert this character array into a String and display this String as a result.

Example: 
Input : valan
Output : aalnv */
package demoParallelSort;

import java.util.Arrays;
import java.util.Scanner;

public class CharSort02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char a[]=str.toCharArray();
		Arrays.parallelSort(a);
		String res="";
		for(char ch:a) {
			res+=ch;
		}
		System.out.println(res);
		
	}

}
