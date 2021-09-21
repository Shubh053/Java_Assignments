class Average
{
	public static void main(String [] args)
	{
		int num = 5;
		int sum = 0;
		for (int i = 1; i <= num; i++)
		{
			sum += i;
		}
		float result = sum / num;
		System.out.println(result);
	}
}