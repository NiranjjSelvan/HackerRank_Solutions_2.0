package Java;

import java.util.Scanner;

public class Arithmatic_Power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		scan.close();
		try {
			System.out.println(findPower(n, p));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static long findPower(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n and p should not be negative");
		else if (n == 0 && p == 0)
			throw new Exception("n and p should not be zero");
		else
			return (long) Math.pow(n, p);
	}
}
