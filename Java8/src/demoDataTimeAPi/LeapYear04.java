/*  Write a program to check whether the current year is a leap year.
*/
package demoDataTimeAPi;

import java.time.LocalDate;

public class LeapYear04 {

	public static void main(String[] args) {
		LocalDate leap=LocalDate.of(2020,01,01);
		System.out.println(leap+" "+leap.isLeapYear());
	}

}
