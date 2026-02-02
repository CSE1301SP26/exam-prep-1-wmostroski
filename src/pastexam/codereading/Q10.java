package pastexam.codereading;

public class Q10 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		for(int i = 10; i > 0; i--) {
			if(i % 4 == 0 || i > 7) {
				System.out.print(i + ":" + i%3);
				if(i > 4) {
					System.out.println(" A");
				} else {
					System.out.println(" B");
				}
			}
		}
	}
}
