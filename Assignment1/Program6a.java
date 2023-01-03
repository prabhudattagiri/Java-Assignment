/* Sum of all even digits of any 4 digit number */
import java.util.*;

class Program6a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,d1,d2,d3,d4,sum=0;
        System.out.print("Enter a 4 digit Number :");
        num = sc.nextInt();
        d1=num/1000;
        d2=(num/100)%10;
        d3=(num/10)%10;
        d4=num%10;
        sum+=(d1%2==0?d1:0);
        sum+=(d2%2==0?d2:0);
        sum+=(d3%2==0?d3:0);
        sum+=(d4%2==0?d4:0);
        System.out.println("Sum of Even digit of "+num+" is "+sum);
        sc.close();
    }
}