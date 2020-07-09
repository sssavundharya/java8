/*Given a String address, print the address
 *  if it is not null or else print the default address as "India". */

package demoOptionalClass;

import java.util.Optional;

public class OrElse02 {

	public static void main(String[] args) {
		String address="chennai";
		Optional<String>ref=Optional.ofNullable(address);
		System.out.println(ref.orElse("India"));


	}

}
