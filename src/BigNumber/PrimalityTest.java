package BigNumber;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		scanner.close();
		if (n.isProbablePrime(10)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
