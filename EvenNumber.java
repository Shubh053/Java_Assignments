
class EvenNumber
{
	public static void main(String [] args)
	{
		int n = 50;
		int count = 0;
		for(int i = 1; count < n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
				count++;
			}
		}
	}
}