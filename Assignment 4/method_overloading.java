public class program21
{
    public static void Display()
    {
        System.out.println("Jay ganesh...");
        System.out.println("Jay ganesh...");
    }

    public static void Display(int x)
    {
        for(int i=0; i< x; i++)
        {
            System.out.println("Inside second stack");
            System.out.println("Jay ganesh...");
        }            
    }

    public static void main(String arg[])
    {
        Display();
        Display(2);
    } 
}

