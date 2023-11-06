package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input_01 = scan.nextLine().toLowerCase();
		String input_02 = scan.nextLine().toLowerCase();
		scan.close();
		System.out.println(isAnagram(input_01, input_02));
	}

	public static String isAnagram(String input_01, String input_02) {
		if (input_01.length() != input_02.length())
			return "Not Anagrams";
		Map<Character, Integer> frequencyInput_01 = new HashMap<>();
		Map<Character, Integer> frequencyInput_02 = new HashMap<>();
		for (char ch : input_01.toCharArray()) {
			frequencyInput_01.put(ch, frequencyInput_01.getOrDefault(ch, 0) + 1);
		}
		for (char ch : input_02.toCharArray()) {
			frequencyInput_02.put(ch, frequencyInput_02.getOrDefault(ch, 0) + 1);
		}
		if (frequencyInput_01.equals(frequencyInput_02))
			return "Anagrams";
		else
			return "Not Anagrams";
	}

}
