/*  Write a program to display the current time and the time before 5 hours and 30 minutes.
*/
package demoDataTimeAPi;

import java.time.LocalTime;

public class CurrTimeBeforeHrMin06 {

	public static void main(String[] args) {
		LocalTime currtime=LocalTime.now();
		LocalTime beforeHour=currtime.plusHours(5);
		System.out.println("current time before 5hr 30min: "+beforeHour.plusMinutes(30));
	}

}
