package pastexam.codereading;

public class Q12 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		String[] vals = {"i", "j", "k", "l", "m", "n"};
		int[] next = {5, -1, -1, 0, -1, 2};
		int current = 3;
		while(current >= 0) {
			System.out.println(current+":"+vals[current]);
			current = next[current];
		}
	}
}
