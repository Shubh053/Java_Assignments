class Pyramid
{
    public void createPyramid(int row)
    {
        int space = row - 1;
        int count = 1;
        
        for(int i = 1;i <= row; i++)
        {
            for(int j = 1; j<= space; j++)
            {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= count; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            space--;
            count++;
        }
    }
    
    public static void main(String [] args)
    {
        Pyramid pattern = new Pyramid();
        pattern.createPyramid(5);
    }
}
