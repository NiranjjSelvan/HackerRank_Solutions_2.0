package Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();

		NumberFormat US_format = NumberFormat.getCurrencyInstance(Locale.US);
		String us = US_format.format(payment);
		NumberFormat China_format = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = China_format.format(payment);
		NumberFormat France_format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = France_format.format(payment);

		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat IN_format = NumberFormat.getCurrencyInstance(indiaLocale);
		String india = IN_format.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
