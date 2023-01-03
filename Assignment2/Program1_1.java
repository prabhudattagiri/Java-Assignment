/*1. Write a java program to find following using looping and decision making 
without function
I. Sum of all digits of any numbers */
import java.util.Scanner;
class Program1_1
{
    public static void main(String[] args) 
    {
        int number,num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        num=sc.nextInt();
        number=num;
        while (num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("Sum of digit of number "+number+" is "+sum);
        sc.close();
    }
}