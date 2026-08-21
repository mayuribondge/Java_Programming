
import java.util.Scanner;

class Descending
{
    void Display(int arr[],int isize)
    {
        int temp=0;

        for(int i=0;i<isize-1;i++)
        {
            for(int j=0;j<isize-1-i;j++)
            {
                if(arr[j] < arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

public class DescendingOrder 
{
    public static void main(String[] args)
    {
        int arr[]=null;
        int isize=0;

        Scanner sobj=new Scanner(System.in);
        Descending aobj=new Descending();

        System.out.println("Enter a number to store on array in asscending order");
        isize=sobj.nextInt();

        arr=new int[isize];

        for(int i=0;i<isize;i++)
        {
            arr[i]=sobj.nextInt();
        }

        aobj.Display(arr,isize);

        System.out.println("Asscending order list:");

        for(int i=0;i<isize;i++)
        {
            System.out.println(arr[i]);
        }
   
    }
    
}
