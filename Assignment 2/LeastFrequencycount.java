// Find the least frequently occurring element.

class LeastFrequncy
{
    void Count(int arr[],int size)
    {
        int mincount=0;
        int minFrequency=arr[0];
        int iCount=0;

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    iCount++;
                }
            }
            if(iCount < mincount)
            {
                iCount=mincount;
                minFrequency=arr[i];
            }
        }
        System.out.println("leastfrquenly Element is:"+minFrequency);
        System.out.println(mincount+":time occurs");
    }
}

public class LeastFrequencycount
{
    public static void main(String[] args) 
    {
        int arr[]={11,33,55,78,89,11,56,89,9,11,11,33,11,55};

        int size=arr.length;

        LeastFrequncy lobj=new LeastFrequncy();

        lobj.Count(arr,size);
    
        

    }
    
}
