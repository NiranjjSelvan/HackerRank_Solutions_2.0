package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n > 0) {
			String pattern = scan.nextLine();
			if (isValidRegexPattern(pattern))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
			--n;
		}
		scan.close();
	}

	public static boolean isValidRegexPattern(String pattern) {
		try {
			Pattern.compile(pattern);
			return true;
		} catch (PatternSyntaxException e) {
			return false;
		}
	}

}
