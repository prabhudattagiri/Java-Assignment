/* Write a program to find average of the numbers available in left and right side of the number 
required by user if available in an array of 10 user defined number otherwise replace the item of
the array placed in middle position with the number required by user and calculate output? */

import java.util.Scanner;

public class A2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[10];
        int num ,position=-1;
        float avg;
        boolean available =false;
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter "+(i+1)+" Element to array : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Number you want to search : ");
        num=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(num == arr[i])
            {
                position=i;
                available =true;
                break;
            }
        }
        if(available)
        {
            avg= (float) (arr[position-1]+arr[position+1]/2);
            System.out.println("Average of left and right side of Number is "+avg);
        }
        else
        {
            arr[5]=num;
            avg=(float) (arr[4]+arr[6])/2;
            System.out.println("Average of left and right side of Middle Number is "+avg);
        }
        sc.close();
    }
}