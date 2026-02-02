package pastexam.codereading;

public class Q17 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 1;
		
		if (i > 5) {
			System.out.println(0);
			if(j < 5) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
			j = j + 7;
		} else {
			System.out.println(3);
			if(j < 5) {
				System.out.println(4);
			}else {
				System.out.println(5);
			}
			j = j + 7;
		}
		System.out.println(6);
	}
}
