/*
12345
 1234
  123
   12
    1
*/

class PatternEleven
{
	public static void main(String [] args)
	{
		int row = 5;
		int count = 5;
		int space = 0;

		for (int i = 1; i <= row; i++)
		{
			for (int j = 0; j < space; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++)
			{
				System.out.print(k);
			}
			System.out.println(" ");
			count--;
			space++;
		}
	}
}