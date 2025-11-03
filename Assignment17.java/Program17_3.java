
import java.util.Scanner;


class Logic
{
    public int FindMax(int iNo1, int iNo2)
    {
        if(iNo1>iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }
}

class Program17_3
{
    public static void main(String a[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a first number");
        int num1=sc.nextInt();

        System.out.println("Enter a Second number");
        int num2=sc.nextInt();

        Logic lobj= new Logic();

        int max= lobj.FindMax(num1, num2);

        System.out.println("Maximum of two numbers" +max);

        sc.close();
    }
}