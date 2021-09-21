class PatternZR
{
    public static void main(String [] args)
    {
        PatternZR p = new PatternZR();
        p.createZ(5);
    }
    
    int i = 1;
    int j = 1;
    
    public void createZ(int row)
    {
        if(i <= row)
        {
            createNextLine(row);
            i++;
            createZ(row);
        }
    }
    
    public void createNextLine(int row)
    {
        PatternZR p = new PatternZR();
        p.createZInner(row);
        System.out.println();
    }
    
    public void createZInner(int count)
    {
        if(j <= count)
        {
            if (i == 1 || i == 5 || i + j == count + 1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            j++;
            createZInner(count);
        }
    }
}
