/*Find sum of product of corresponding digits of two any 4 digit 
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1 */
import java.util.*;

public class Program5_5
{
    public static void main(String args[])
    {
    int m ,m1,m2,m3,m4, n,n1,n2,n3,n4,result;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    m=sc.nextInt();
    System.out.print("Enter Second Number : ");
    n=sc.nextInt();
    m1=m/1000;
    m2=(m/100)%10;
    m3=(m/10)%10;
    m4=m%10;
    n1=n/1000;
    n2=(n/100)%10;
    n3=(n/10)%10;
    n4=n%10;
    result=m1*n1+m2*n2+m3*n3+m4*n4;
    System.out.println("Sum of product of corresponding digits of two 4 digit number "+n+" and "+m+" is "+result);
    sc.close();
    }
}
