
import java.util.Scanner;

class Display1
{
    int display(int num)
    {
        int iCount=0;
        for(int iCnt=0;iCnt<=num;iCnt++)
        {
            if(num % iCnt==0)
            {
                System.out.print(iCnt+ "\t");
                iCount++;
            }
        }
        return iCount;
    }
}

public class program33
{
    public static void main(String[] args) 
    {
        int num=0,res=0;

        Scanner sobj=new Scanner(System.in);
        Display1 dobj=new Display1();

        System.out.println("Enter a number:");
        num=sobj.nextInt();

        res=dobj.display(num);

        System.out.println("Number of factors is:"+res);
    }
    
}
