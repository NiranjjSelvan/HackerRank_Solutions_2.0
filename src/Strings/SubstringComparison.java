package Strings;

import java.util.Scanner;

public class SubstringComparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getLexicography(input, k));
	}

	public static String getLexicography(String input, int k) {
		String small = input.substring(0, k);
		String large = input.substring(0, k);
		for (int i = 0; i <= input.length() - k; i++) {
			String sub = input.substring(i, i + k);
			if (sub.compareTo(small) < 0)
				small = sub;
			else if (sub.compareTo(large) > 0)
				large = sub;
		}
		return small + "\n" + large;
	}

}
