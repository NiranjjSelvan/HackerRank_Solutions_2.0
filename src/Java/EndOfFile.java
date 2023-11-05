package Java;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		int count = 1;
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) { // scan.hasNext() means as long as the user gives an input it process.
			String input = scan.nextLine();
			System.out.println(count++ + " " + input);
		}
		scan.close();
	}
}
