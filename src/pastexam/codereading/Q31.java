package pastexam.codereading;

public class Q31 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int[] next = {2, 3, 5, 3, 1, 0};
		String[] out = {"N", "M", "A", "U", "L", "T"};
		for (int v : next) {
		    System.out.println(out[v]);
		}
	}
}
