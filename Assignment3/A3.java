/* Write a program to sort 10 numbers in ascending order and find the sum and product of 2nd
smallest and 3rd largest number? */
import java.util.Scanner;

public class A3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int [10];
        int sum,product;
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter value "+(i+1)+" Number : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Number in the array in ascending order ");
        for(int i=0;i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }
        sum=arr[1]+arr[7];
        product=arr[1]*arr[7];
        System.out.println("\nSum of 2nd smallest and 3rd largest number is "+sum);
        System.out.println("Product of 2nd smallest and 3rd largest number is "+product);
        sc.close();

    }
}
