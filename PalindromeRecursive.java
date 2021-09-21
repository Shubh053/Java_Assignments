class PalindromeRecursive
{
    int rev = 0;
    static int num = 454;
    int temp = num;

    public void checkPalindrome(int num)
    {
        if (temp != 0)
        {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
            checkPalindrome(temp);
        }
    }
    
    public static void main(String [] args)
    {
        PalindromeRecursive p = new PalindromeRecursive();
        p.checkPalindrome(num);
        System.out.println(num == p.rev ? num + " is a palindrome number" : num + " is not a palindrome number");
    }
}
