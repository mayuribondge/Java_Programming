import java.util.Scanner;


class Logic
{
    public int reverseNumber(int num)
    {
        int rev = 0;  
        while(num != 0)
        {
            int digit = num % 10;     
            rev = (rev * 10) + digit; 
            num = num / 10;           
        }

        return rev;
    }
}


class Program16_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = sobj.nextInt();   
        Logic obj = new Logic();      
        int result = obj.reverseNumber(value);  

        System.out.println("Reversed number is: " + result);

        sobj.close();
    }
}
