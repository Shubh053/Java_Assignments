/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

class PatternSeven
{
	public static void main(String [] args)
	{
		int row = 1;
		int count = 1;
		for (int i = 5; i >= row; i--)
		{
			for (int j = 5; j >= count; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
			count++;
		}
	}
}