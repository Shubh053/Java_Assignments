class StrongNumberR
{
	public static int factorial(int num)
	{
		   if(num<=0)
		   {
		    return 1;
		    }
		   else
		   {
		   return num*factorial(num-1);
		   }
		}
		
	int sum=0;
	
	public int checkStrong(int num)
	{
	    int fact;
	    
	     if(num>0)
	     {
	         fact=1;
	         int rem=num%10;
	         checkStrong(num/10);
	         fact=factorial(rem);
	         sum+=fact;
	     }
	     return sum;
	     }	

	public static void main(String[] args) {
	    int num = 145;
	    StrongNumberR s =new StrongNumberR();
	    System.out.println(s.checkStrong(num) == num ? "It is a strong number" : "It is not a strong number");
	}
}
