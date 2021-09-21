/*
22222
44444
66666
88888
*/

class PatternTwoR
{
    // Main method
    public static void main(String [] args)
    {
        PatternTwoR p = new PatternTwoR();
        p.createPattern(4);     // for printing 4 rows
    }
    
    int i = 1;
    int j = 1;
    static int x = 2;
    
    // Method for creating outer loop
    public void createPattern(int row)
    {
        if(i <= row)
        {
            createNextLine(row);
            i++;
            x += 2;
            createPattern(row);
        }
    }
    
    // Method for print next line
    public void createNextLine(int row)
    {
        PatternTwoR p = new PatternTwoR();
        p.createInner(row + 1);     // to print 5 digits in a row
        System.out.println();
    }
    
    // Method for creating inner loop
    public void createInner(int count)
    {
        if(j <= count)
        {
            System.out.print(x);
            j++;
            createInner(count);
        }
    }
}
