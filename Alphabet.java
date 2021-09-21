import java.util.Scanner

class Calculator
{
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        
        System.out.print("Enter a operator: ");
        
        char operator = reader.next().charAt(0);
        
        double result = 0.0;
        
        switch(operator) {
        case '+':
            result = first + second;
            break;
            
        case '-':
            result = first - second;
            break;
            
        case '*':
            result = first * second;
            break;
            
        case '/':
            result = first / second;
            break;
        }
        
        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}
