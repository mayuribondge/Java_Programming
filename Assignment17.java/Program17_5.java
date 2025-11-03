
import java.util.Scanner;


class Logic
{
    public void PrintTable(int iNo)
    {
        int iCnt=0;
        for(iCnt=2;iCnt<=10;iCnt++)
        {
            System.err.println(iNo*iCnt);
        }
        
    }
}
   

class Program17_5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a table");
        int Num=sc.nextInt();

        Logic lobj=new Logic();

        lobj.PrintTable(Num);

    }
}