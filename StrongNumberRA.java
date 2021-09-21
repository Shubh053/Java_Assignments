class StrongNumberRA
{
    int sum = 0;
    int fact = 1;
    int x = 1;
    
    public static void main(String [] args)
    {
        StrongNumberRA s = new StrongNumberRA();
        System.out.println(s.checkStrong(40585));
    }
    
    public boolean checkStrong(int num)
    {
        int factSum = sumOfFact(num);
        return factSum == num;
    }
    
    public int sumOfFact(int num)
    {
        if (num != 0)
        {
            int rem = num % 10;
            StrongNumberRA s = new StrongNumberRA();
            sum = sum + s.getFact(rem);
            sumOfFact(num / 10);
        }
        return sum;
    }
    
    public int getFact(int num)
    {
        if(x <= num)
        {
            fact *= x++;
            getFact(num);
        }
        return fact;
    }
}
