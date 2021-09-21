class ArmstrongNumberRA
{
    int sum = 0;

    public static void main(String [] args)
    {
        ArmstrongNumberRA a = new ArmstrongNumberRA();
        System.out.println(a.checkArmstrong(1));
    }
    
    public boolean checkArmstrong(int num)
    {
        int cubeSum = sumOfCube(num);
        return cubeSum == num;
    }
    
    public int sumOfCube(int num)
    {
        int cu = 1;
        if (num != 0)
        {
            int rem = num % 10;
            cu = cube(rem);
            sum += cu;
            sumOfCube(num / 10);
        }
        return sum;
    }
    
    public int cube(int num)
    {
        return num * num * num;
    }
}
