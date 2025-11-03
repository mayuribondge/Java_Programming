import java.util.Scanner;


class Logic
{
    public void CountEvenOdd(int n)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)   
            {
                evenCount++;
            }
            else              
            {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}

// Main class
class Program21_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter the value of N: ");
        num = sc.nextInt();

        Logic obj = new Logic();  
        obj.CountEvenOdd(num);    
    }
}
