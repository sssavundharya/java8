/* Write a program to display the current time and the time after 25 minutes.
 */
package demoDataTimeAPi;

import java.time.LocalTime;

public class CurrTimeLocalDate05 {

	public static void main(String[] args) {
		LocalTime currtime=LocalTime.now();
		System.out.println("current time: "+currtime.plusMinutes(25));
	}

}
