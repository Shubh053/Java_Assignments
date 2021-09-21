class FactorialRecursive
{
    public int calculateFactorial(int num)
    {
		if (num <= 0)
		{
			return 1;
		}
		else
		{
            return num*calculateFactorial(num-1);
		}
    }
    
	public static void main(String [] args)
	{
        int num = 5;
		FactorialRecursive f = new FactorialRecursive();
		int fact = f.calculateFactorial(num);
		System.out.println("Factorial of " + num + " is: " +  fact);
	}
}
