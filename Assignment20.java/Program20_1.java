import java.util.Scanner;

class Logic
{
    
  public void SumEvenNumbers(int num)
    {
        int iCnt=0;
        int sum=0;
        for(iCnt=1; iCnt<num; iCnt++)
        {
            if(iCnt % 2==0)
            {
                sum=sum+iCnt;
            }
        }
        System.out.println(sum);
        
    }
}

class Program20_1
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