import java.util.Scanner;

class Logic
{
    public void FindLargestDigit(int num)
    {
        int digit = 0;
        int max = 0;

        while(num != 0)
        {
            digit = num % 10;     
            if(digit > max)       
            {
                max = digit;      
            }
            num = num / 10;       
        }

        System.out.println("Largest digit is: " + max);
    }
}

class Program20_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Num = sc.nextInt();

        Logic lobj = new Logic();
        lobj.FindLargestDigit(Num);
    }
}
