/* Create an ArrayList al and add 10 different words. 
Write a code to print all the Strings in reverse order, using lambda expression*/
package demoLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseWordsArrayListLambda02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<String>();
		for(int i=0;i<4;i++) {
			al.add(scan.next());
		}
        Collections.reverse(al);
        al.forEach(s->System.out.print(s+" "));
      
	}

}
