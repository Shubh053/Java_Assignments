class BorderBoxPattern
{
    public static void main(String [] args)
    {
        int row = 8;
        int count = row;
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= row; j++)
            {
                if(i == 1 || i == row || j == 1 || j == count)
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
