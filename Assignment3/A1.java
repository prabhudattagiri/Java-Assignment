/* Write a program to find average and also find total no. of odd, even, prime and palindrome 
number available in an array of 30 user defined numbers? */

import java.util.Scanner;

class A1
{
    public static void main(String[] args) 
    {
        int even=0,odd=0,prime=0,palindrome=0,sum=0;
        float avg;
        int arr []=new int [30];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<30;i++)
        {
            System.out.print("Enter value to "+ (i+1) +" Number in array : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<30;i++)
        {
            //For Sum of element
            int n=arr[i];
            sum=sum+n;

            //For Even & Odd
            if(n%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            //For prime Number
            int count =0;
            for(int j=1;j<=n/2;j++)
            {
                if(n%j==0)
                {
                    count++;
                }
            }
            if(count ==1)
            {
                prime++;
            }

            //For pallindrome Number
            int rev=0;
            int num=n;
            while(n!=0)
            {
                rev= (rev*10)+n%10;
                n=n/10;
            }
            if(num==rev)
            {
                palindrome++;
            }
        }
        avg=(float)sum/30;
        System.out.println("Total Number of Even Number is "+even);
        System.out.println("Total Number of Odd Number is "+odd);
        System.out.println("Total Number of Prime Number is "+prime);
        System.out.println("Total Number of Pallindrome Number is "+palindrome);
        System.out.println("Average of all element present in the array is "+avg);
        sc.close();
    }
}