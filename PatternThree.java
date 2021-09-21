/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/

class PatternThree
{
	public static void main(String [] args)
	{
		int row = 5;
		int count = 1;
		for (int i = 1; i <= row; i++)
			{
				for (int j = 5; j >= count; j--)
					{
						System.out.print(j + " ");
					}
				System.out.println();
			}
	}
}