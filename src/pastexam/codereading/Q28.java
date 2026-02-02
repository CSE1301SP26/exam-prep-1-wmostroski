package pastexam.codereading;

public class Q28 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int i = 2;
		int j = 9;
		while(i % j != 3) {
		    System.out.println(i + j);
		    i += 5;
		    j--;
		}
	}
}
