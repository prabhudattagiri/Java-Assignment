// Write a program to find factorial of difference between greatest and smallest number among 3 numbers?

import java.util.Scanner;

public class Program9 
{
    public static void main(String[] args) 
    {
        int num1, num2, num3, greatest, smallest, fact = 1, diff;
        System.out.println("Enter 3 numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        // for greatest
        if (num1 > num2 && num1 > num3)
        {
            greatest = num1;
        }
        else if (num2 > num1 && num2 > num3)
        {
            greatest = num2;
        }
        else
        {
            greatest = num3;
        }
        // for smallest
        if (num1 < num2 && num1 < num3)
        {
            smallest = num1;
        }
        else if (num2 < num1 && num2 < num3)
        {
            smallest = num2;
        }
        else
        {
            smallest = num3;
        }
        System.out.println("Greatest number is : " + greatest);
        System.out.println("Smallest number is : " + smallest);
        diff = greatest - smallest;
        for (int i = diff; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of differnce between greatest and smallest digit : " + fact);
        sc.close();
    }
}