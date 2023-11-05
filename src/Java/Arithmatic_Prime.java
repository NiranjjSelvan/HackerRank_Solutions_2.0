package Java;

import java.util.Scanner;

public class Arithmatic_Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of input : ");
		int t = scan.nextInt();
		System.out.println("Enter the input : ");
		for (int i = 0; i < t; i++) {
			int input = scan.nextInt();
			if (isPrime(input))
				System.out.println(input + " is a prime number");
			else
				System.out.println(input + " is not a prime number");
		}
		scan.close();
	}

	public static boolean isPrime(int input) {

		if (input <= 1)
			return false;
		if (input <= 3)
			return true;
		if (input % 2 == 0 || input % 3 == 0)
			return false;
		for (int i = 5; i * i <= input; i += 6) {
			if (input % i == 0 || input % (i + 2) == 0)
				return false;
		}
		return true;
	}

}
