class StrongNumber
{
    public static void main(String [] args)
    {
        int n = 145;
        int fact = 1;
        int sum = 0;
        int temp = n;
        
        while(temp != 0)
        {
            int rem = temp % 10;
            for(int i = 1;i <= rem; i++)
            {
                fact *= i;
            }
            sum += fact;
            temp = temp / 10;
            fact = 1;
        }
        System.out.println(sum == n ? n + " is a strong number" : n + " is not a strong number");
    }
}
