class PrimeRecursive
{
    int count = 0;
    int i = 1;

    public void checkPrime(int num)
    {
        if (i <= num)
        {
            if(num % i == 0)
            {
                count++;
            }
            i++;
            checkPrime(num);
        }
        
    }
    
    public static void main(String [] args)
    {
        int num = 5;
        PrimeRecursive p = new PrimeRecursive();
        p.checkPrime(num);
        System.out.println(p.count == 2 ? num + " is prime number" : num + " is not a prime number");
    }
}
