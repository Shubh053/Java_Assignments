class First50Palindrome
{
    public static void checkpalindrome(int n)
    {
        int count = 0;
        int num = 101;
        
        while(count < n)
        {
        int temp = num;
        int rev = 0;
        while (temp != 0)
        {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }
        
        if (rev == num)
        {
            System.out.print(rev + " ");
            count++;
        }
        num++;
        }
    }
    
    public static void main(String [] args)
    {
        checkpalindrome(50);
    }
}
