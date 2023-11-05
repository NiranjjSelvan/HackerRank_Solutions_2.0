package Java;

import java.util.Scanner;

public class Loops_ll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			printValue(a, b, n);
		}
		scan.close();
	}

	public static void printValue(int a, int b, int n) {
		int last = 0, result = 0;
		for (int j = 0; j < n; j++) {
			last = ((int) Math.pow(2, j) * b);
			result += last;
			System.out.print(a + result + " ");
		}
		System.out.println();
	}

}
