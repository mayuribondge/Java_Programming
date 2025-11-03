import java.util.Scanner;

class Logic
{
    void PrintDigit(int num)
    {
        int digit=0;
        while(num > 0)
        {
            digit=num % 10;
            System.out.println(digit);
            num=num / 10;
        }
    }
}

class Program19_4
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter a number");
        int Num=sc.nextInt();

        Logic lobj= new Logic();

        lobj.PrintDigit(Num);
    }
}
