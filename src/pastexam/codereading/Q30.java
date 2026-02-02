package pastexam.codereading;

public class Q30 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 15; i = i + 4) {
		    if(i > 7) {
		        System.out.println(i * 2);
		    } else {
		        int j = i / 3;
		        if(j != 0) {
		            System.out.println(j);
		        } else {
		            System.out.println(i);
		        }
		    }
		}
	}
}
