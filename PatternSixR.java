/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/

class PatternSixR
{
    // Main method
    public static void main(String [] args)
    {
        PatternSixR p = new PatternSixR();
        p.createPattern(5);
    }
    
    int i = 1, j = 1;
    static int x = 5, count = 5;
    
    // Outer loop for 5 rows
    public void createPattern(int row)
    {
        if(i <= row)
        {
            createNextLine();
            i++;
            x--;
            createPattern(row);
        }
    }
    
    // Method for printing next line
    public void createNextLine()
    {
        PatternSixR p = new PatternSixR();
        p.createInner(count--);
        System.out.println();
    }
    
    // Inner loop for decreasing digits
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
