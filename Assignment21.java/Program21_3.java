import java.util.Scanner;


class Logic
{
    public void DisplayFactors(int num)
    {
        if(num <= 0)
        {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.println("Factors of " + num + " are:");

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)   
            {
                System.out.print(i + " ");
            }
        }

        System.out.println(); 
    }
}


class Program21_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.print("Enter a number: ");
        value = sc.nextInt();

        Logic obj = new Logic();         
        obj.DisplayFactors(value);       
    }
}
