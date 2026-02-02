package pastexam.codereading;

public class Q25 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int j = 1;
		for(int i = 0; i < 15; i++) {
			if(i % 3 == 1) {
				System.out.println(j);
			} else {
				if (j < 5) {
					j++;
				} else {
					j -= 7;
				}
			}
		}
	}
}
