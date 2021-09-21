/*
2 2 2 2 2
4 4 4 4 4
6 6 6 6 6
8 8 8 8 8
*/

class PatternTwo
{
	public static void main(String [] args)
	{
		int row = 4;
		int count = 1;
		int j = 2;
		for (int i = 1; i <= row; i++)
			{
				while (count <= 5)
					{
						System.out.print(j + " ");
				                count++;
					}
				count = 1;
				j += 2;
				
				System.out.println();
			}
	}
}