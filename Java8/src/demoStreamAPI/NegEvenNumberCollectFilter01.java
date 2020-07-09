/* Write a program 
1. To filter the negative even numbers from an ArrayList,
2. Store them into a new ArrayList,
3. Print the ArrayList elements.*/

package demoStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NegEvenNumberCollectFilter01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			al.add(scan.nextInt());
		}
		List<Integer>li=al.stream().filter(x->x<0 && x%2==0).collect(Collectors.toList());
		System.out.println(li);
		
	}

}
