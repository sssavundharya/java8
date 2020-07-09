/* Write a program as per the below instructions:

Initialize an integer Array with 10 elements. 
Sort only first 5 elements in this array using parallelSort() method and display the sorted array.*/

package demoParallelSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortParticularElement03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		//System.out.println(a);
		Arrays.parallelSort(a,3,8);
		//System.out.println(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		

	}

}
