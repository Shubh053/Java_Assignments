class PrimeNumber
{
    public static void checkprime(int x)
    {
        boolean flag = false;
        
        if (x == 0|| x == 1)
        {
            flag = false;
        }
        else
        {
            for (int i = 2; i <= x/2; i++)
            {
                if (x % i == 0)
                {
                    flag = false;
                    break;
                }
                else
                {
                    flag = true;
                }
            }
        }
        
        if (!flag)
        {
            System.out.println(x + " is not a prime number");
        }
        else
        {
            System.out.println(x + " is a prime number");
        }
    }
    
    public static void main(String [] args)
    {
        checkprime(93);
    }
}
