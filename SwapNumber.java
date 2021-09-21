class SwapNumber
{
    public static void swap(int x, int y)
    {
        System.out.println("Numbers before swapping are: " + x + " , " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Numbers after swapping are: " + x + " , " + y);
    }
    
    public static void main(String [] args)
    {
        swap(25,67);
    }
}
