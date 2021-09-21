class PatternS
{
    public static void main(String [] args)
        {
            int row = 8;
            
            for (int i = 1; i <= row; i++)
            {
                for (int j = 1; j <= row; j++)
                {
                    if (i == 1 || i == row || i == row - 4 || (i == 2 && j == 1) || (i == row -1 && j == 7))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
            }
        }
}
