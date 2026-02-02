package pastexam.codewriting;

import java.util.Scanner;

public class Q07 {

	/*
	 * The code below asks the user for a positive integer. 
	 * Your task is to count the number of positive
	 * factors of the given integer and print this 
	 * information. For example, if the user typed in 
	 * 8, then your program should print the value 4 
	 * since (1, 2, 4, 8) are the positive factors of 8.
	 * You can assume that the user will enter a 
	 * positive value for n (greater than 0).
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int n = in.nextInt();
		in.close();
		
	}
}
