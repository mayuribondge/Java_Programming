
//Input 10
// 2    4   6   8   10

import java.util.Scanner;

class Display
{
    void display(int num)
    {
        for(int icnt=2;icnt<=num;icnt=icnt+2)
        {
            System.out.print(icnt+ "\t");
        }
    }
}

public class program29 
{
    public static void main(String a[])
    {
        int num=0;

        Display dobj=new Display();
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter a number:");
        num=sobj.nextInt();

        dobj.display(num);
    }
    
}
