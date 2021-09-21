class PatternOneR
{
    public static void main(String [] args)
    {
        PatternOneR p = new PatternOneR();
        p.createPattern(5);
    }
    
    int i = 1;
    int j = 1;
    
    public void createPattern(int row)
    {
        if(i <= row)
        {
            createNextLine(row);
            i++;
            createPattern(row);
        }
    }
    
    public void createNextLine(int num)
    {
        PatternOneR p = new PatternOneR();
        p.createPatternInner(num);
        System.out.println();
    }
    
    public void createPatternInner(int count)
    {
        if(j <= count)
        {
            System.out.print(j + " ");
            j++;
            createPatternInner(count);
        }
    }
}
