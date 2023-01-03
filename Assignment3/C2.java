/* Write a program to give information about any number such as whether it is even odd, prime or 
not prime, or positive or negative, palindrome or not using class and object? */

import java.util.Scanner;
class Number
{
    int num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        num=sc.nextInt();
        sc.close();
    }
    void evenOdd()
    {
        if(num%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
    void positiveNegative()
    {
        if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else if(num<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
    void primeOrNot()
    {
        int count=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
    }
    void pallindrome()
    {
        int n=num;
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(num==rev)
        {
            System.out.println("Number is Pallindrome");
        }
        else
        {
            System.out.println("Number is Not Pallindrome");
        }
    }
}
public class C2 
{
    public static void main(String[] args) 
    {
        Number n1 = new Number();
        n1.input();
        n1.evenOdd();
        n1.positiveNegative();
        n1.primeOrNot();
        n1.pallindrome();
    }
}
