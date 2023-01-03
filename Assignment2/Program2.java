/*Write a java program to find sum of product of corresponding digits of two 
any digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1 */
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1,num2,sum=0,n,m;
      System.out.print("Enter first Number :");  
      num1=sc.nextInt();
      System.out.print("Enter second Number :");
      num2=sc.nextInt();
      while(num1 !=0 || num2!=0)
      {
        n=num1%10;
        m=num2%10;
        sum=sum+(m*n);
        num1=num1/10;
        num2=num2/10;
      }
      System.out.println("Sum = "+sum);
      sc.close();
    }
}
