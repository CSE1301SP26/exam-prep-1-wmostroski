package pastexam.codereading;

public class Q22 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int d = 9;
		double e = 1;
		while(d > 1) {
			System.out.println(d+"!"+e);
			d = d / 2;
			e = e / 2;
		}
	}
}
