class HollowDiamondPattern
{
    public static void main(String[] args)
    {
        int row = 7;
        int count = 1;
        int space = row / 2;
       for(int i=1; i<=row; i++)
       {
            for(int j = 1; j<= space; ++j)
            {
                System.out.print(" ");
            }
            for(int k = 1; k < count; ++k)
            {
                System.out.print("* ");
            }
            if (i <= row / 2)
            {
                space--;
                count++;
            }
            else
            {
                space++;
                count--;
            }
            System.out.println();
        }
    }
}
