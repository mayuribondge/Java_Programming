/*
    Program: Display Factors of a Number
    Description: Accepts a number and displays its factors using a for loop.
    Concepts:
        - Class and Object
        - Method
        - for loop
        - Modulus operator
        - Scanner
    Author: Mayuri Bondge
*/

import java.util.Scanner;

class DisplayFactor
{
    public void factors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

public class display_factors
{
    public static void main(String[] args)
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        DisplayFactor dobj = new DisplayFactor();

        System.out.println("Enter a number to find the factors:");
        iNo = sobj.nextInt();

        dobj.factors(iNo);

        sobj.close();
    }
}