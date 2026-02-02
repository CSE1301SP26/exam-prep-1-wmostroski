package pastexam.codereading;

public class Q26 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int[] next = {3, 5, 4, 2, 1, -1};
		String[] out = {"D", "O", "U", "B", "L", "E"};
		int now = 0;
		while (now != -1) {
			System.out.println(out[now]);
			now = next[now];
		}
	}
}
