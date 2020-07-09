/*Given two StringJoiners s1 and s2 which contains n city names separated by - (hyphen), display the output for the given cases:

i) s1 merged to s2.
ii) s2 merged to s1. */
package demoStringJoiner;

import java.util.StringJoiner;

public class AddMerge02 {

	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-","{","}");
		s1.add("cbe");
		s1.add("chennai");

		StringJoiner s2=new StringJoiner("-","{","}");
		s2.add("banglore");
		s2.add("pune");
		StringJoiner s3=s1.merge(s2);
		StringJoiner s4=s2.merge(s1);

		System.out.println("s1 merge s2 :"+s3);
		System.out.println("s2 merge s1 :"+s4);

		
	}

}
