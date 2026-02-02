package pastexam.codereading;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Get out a piece of paper! Predict the output 
		 * and write down your answers. You can then run
		 * the code to check the answer.
		 * 
		 * Not what you expected? Use the debugger or ask
		 * a TA to go through it with you!
		 */
		for(int i = 0; i < 3; i++)
		{
			int j = i * 2;
			while (j % 3 != 0)
			{
				System.out.println(j);
				j++;
			}
			System.out.println(i);
		}
	}
}
