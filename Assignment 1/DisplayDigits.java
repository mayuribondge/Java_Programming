
import java.util.Scanner;

class Digit
{
    public int DisplayDigit(int iNo)
    {
        int iDigit=0,iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo % 10;
            System.out.println(iDigit);
            iNo=iNo / 10;
            iCount++;
        }
        return  iCount;
    }
}

public class program40
{
    public static void main(String[] args) 
    {
        int iNo=0,iRet=0;

        Scanner sobj = new Scanner(System.in);
        Digit dobj=new Digit();

        System.out.println("Enter a number:");
        iNo=sobj.nextInt();

        iRet=dobj.DisplayDigit(iNo);

        System.out.println("Number of digit is:" +iRet);        
    }
    
}
