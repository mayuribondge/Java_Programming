
import java.util.Scanner;

// Write a program to check the number is prime or not
class CheckPrime
{
    boolean checkprime(int num)
    {
        int iCount=0;
        for(int iCnt=2;iCnt<(num);iCnt++)
        {
            if((num % iCnt)==0)
            {
                iCount++;
                break;
            }
        }
        
        if(iCount==0)
        {
            return true;
        }
        else
        {
            return  false;
        }

    } 
}

public class program36
{
    public static void main(String[] args)
    {
        int num=0;
        boolean bRet=false;

        Scanner sobj=new Scanner(System.in);
        CheckPrime cobj=new CheckPrime();

        System.out.println("Enter a number:");
        num=sobj.nextInt();

        bRet=cobj.checkprime(num);

        if(bRet==true)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
        
    }
    
}
