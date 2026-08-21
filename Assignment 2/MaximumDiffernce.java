/*
    Program: Find Maximum Difference Between Two Elements

    Description:
    This program finds the largest and smallest elements in an
    integer array and calculates the maximum difference between them.

    Concepts:
    - Arrays
    - Array Traversal
    - Finding Maximum Element
    - Finding Minimum Element
    - User-Defined Method
    - Class and Object

    Author: Mayuri Bondge
*/

class MaximumDifference
{
    int difference(int arr[], int size)
    {
        int small = arr[0];
        int large = arr[0];

        for(int i = 1; i < size; i++)
        {
            if(arr[i] > large)
            {
                large = arr[i];
            }

            if(arr[i] < small)
            {
                small = arr[i];
            }
        }

        return large - small;
    }
}

public class MaximumDifference
{
    public static void main(String[] args)
    {
        int arr[] = {10, 5, 25, 8, 15};

        int size = arr.length;

        MaximumDifference mobj = new MaximumDifference();

        int result = mobj.difference(arr, size);

        System.out.println("Maximum Difference is: " + result);
    }
}