package pastexam.codereading;

public class Q11 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5};
		data[1] = data[1] + data[2];
		data[4]--;
		for(int i : data) {
			System.out.println(i);
		}
	}
}
