/*Write a program to sort 10 numbers in descending order and average of 3rd largest and 4th
smallest number in an array of 10 user defined numbers? */
import java.util.Scanner;

public class A4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int [10];
        float avg;
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter value "+(i+1)+" Number : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Number in the array in descending order ");
        for(int i=0;i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }
        avg = (float) (arr[2]+arr[6])/2;
        System.out.println("\nAverage of 3rd largest and 4th smallest number is "+avg);
        sc.close();
    }
}
