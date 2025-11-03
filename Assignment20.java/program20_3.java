import java.util.Scanner;

class Logic
{
    public void CheckPerfect(int num)
    {
        int sum = 0;

        for(int i = 1; i <= num / 2; i++)  
        {
            if(num % i == 0)
            {
                sum = sum + i;  
            }
        }

        if(sum == num)
        {
            System.out.println(num + " is a Perfect Number");
        }
        else
        {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}

class program20_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Logic lobj = new Logic();
        lobj.CheckPerfect(num);
    }
}
