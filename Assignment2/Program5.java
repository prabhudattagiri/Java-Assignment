/*Write a java program compute following series and take a numbers num as input  x-x3/3! + x5/5!-x7/7!+------+xn/n!
 where x=sum of all even digits except 2 and 8
 and n= sum of all odd digits except 1 and 3 */
import java.util.Scanner;

public class Program5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;
        double result;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int x = 0, n = 0;
        while (num > 0) 
        {
            int t = num % 10;
            if (t % 2 == 0) //Even Number 
            {
                if (t != 2 && t != 8) //Except 2 and 8
                {
                    x += t; //x = sum of even number except 2 & 8
                }
            } 
            else //Automatically odd
            {
                if (t != 1 && t != 3)
                {
                    n += t;
                }
            }
            num = num/10;
        }
        result = x;
        for (int i = 3; i <= n; i = i + 2) 
        {
            long pow=1,fact=1;
            for(int j=1;j<=i;j++)
            {
                pow=pow*x;
                fact=fact*j;
            }
            double r=(double) pow/fact;
            result = (count%2==0? result+r: result-r);
            count++;
        }
        System.out.println("The result of the series: " + result);
        sc.close();
    }
}
