/*
*
**
***
****
*****
*/

class PatternNine
{
	public static void main(String [] args)
	{
		int row = 5;
		int count = 1;

		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= count; j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
			count++;
		}
	}
}