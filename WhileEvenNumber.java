class WhileEvenNumber
{
	public static void main(String [] args)
	{
                int n = 50;
		int count = 0;
		int i = 1;
		while (count < n)
		{
			if (i % 2 == 0)
				{
					System.out.print(i + " ");
					count++;
				}
			i++;
		}
	}
}