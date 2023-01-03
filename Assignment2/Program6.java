/*Write a java program to check weather the given number is palindrome and prime or not? */

import java.util.Scanner;

public class Program6 
{
    public static void main(String[] args) 
    {
        int r, sum = 0, temp;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        temp = n;
        while (temp > 0) 
        {
            r = temp % 10; // getting remainder
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if (n == sum)
            System.out.println(n+"is palindrome number ");
        else
            System.out.println(n+"is not palindrome");

        int count = 0;
        for (int i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
                count++;
            }
        }
        if (count == 2) 
        {
            System.out.println(n+" is a prime number");
        } else 
        {
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
}
