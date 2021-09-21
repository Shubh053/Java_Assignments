/*
1
3 2
6 5 4
10 9 8 7
*/

class Pattern17
{
	public static void main(String [] args)
	{
		int row = 4;
		int count = 1;
		int num = 1;

		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= i; j++)
				{
					System.out.print(count);
					count--;
				}
			count++;
			count = count + i;
			System.out.println();
			if (i >= 4)
				{
					count++;
				}
		}
	}
}