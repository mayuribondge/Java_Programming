import java.util.Scanner;

class Logic
{
    public void DisplayGrade(int marks)
    {
        if(marks >=90 && marks<=100)
        {
            System.out.println("Garde is A+");
        }  
        else if(marks >=80 && marks<=90)
        {
            System.out.println("Grade is A");
        }
        else if(marks >=70 && marks <=80)
        {
             System.out.println("Grade is B");
        }
        else if(marks >=60 && marks <=70)
        {
             System.out.println("Grade is C");
        }
        else if(marks<=50)
        {
             System.out.println("FAIL");
        }

        else
        {
            System.out.println("please valid enter marks between 1 to 100");
        }
        
           
    }
}

class Program19_2
{
    public static void main(String a[])
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a marks");
        int Num=sc.nextInt();

        Logic lobj=new Logic();

        lobj.DisplayGrade(Num);

    }
}