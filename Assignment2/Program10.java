// Write a program to generate Fibonacci series up to n terms? Value of n will be accepted from user?
import java.util.Scanner;

public class Program10
{
    public static void main(String[] args) 
    {
        int n, d1, d2, nextD;
        System.out.println("Enter n for fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Fibonacci series upto " + n + " digit: ");
        d1 = 0;
        d2 = 1;
        System.out.print(d1 + " " + d2 + " ");
        for (int i = 0; i <n; i++)
        {
            nextD = d1 + d2;
            System.out.print(nextD + " ");
            d1 = d2;
            d2 = nextD;
        }
        sc.close();
    }
}