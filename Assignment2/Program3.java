/* Write a java program to find sum of product of corresponding even digits of 
first any digit number and corresponding odd digit of any digit number Such 
as n=1234 m=4567 output=4*7+2*5 */
import java.util.Scanner;

public class Program3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m,sum=0;
    System.out.print("Enter first digit :");
    n=sc.nextInt();
    System.out.print("Enter second digit :");
    m=sc.nextInt();
    while(n!=0 || m!=0)
    {
      int d1 = n%10;
      int d2= m%10;
      if(d1%2==0 && d2%2!=0)
      {
         sum=sum+d1*d2;
      }
      n=n/10;
      m=m/10;
    }
    System.out.println("sum of product of corresponding even digits of first any digit number and corresponding odd digit is "+sum);
    sc.close();
   } 
}