package pastexam.codereading;

public class Q09 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int i = 11;
		int j = 14;
		while(i > 1 || j < 19) {
			System.out.println(i + " " + j);
			i = (i + 1) % 4;
			j = j + 2;
		}
	}
}
