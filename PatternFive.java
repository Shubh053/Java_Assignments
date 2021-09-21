/*
15 15 15 15 15
12 12 12 12 12
9 9 9 9 9
6 6 6 6 6
3 3 3 3 3
*/

class PatternFive
{
	public static void main(String [] args)
	{
		int row = 5;
		int count = 1;
		int j = 15;
		for (int i = 1; i <= row; i++)
			{
				while (count <= 5)
					{
						System.out.print(j + " ");
						count++;
					}
				count = 1;
				j -= 3;
				System.out.println();
			}
	}
}