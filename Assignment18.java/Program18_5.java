import java.util.Scanner;
class Logic
{
    void CheckSign(int num)
    {
    
        if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else if(num < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}

class Program18_5
{
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int Num=sc.nextInt();

        Logic lobj=new Logic();

        lobj.CheckSign(Num);


    }
}