/*
    Program: Check Perfect Number
    Description: Accepts a number and checks whether it is a perfect number.
    Concepts:
        - Class and Object
        - Method
        - for loop
        - Modulus operator
        - Boolean value
    Author: Mayuri Bondge
*/

import java.util.Scanner;

class ChckPerfect
{
    boolean checkperfect(int iNo)
    {
        int iSum = 0;

        for(int iCnt = 1; (iCnt <= (iNo / 2)) && (iSum <= iNo); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum == iNo;
    }
}

public class check_perfect
{
    public static void main(String[] args)
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        ChckPerfect cobj = new ChckPerfect();

        System.out.println("Enter a number:");
        iNo = sobj.nextInt();

        bRet = cobj.checkperfect(iNo);

        if(bRet)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }

        sobj.close();
    }
}