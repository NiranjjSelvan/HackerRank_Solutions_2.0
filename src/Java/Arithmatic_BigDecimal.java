package Java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arithmatic_BigDecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] input = new String[n];
		BigDecimal[] numbers = new BigDecimal[n];
		for (int i = 0; i < n; i++) {
			input[i] = scan.next();
			numbers[i] = new BigDecimal(input[i]);
		}
		scan.close();

		Arrays.sort(numbers, Comparator.reverseOrder());
		for (BigDecimal i : numbers) {
			System.out.println(i);
		}
	}
}
