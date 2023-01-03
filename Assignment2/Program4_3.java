//1+x2/2! + x4/4!+x6/6!+------+xn/n!

import java.util.Scanner;

public class Program4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.print("Enter the value of x : ");
        x=sc.nextInt();
        System.out.print("Enter the value of n : ");
        n=sc.nextInt();
        double result=1;
        for(int i=2;i<=n;i=i+2)
        {
            long pow=1,fact=1;
            for(int j=1;j<=i;j++)
            {
                pow=pow*x;
                fact=fact*j;
            }
            double r=(double) pow/fact;
            result = result+r;
        }
        System.out.println("Result = "+result);
        sc.close();
    }
}
