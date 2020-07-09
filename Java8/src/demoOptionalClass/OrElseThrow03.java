/* Given an Employee object which may be initialized to null,
 *  use Optional class to check if it is null and
 *   to throw an user defined exception InvalidEmployeeException.*/

package demoOptionalClass;

import java.util.Optional;

public class OrElseThrow03 {

	public static void main(String[] args) {
		OrElseThrow03 emp=null;
		Optional<OrElseThrow03>ref=Optional.ofNullable(emp);
		System.out.println(ref.orElseThrow(null));
	}

}
