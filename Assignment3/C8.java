/*Write a program to search for a user defined number in array of 20 numbers using linear search 
and binary search using class and object? Allow user to choose searching method. */
import java.util.Scanner;

class Searching
{
    int linear(int arr[],int x)
    {
        int index=-1;
        for(int i=0;i<20;i++)
        {
            if(arr[i]==x)
            {
                index = i;
            }
        }
        return index;
    }
    int binary(int arr[],int x)
    {
        //Binary search implemented only sorted arry
        int low=0,high=19,mid,index=-1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid]==x)
               return mid;
            else if(arr[mid]<x)
               low=mid+1;
            else
               high=mid-1;
        }
        return index;
    }
}

public class C8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Searching s = new Searching();
        int arr[]= new int [20];
        int index=-1;
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter "+(i+1)+" Element to array : ");
            arr[i]=sc.nextInt();
        }
        //sorting array
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<19;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Enter a number to search in the array : ");
        int n = sc.nextInt();
        System.out.println("Choose Searching Method :\n Linear Search (type =1) \n Binary Search (type 2)");
        int choose = sc.nextInt();
        if(choose == 1)
        {
            index=s.linear(arr,n);
        }
        else if(choose ==2)
        {
            index= s.binary(arr,n);
        }
        else
        {
            System.out.println("You choose invalid option for searching ");
        }
        if(index == -1)
        {
            System.out.println(n+" is not present inside array ");
        }
        else
        {
            System.out.println(n+" is present at "+index+" position in the array");
        }
        sc.close();
    }
}
