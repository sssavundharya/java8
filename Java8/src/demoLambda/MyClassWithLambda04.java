/*Create an interface WordCount with a single abstract method int count(String str), to count and return the no of words in the given String. 
Implement count method using Lambda expression in another class MyClassWithLambda.
Invoke it to display the result on the console.*/

package demoLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public  class MyClassWithLambda04 {

	public static void main(String[] args) {
		
		IWordCount04 obj= str->{
			String t[]=str.split(" ");
			return t.length;
		};
		int ans= obj.count("this is savundharya");
		System.out.println(ans);
	}

}
