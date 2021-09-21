/*
1
23
456
78910
*/

class PatternThirteen
{
	public static void main(String [] args)
	{
		int row = 4;
		int count = 1;
		int value = 1;

		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= count; j++)
			{
				System.out.print(value++);
			}
			System.out.println(" ");
			count++;
		}
	}
}