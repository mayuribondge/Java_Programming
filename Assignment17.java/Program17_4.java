
import java.util.Scanner;

class Logic
{
    public int FindMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1>iNo2)
        {
            return  iNo2;
        }
        else if(iNo1<iNo2)
        {
            return iNo1;
        }
        else
        {
            return  iNo3;
        }

    }
}
class Program17_4
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a first number");
        int inum1=sc.nextInt();

        System.out.println("Enter a second number");
        int inum2=sc.nextInt();

        System.out.println("Enter a third number");
        int inum3=sc.nextInt();


        Logic lobj= new Logic();

        int min=lobj.FindMin(inum1, inum2, inum3);

        System.out.println("Minimum numbers" +min);
    }
}