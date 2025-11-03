import java.util.Scanner;


class Logic
{
    public void CheckDivisible(int num)
    {
        if(num % 5==0 && num % 11==0)
        {
            System.out.println("number is divisible 5 and 11");
        }
        else
        {
            System.out.println("number is not divisible 5 and 11");
        }
    }
}

class Program19_3
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        Logic lobj= new Logic();

        lobj.CheckDivisible(num);

    }
}