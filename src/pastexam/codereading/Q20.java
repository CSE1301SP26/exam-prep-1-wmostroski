package pastexam.codereading;

public class Q20 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		for(int j = 4; j < 7; j = j + 2) {
			for (int i=j; i < j + 3; i++) {
				if(i % 2 == 0) {
					System.out.println(i + "*");
				} else {
					System.out.println(i + j);
				}
			}
		}
	}
}
