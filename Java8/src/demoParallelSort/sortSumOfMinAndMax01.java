/*Write a program as per the below instructions:

a) Initialize an integer Array with 10 elements. 
b) Sort this array using parallelSort() method. 
c) And display the sum of min and max value of this array as result. */
package demoParallelSort;

import java.util.Arrays;
import java.util.Scanner;

public class sortSumOfMinAndMax01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		Arrays.parallelSort(a);
		System.out.println("Sum of min and max: "+(a[0]+a[4]));
		
	}

}
