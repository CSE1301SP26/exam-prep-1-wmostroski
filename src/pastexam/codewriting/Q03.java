package pastexam.codewriting;

import java.util.Scanner;

public class Q03 {

	/*
	 * The FizzBuzz problem, a common coding interview question. 
	 * 1) Ask the user for a positive integer
	 * 2) For this integer, check whether the number is divisible by 
	 * 5 and three. If so, print "FizzBuzz". Otherwise, if the number
	 * is divisible by 5, print "Fizz". Otherwise, if the number is 
	 * divisible by 3, print "Buzz". Otherwise, just print the number
	 * itself.
	 * 3) Repeat step 2 for each number between 1 and the number the 
	 * user gave you
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int n = in.nextInt();
		in.close();

	}
}
