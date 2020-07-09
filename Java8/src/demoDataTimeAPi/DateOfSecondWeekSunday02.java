/*  Write a program to find the date of next month second Sunday.*/

package demoDataTimeAPi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class DateOfSecondWeekSunday02 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2020, Month.JULY, 1);
        LocalDate d2 = d.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        System.out.println(d2);

	}

}
