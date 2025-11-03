import java.util.Scanner;
class palindrome
{
    public boolean  IsPalindrome(int num )
    {
        int reverse=0;
        int digit;
        int sum=0;
        int original=num;
        if(num < 0)
        {
            num=-num;
        }
        while(num!=0)
        {
            digit=num % 10;
            reverse=reverse*10+digit;
        }
        return (original==reverse);
    }
}
class Program17_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Eneter a number");

        int iValue=sc.nextInt();

        palindrome pobj= new palindrome();  

        if(pobj.IsPalindrome(iValue))
        {
            System.out.println(iValue + "Number is palindrom");
        }
        else
        {
            System.out.println( iValue + "Number is not palindrome");
        }
        sc.close();

    }
}