package Strings;

import java.util.Scanner;

public class Tokens_RegEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		input = removeLeadingNonLetters(input);

		if (input.length() == 0) {
			System.out.println(0);
			return;
		}

		String[] words = input.split("[^a-zA-Z]+");

		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static String removeLeadingNonLetters(String input) {
		int i;
		for (i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				break;
			}
		}
		return input.substring(i);
	}
}