class PatternXR
{
    public static void main(String [] args)
    {
        PatternXR p = new PatternXR();
        p.createX(5);
    }
    
    int i = 1;
    int j = 1;
    
    public void createX(int row)
    {
        if(i <= row)
        {
            createNextLine(row);
            i++;
            createX(row);
        }
    }
    
    public void createNextLine(int row)
    {
        PatternXR p = new PatternXR();
        p.createXInner(row);
        System.out.println();
    }
    
    public void createXInner(int row)
    {
        if(j <= row)
        {
            if(i == j || i + j == row + 1)
            {
                System.out.print("*");
            }
            else
            {
            System.out.print(" ");
            }
            j++;
            createXInner(row);
        }
    }
}
