class ArmstrongRecursive
{
    int num = 8208;
    static int count = 0;
    int p = 1;
    int x = 1;
    
    public void countDigit(int num)
    {
        if(num != 0)
        {
            count++;
            countDigit(num / 10);
        }
    }
    
    public  int pow(int num)
    {
        if(x <= count)
        {
            p  *=  num;
            x++;
            pow(num);
        }
        return p;
    }
    
    static int sum = 0;
    
    public int checkArmstrong(int num)
    {
        int cu;
        
        if(num != 0)
        {
            cu = 1;
            
            int rem = num % 10;
            ArmstrongRecursive a = new ArmstrongRecursive();
            cu = a.pow(rem);
            sum += cu;
            checkArmstrong(num / 10);
        }
        return sum;
    }
    
    public static void main(String [] args)
    {
        ArmstrongRecursive a = new ArmstrongRecursive();
        a.countDigit(a.num);
        System.out.println(a.checkArmstrong(a.num) == a.num ? "It is a armstrong number" : "It is not a armstrong number");
    }
}
