package Java;

import java.util.Calendar;
import java.util.Scanner;

public class FindDayFromDate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int month = Integer.parseInt(input[0]);
		int date = Integer.parseInt(input[1]);
		int year = Integer.parseInt(input[2]);
		scan.close();
		System.out.println(findDay(date, month, year));
	}

	public static String findDay(int date, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			return "SUNDAY";
		case Calendar.MONDAY:
			return "MONDAY";
		case Calendar.TUESDAY:
			return "TUESDAY";
		case Calendar.WEDNESDAY:
			return "WEDNESDAY";
		case Calendar.THURSDAY:
			return "THURSDAY";
		case Calendar.FRIDAY:
			return "FRIDAY";
		case Calendar.SATURDAY:
			return "SATURDAY";
		default:
			return "Invalid day";
		}
	}

}
