package pastexam.codereading;

public class Q36 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		String[] out = {"D", "T", "L", "O", "O", "H", "C"};
		for (int i = out.length - 1; i >= 0; i = i - 2) {
		    System.out.println(out[i]);
		}
	}
}
