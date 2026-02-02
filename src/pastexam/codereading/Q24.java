package pastexam.codereading;

public class Q24 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		for(int i = 3; i < 5; i++) {
			for(int j = 7; j < 9; j++) {
				int z = i + (j * 2);
				System.out.println(z);
			}
			System.out.println("x");
		}
	}
}
