package pastexam.codereading;

public class Q29 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		for (int i = 3; i < 5; i++) {
		    System.out.println("A");
		    for(int j = 10; j < 12; j++) {
		        int z = (i + 3 * j) / 2;
		        System.out.println(z);
		    }
		}
	}
}
