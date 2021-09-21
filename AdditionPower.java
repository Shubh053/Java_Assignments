class AdditionPower
{
	public static void main(String [] args)
	{
		int num = 1248;
		int sum = 0;
		int pow = 4;
		while (num != 0)
			{
				int rem = num % 10;
				while (pow != 0)
				{
					rem *= rem;
					pow--;
					System.out.println(rem);
				}
				sum = sum + rem;
				num = num / 10;
			}
		System.out.println(sum);
	}
}