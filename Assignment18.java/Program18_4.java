import java.util.Scanner;
class Logic
{
    public void SumEvenOddDigit(int iNo)
    {
        int iCnt=0;
        int Esum=0;
        int Osum=0;
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2==0)
            {
                Esum=Esum+iCnt;
            }
        }
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt % 2 !=0)
            {
                Osum=Osum+iCnt;
            }
        }
        System.out.println("Sum of even numbers up to " + iNo + " is: " + Esum);
        System.out.println("Sum of odd numbers up to " + iNo + " is: " + Osum);
    }
}

class Program18_4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Eneter a number");
        int Num=sc.nextInt();

        Logic lobj= new Logic();

       lobj. SumEvenOddDigit(Num);
         
    }
}