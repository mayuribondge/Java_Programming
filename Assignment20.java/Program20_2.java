import java.util.Scanner;

class Logic
{
    
  public void SumEvenNumbers(int num)
    {
        int iCnt=0;
        int sum=0;
        for(iCnt=num;iCnt >=1; iCnt++)
        {
             System.out.println(iCnt);
        }
    }
}

class Program20_2
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int Num=sc.nextInt();

        Logic lobj= new Logic();

        lobj.SumEvenNumbers(Num);
    }
}