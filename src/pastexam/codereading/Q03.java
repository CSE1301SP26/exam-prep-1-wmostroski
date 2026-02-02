package pastexam.codereading;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Get out a piece of paper! Predict the output 
		 * and write down your answers. You can then run
		 * the code to check the answer.
		 * 
		 * Not what you expected? Use the debugger or ask
		 * a TA to go through it with you!
		 */
		int j = 1; 
		for (int i = 0; i < 7; i++)
		{
			if(i + j > 3)
			{
				System.out.println(i + j);
				j=1;
			}
			else
			{
				j+=2;
			}
		}
	}
}
