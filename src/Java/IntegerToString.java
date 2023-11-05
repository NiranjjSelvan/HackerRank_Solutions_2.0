package Java;

import java.util.Scanner;

public class IntegerToString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String outputAsString = Integer.toString(number);
		System.out.println(outputAsString);
		scan.close();
	}
}