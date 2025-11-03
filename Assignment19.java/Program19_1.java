import java.util.Scanner;

class Logic
{
    public void CheckLeapYear(int year)
    {
        if(year < 0)
        {
            year=-year;
        }
        if(year % 4==0)
        {
            System.out.println(" is leap year");
        }
        else
        {
            System.out.println("is not leap year");
        }
    }
    
}

class Program19_1
{
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a yearr");
        int Num=sc.nextInt();

        Logic lobj= new Logic();

        lobj.CheckLeapYear(Num);


    }
}