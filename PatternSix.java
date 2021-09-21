/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/

class PatternSix
{
	public static void main(String [] args)
	{
		int row = 1;
		int count = 5;
		for (int i = 5; i >= row; i--)
		{
			for (int j = 1; j <= count; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
			count--;
		}
	}
}