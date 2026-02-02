package nonexam.mario;

import java.util.Scanner;

/*
 * Instructions for this extension can be found here:
 * 
 * https://131text.com/ns/books/published/csjava/Extensions/2.5.html
 */

public class Mario {

	public static void main(String[] args) {

		// Surprise! This part is done for you.
		
		Scanner in = new Scanner(System.in);
		System.out.println("What size mountain do you want?");
		int size = in.nextInt();
		System.out.println("What pattern (1, 2, 3, or 4)?");
		int pattern = in.nextInt();

		if (size < 1)
			throw new IllegalArgumentException("Size must be at least 1");
		if (pattern < 1 || pattern > 4)
			throw new IllegalArgumentException("Invalid pattern, must be 1, 2, 3, or 4.  Mario aborts");

		//
		// Create the mountain by printing to System.out
		//

		
	}
}