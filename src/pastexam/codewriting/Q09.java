package pastexam.codewriting;

import java.util.Scanner;

public class Q09 {

	/*
	 * The code below asks the user 
	 * for two positive integers. Your task is 
	 * to generate quantity random integers between 
	 * 1 (inclusive) and 100 (inclusive). You should 
	 * then count the number of times that the random 
	 * values appear above the user supplied threshold. 
	 * Finally, you should print the total amount of 
	 * random values that were above the threshold as 
	 * well as the percentage of values that were above the threshold.
	 * 
	 * You can assume that the user will enter a positive 
	 * value for quantity (greater than 0). You can also
	 * assume that the user will enter a valid value for 
	 * the threshold (between 1 and 100, inclusive).
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int quantity = in.nextInt();
		System.out.println("Enter a value between 1-100 (inclusive): ");
		int threshold = in.nextInt();
		in.close();
		
	}
}
