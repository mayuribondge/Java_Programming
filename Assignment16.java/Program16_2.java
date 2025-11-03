import java.util.Scanner;

class Program16_2
{
    
    public void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(num + " is an even number.");
        }
        else
        {
            System.out.println(num + " is an odd number.");
        }
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = sobj.nextInt();   

        EvenOdd obj = new EvenOdd();  
        obj.checkEvenOdd(value);
        sobj.close();
    }
}
