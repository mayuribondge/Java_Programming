import java.util.Scanner;

class Logic
{
    public void CalculatePower(int Base, int expo)
    {
        int iCnt=0;
        int Reult=1;
        for(iCnt=1; iCnt<=expo; iCnt++)
        {
            Reult=Reult*Base;
        }
        System.out.println("Power is" +Reult);
           
    }
}

class Program19_5
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Base");
        int Num1=sc.nextInt();

        System.out.println("Enter a exponent");
        int Num2=sc.nextInt();

        Logic lob= new Logic();

        lob.CalculatePower(Num1, Num2);
    }
}
