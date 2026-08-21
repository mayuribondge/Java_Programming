/*
    Program: Count Even Elements

    Description:
    This program accepts integer elements from the user and
    counts the total number of even elements present in the array.

    Concepts:
    - Arrays
    - for Loop
    - Conditional Statement
    - Modulus Operator
    - User-Defined Method
    - Class and Object
    - Scanner

    Author: Mayuri Bondge
*/

import java.util.Scanner;

class Display
{
    int countEvenElements(int arr[], int size)
    {
        int count = 0;

        for(int i = 0; i < size; i++)
        {
            if(arr[i] % 2 == 0)
            {
                count++;
            }
        }

        return count;
    }
}

public class CountEvenElements
{
    public static void main(String[] args)
    {
        int arr[] = null;
        int size = 0;
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        Display displayObject = new Display();

        System.out.println("Enter the number of elements:");
        size = scanner.nextInt();

        arr = new int[size];

        System.out.println("Enter the elements:");

        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        result = displayObject.countEvenElements(arr, size);

        System.out.println("Number of even elements: " + result);

        scanner.close();
    }
}