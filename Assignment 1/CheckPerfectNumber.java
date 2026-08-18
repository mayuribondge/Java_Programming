import java.util.Scanner;

class ChckPerfect
{
    boolean checkperfect(int iNo)
    {
       int iSum=0;

       for(int iCnt=1;(iCnt<=(iNo/2)) && (iSum < iNo) ;iCnt++)
       {
            if((iCnt % 2)==0)
            {
                iSum=iSum + iCnt;
            }
       }
       return iSum==iNo;    
    }
}

public class program48
{
    public static void main(String[] args)
    {
        int iNo=0;
        boolean bRet=false;

        Scanner sobj=new Scanner(System.in);
        ChckPerfect cobj = new ChckPerfect();

        System.out.println("Enter a number");
        iNo=sobj.nextInt();

        bRet=cobj.checkperfect(iNo);

        if(bRet)
        {
            System.out.println("Number is perfect");
        }
        else
        { 
            System.out.println("Number is not perfect");
        }

        sobj=null;
        cobj=null;

        System.gc();
    }  
}