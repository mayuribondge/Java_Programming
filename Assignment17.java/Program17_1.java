
import java.util.Scanner;

class Logic
{
    public int SumOfDigit(int num)
    {
        int sum=0;
        int digit;
        if(num < 0)
        {
            num=-num;
        }
        while(num!=0)
        {
            digit=num % 10;
            sum=sum+digit;
            num=num / 10;
        }
        return sum;

    }
}
class Program17_1
{
    public static void main(String[] args)
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        Logic lobj= new Logic();

        int result= lobj.SumOfDigit(num);

        System.out.println("Sum of digit,"+result);

        sc.close();
        
    }
}