/*Sum of all digits of any 4 digit numbers */
import java.util.*;
public class Program5_1
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 Digit Number :");
        int num = sc.nextInt();
        int sum=num%10+(num/10)%10+(num/100)%10+(num/1000)%10;
        System.out.println("Sum of digit in "+num+" is "+sum);
        sc.close();
    }
}
