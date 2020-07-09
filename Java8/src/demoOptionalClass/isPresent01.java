/* Use Optional class and avoid NullPointerException from the below code:

String names[ ] = new String[5];
System.out.print(names[0].length( )); */
package demoOptionalClass;

import java.util.Optional;

public class isPresent01 {

	public static void main(String[] args) {
		String names[ ] = new String[5];
		Optional<String>ref=Optional.ofNullable(names[0]);
		if(ref.isPresent())System.out.print(names[0].length( ));
		else System.out.println("string not present");
	}

}
