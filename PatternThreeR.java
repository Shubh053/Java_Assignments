/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/

class PatternThreeR
{
    // Main method
    public static void main(String [] args)
    {
        PatternThreeR p = new PatternThreeR();
        p.createPattern(5);
    }
    
    int i = 1, j = 1, x = 5;
    
    // Outer loop for 5 rows
    public void createPattern(int row)
    {
        if(i <= row)
        {
            createNextLine(row);
            i++;
            createPattern(row);
        }
    }
    
    // Method for printing next line
    public void createNextLine(int row)
    {
        PatternThreeR p = new PatternThreeR();
        p.createInner(row);
        System.out.println();
    }
    
    //  Inner loop for pritning 5 digits
    public void createInner(int count)
    {
        if(j <= count)
        {
            System.out.print(x--);
            j++;
            createInner(count);
        }
    }
}
