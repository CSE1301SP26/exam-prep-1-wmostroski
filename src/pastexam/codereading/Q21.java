package pastexam.codereading;

public class Q21 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		while (i > -5) {
			i = i + j;
			System.out.println(i);
			if(i > 5*j) {
				i = i - 3;
			}
			i = -i;
			j = -j;
			System.out.println(j);
		}
	}
}
