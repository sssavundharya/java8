/* Given an ArrayList containing n names, 
 * use StringJoiner to construct a new sequence of names separated by , 
 * (comma) and enclosed in { } brackets. */
package demoStringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class AddForEach01 {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		ArrayList<String>al=new ArrayList<String>();
		al.add("abc");
		al.add("efg");
		//System.out.println(sj);
		al.forEach(x->System.out.println(sj.add(x)));
		System.out.println(sj);
		
	}

}
