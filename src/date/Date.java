package date;

import java.time.*;

public class Date {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getMonth());
		System.out.println(today.isLeapYear());
		System.out.println(today.lengthOfYear());
		System.out.println(today.lengthOfMonth());
		System.out.println(today.plusDays(10));
		System.out.println(today.plusMonths(100));
		System.out.println(today.plusYears(2));
		System.out.println(today.minusYears(5));
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}

}
