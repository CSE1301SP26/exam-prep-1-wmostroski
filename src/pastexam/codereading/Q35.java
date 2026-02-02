package pastexam.codereading;

public class Q35 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int i = 1;
		while(i > 0) {
		    System.out.println(i);
		    if(i < 6) {
		        i = i * 2;
		    } else if (i >= 10) {
		        i = i - 14;
		    } else {
		        i++;
		    }
		}
	}
}
