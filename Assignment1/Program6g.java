/*Write a java program to find sum of product of corresponding even digits of 
first any digit number and corresponding odd digit of any 4 digit number Such as 
n=1234 m=4567 output=4*7+2*5 */
import java.util.*;
class Program6g
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,sum=0,n1,n2,n3,n4,m1,m2,m3,m4;
        System.out.print("Enter two 4 digit Number :");
        n=sc.nextInt();
        m=sc.nextInt();

        n1=n/1000;
        n2=(n/100)%10;
        n3=(n/10)%10;
        n4=n%10;

        m1=m/1000;
        m2=(m/100)%10;
        m3=(m/10)%10;
        m4=m%10;

        sum+=(n1%2==0 && m1%2!=0)?n1*m1:0;
        sum+=(n2%2==0 && m2%2!=0)?n2*m2:0;
        sum+=(n3%2==0 && m3%2!=0)?n3*m3:0;
        sum+=(n4%2==0 && m4%2!=0)?n4*m4:0;
        System.out.println("sum of product of corresponding even digits and corresponding odd digit is "+sum);
        sc.close();
    }
}