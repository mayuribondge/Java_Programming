
import java.util.Scanner;


class Logic
{
    public boolean  CheckPrime(int iNo)
    {
        int iCnt=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=2; iCnt<=iNo;iCnt++)
        {
            if(iNo % 2!=0)
            {
                return true;
            }
            
        }
        return  false;
    }
}

class Program18_1
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number ");
        int iNum=sc.nextInt();

        Logic lobj= new Logic();

        boolean bRet=lobj.CheckPrime(iNum);

        if(bRet==true)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not prime" );
        }
    }
}