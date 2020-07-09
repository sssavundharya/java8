/*Write a program to create an ArrayList and add the weekdays. 
Iterate and print all the elements using forEach method.*/


package demoForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class WeekDaysArrayList01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<String>();
		for(int i=0;i<6;i++) {
			al.add(scan.next());
		}
		al.forEach(System.out::println);
		
	}

}
