package Strings;

import java.util.Scanner;

public class Tokens_RegEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String regex = "[A-Za-z]+ ";
		String[] tokens = input.split(regex);
		System.out.println(tokens.length);
		for (String token : tokens) {
			System.out.println(token);
		}
	}

}
