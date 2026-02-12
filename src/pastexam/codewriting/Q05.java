package pastexam.codewriting;

import java.util.Scanner;

public class Q05 {

	/*
	 * Implement the following formula using n: 
	 * 1 - (1/2) + (1/3) - (1/4) ... (1/n)
	 * 
	 * Print the result that you have computed (for example, the result for
	 * n = 2 is 0.5).
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a value for n: ");
		int n = in.nextInt();
		in.close();

		double total=0.0;
		for(int i=1; i<=n; i++){
			if(i%2==0){
				total = total - 1 / (double)(i);
			}
			else{
				total = total + 1 / (double)(i);
			}
		}
		System.out.println(total);
		}
}
