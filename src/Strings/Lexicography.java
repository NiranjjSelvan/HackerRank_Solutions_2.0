package Strings;

import java.util.Scanner;

public class Lexicography {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input_01 : ");
		String input_01 = scan.next();
		System.out.println("Enter the input_02 : ");
		String input_02 = scan.next();
		scan.close();
		System.out.println("Length of both the strings is : " + toFindLength(input_01, input_02));
		System.out.println(
				"Does input_02 comes before input_01 in dictionary? - " + isLexicographical(input_01, input_02));
		System.out.println("Capitalized words are : " + toCapitalize(input_01, input_02));
	}

	public static int toFindLength(String input_01, String input_02) {
		return input_01.length() + input_02.length();
	}

	public static String toCapitalize(String input_01, String input_02) {
		String output = "";
		output = Character.toUpperCase(input_01.charAt(0)) + input_01.substring(1) + " "
				+ Character.toUpperCase(input_02.charAt(0)) + input_02.substring(1);
		return output;
	}

	// Lexicographical means in dictionary which words comes first
	public static String isLexicographical(String input_01, String input_02) {
		if (input_01.compareTo(input_02) > 0)
			return "Yes";
		else if (input_01.compareTo(input_02) < 0)
			return "No";
		else
			return "Same";
	}

}