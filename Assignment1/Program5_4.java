/*Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1 */
import java.util.*;
public class Program5_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 Digit Number :");
        int num = sc.nextInt();
        int d1 = num/1000;
        int d2 = (num/100)%10;
        int d3 = (num/10)%10;
        int d4 = num%10;
        int result =d1*d2+d2*d3+d3*d4;
        sc.close();
        System.out.println("Sum of product of consecutive digit of "+num+" is "+result);
    }
}
