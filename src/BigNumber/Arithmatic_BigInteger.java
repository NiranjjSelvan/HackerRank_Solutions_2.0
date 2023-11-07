package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Arithmatic_BigInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		scan.close();

		BigInteger input_01 = new BigInteger(a);
		BigInteger input_02 = new BigInteger(b);
		BigInteger sum = input_01.add(input_02);
		BigInteger product = input_01.multiply(input_02);

		System.out.println(sum.toString());
		System.out.println(product.toString());
	}

}
