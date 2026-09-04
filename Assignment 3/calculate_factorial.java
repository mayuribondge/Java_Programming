import java.util.Scanner;

class CalculateFactorial
{
    int Factorial(int iNo)
    {
        int iFact=1;

        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            iFact=iFact*iCnt;
        }
        return iFact;
    }
    
}

public class program52 
{
    public static void main(String[] args)
    {
        int iNo=0,iRet=0;

        Scanner sobj=new Scanner(System.in);
        CalculateFactorial cobj =new CalculateFactorial();

        System.out.println("Enter a number:");
        iNo=sobj.nextInt();

        iRet=cobj.Factorial(iNo);

        System.out.println("Factorial is:" +iRet);
  
    }
    
}
