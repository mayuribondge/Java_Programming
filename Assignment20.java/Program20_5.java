import java.util.Scanner;

class Logic
{
    public void FindSmallestDigit(int num)
    {
        int digit = 0;
        int min = num % 10;   
        num = num / 10;      

        while(num != 0)
        {
            digit = num % 10;     

            if(digit < min)     
            {
                min = digit;
            }

            num = num / 10;     
        }

        System.out.println("Smallest digit is: " + min);
    }
}

class Program20_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Num = sc.nextInt();

        Logic lobj = new Logic();
        lobj.FindSmallestDigit(Num);
    }
}
