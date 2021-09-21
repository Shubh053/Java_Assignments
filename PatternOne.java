/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/

class PatternOne
{
	public static void main(String [] args)
	{
		int row = 5;
		int count = 5;
		for (int i = 1; i <= row; i++)
			{
				for (int j = 1; j <= count; j++)
					{
						System.out.print(j + " ");
					}
				System.out.println();
			}
	}
}