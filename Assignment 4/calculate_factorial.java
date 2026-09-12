
import java.util.Scanner;

public class program
{
    int ans=0;

    int factor(int num)
    {
        for(int i=num;i>=1;i--)
        {
            ans=ans*i;
        }   
        return ans; 
    }
}

class program20
{
    public static void main(String[] args) 
    {
        int num=0,result=0;

        Scanner sobj=new Scanner(System.in);
        program pobj=new program();

        System.out.println("Enter a number:");
        num=sobj.nextInt();

        result=pobj.factor(num);

        System.out.println("Factorization is:"+result);

    }
}