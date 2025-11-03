
import java.util.Scanner;


class Logic
{
    public void PrintEvenNumber(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;  iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program18_2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int iNum=sc.nextInt();

        Logic lobj= new Logic();

        lobj.PrintEvenNumber(iNum);
    }

}