/* Write a java program to compute following series and take input x and n
1-x^2/2! + x^3/3!-x^4/4!+------+x^n/n! */
import java.util.Scanner;

public class Program4_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x,n,count=1;
        double result =1;
        System.out.print("Enter the value of x : ");
        x=sc.nextInt();
        System.out.print("Enter the value of n : ");
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            long pow = 1, fact=1;
            for(int j=1;j<=i;j++)
            {
            pow=pow*x;
            fact=fact*j;
            }
            double r = (double) pow/fact;
            result = count%2==0 ? result+r : result-r;
            count++;
        }
        System.out.println("Result = "+result);
        sc.close();
    }    
}
