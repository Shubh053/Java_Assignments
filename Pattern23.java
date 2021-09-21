class Pattern23
{
    public static void main(String [] args)
    {
        int row = 4;
        int space = 3;
        int count = 1;
        
        for (int i = 0; i < row; i++)
        {
            int x = i;
            
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= count; k++)
            {
                
                if(x > 0)
                {
                    System.out.print(x--);
                }
                else if(x <= 0)
                {
                    System.out.print(x++);
                }
            }
        System.out.println();
        space--;
        count += 2;
        }
    }
}
