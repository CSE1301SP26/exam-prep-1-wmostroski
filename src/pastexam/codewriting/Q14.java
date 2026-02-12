package pastexam.codewriting;

import java.util.Scanner;

public class Q14 {

	/*
	 * We wish to write a program that will create 
	 * mirrored arrays. For example, if you were given
	 * the following array:
	 * 
	 * 		1 2 3
	 * 
	 * then your program should create an array that
	 * contains [1, 2, 3, 3, 2, 1].
	 * 
	 * Complete the code below to compute the sum of the columns 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains. It is not necessary
	 * to print the result, creating the appropriate array is enough.
	 */
	
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some data
		//to make sure your solution
		//works properly.
		int[] data = {1, 2, 3}; 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Size of array? ");
		int n = in.nextInt();


		int[] matrix = new int[n];
		for (int i=0;i<n;i++){
			System.out.println("Index " +i+ " value: ");
			matrix[i] = in.nextInt();
		}

		int[] mirror = new int[2*n];

		for(int i=0;i<n;i++){
			mirror[i] = matrix[i];
		}
		for (int i=0;i<n;i++){
			mirror[(2*n)-i-1] = matrix[i];
		}

		System.out.println("Orginal Matrix: ");
		for(int i=0;i<n;i++){
		System.out.print(matrix[i] + " ");
		}

		System.out.println("");

		System.out.println("Mirrored Matrix: ");
		for(int i=0;i<2*n;i++){
			System.out.print(mirror[i] + " ");
		}

	}
}
