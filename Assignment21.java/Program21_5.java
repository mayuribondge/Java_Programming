import java.util.Scanner;


class Logic
{
    public void DisplayDivisibleBy2And3(int n)
    {
        if(n < 1)
        {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        System.out.println("Numbers between 1 and " + n + " divisible by both 2 and 3:");

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)   
            {
                System.out.print(i + " ");
            }
        }

    }
}

// Main class
class Program21_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.print("Enter the value of N: ");
        value = sc.nextInt();

        Logic obj = new Logic();                 
        obj.DisplayDivisibleBy2And3(value);        
    }
}
