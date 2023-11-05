package Java;

import java.util.Scanner;

public class OutputFormatter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = scan.next();
			int x = scan.nextInt();
			System.out.printf("%-15s%03d%n", s1, x);
		}
		scan.close();
		System.out.println("================================");
	}
}
