package ProblemSolving;

import java.util.Scanner;

public class BreakingTheRecords {

	static int min, max, minChange, maxChange;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			scores[i] = scan.nextInt();
		}
		scan.close();
		findMin_MaxChanges(scores);
	}

	public static void findMin_MaxChanges(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			if (i == 0) {
				min = scores[i];
				max = scores[i];
			} else {
				if (scores[i] < min) {
					min = scores[i];
					minChange++;
				}
				if (scores[i] > max) {
					max = scores[i];
					maxChange++;
				}
			}
		}
		System.out.println("THe total minimum change : " + minChange);
		System.out.println("The total maximum change : " + maxChange);
	}

}
