/* Write a program to display today's date and the date after ten days.*/

package demoDataTimeAPi;

import java.time.LocalDate;

public class LocalDateTodayAndAfterTenDay01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todayDate=LocalDate.now();
		System.out.println(" today date: "+todayDate);
		System.out.println(" After 10 date: "+todayDate.plusDays(10));

		

	}

}
