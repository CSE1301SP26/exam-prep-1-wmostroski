package pastexam.codewriting;

import java.util.Scanner;

public class Q06 {

	/*
	 * We wish to write a program that will generate 
	 * random Strings that can be used as secure
	 * passwords. To help with this, you have been 
	 * given an array of Strings called characters that
	 * includes all of the possible valid characters that 
	 * could be used in a password. The user will be asked
	 * how long of a password they would like to generate. 
	 * Your code should then randomly select this many
	 * characters from the array, combine them together, 
	 * and print the randomly generated password. You
	 * can assume that the user will enter a positive 
	 * value (greater than 0), and it is OK if the password uses
	 * the same characters more than once.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Creates an array of Strings (don't worry if you don't understand how)
		String[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".split("");
		
		System.out.println("How many characters?");
		int length = in.nextInt();
		in.close();
		
	}
}
