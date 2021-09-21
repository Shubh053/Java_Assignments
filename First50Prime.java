class First50Prime
{
   public static void checkprime(int n)
   {
      boolean flag = true;
      int num = 3;
      int i = 1;
      
      if (n >= 1)
      {
        System.out.println("First "+ n + " prime numbers are: ");
        System.out.print(2 + " ");
      }

      while (i < n)
      {
         for (int j = 2 ; j < num ; j++)
         {
            if ( num % j == 0 )
            {
               flag = false;
               break;
            }
         }
         if (flag)
         {
            System.out.print(num + " ");
            i++;
         }
         flag = true;
         num++;
      }         
   }
   
   public static void main(String [] args)
   {
    checkprime(50);
   }
}
