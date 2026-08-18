
import java.util.Scanner;

class DisplayFactor
{
    public void factors(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=(iNo / 2);iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }    
    }
}

public class program44 
{
    public static void main(String[] args) 
    {
        int iNo=0;

        Scanner sobj=new Scanner(System.in);
        DisplayFactor dobj=new DisplayFactor();

        System.out.println("Enter a number to find the factorial:");
        iNo=sobj.nextInt();

        dobj.factors(iNo);

    }
    
}
