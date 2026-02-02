package pastexam.codereading;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Get out a piece of paper! Predict the output 
		 * and write down your answers. You can then run
		 * the code to check the answer.
		 * 
		 * Not what you expected? Use the debugger or ask
		 * a TA to go through it with you!
		 */
		int i = 1; 
		int j = 2;
		while (i * j <= i + 9)
		{
			System.out.println(i + j);
			j = i;
			i++;
		}
	}
}
