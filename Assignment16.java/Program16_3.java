import java.util.Scanner;

class Factorial
{
    
    public int calculateFactorial(int num)
    {
        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;   
        }

        return fact;   
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = sobj.nextInt();   

        Factorial obj = new Factorial();  
        int result = obj.calculateFactorial(value);  
        System.out.println("Factorial of " + value + " is: " + result);

        sobj.close();
    }
}
