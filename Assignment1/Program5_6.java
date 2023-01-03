/*Find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit 
number? */
import java.util.*;
public class Program5_6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,d2,d4;
        System.out.print("Enter a 4 digit Number : ");
        num=sc.nextInt();
        d2=(num/100)%10;
        d4=num%10;
        System.out.println("Bitwise and of 2nd and 4th digit: " + (d2 & d4));
        System.out.println("Bitwise or of 2nd and 4th digit: " + (d2 | d4));
        System.out.println("Bitwise xor of 2nd and 4th digit: " + (d2 ^ d4));
        sc.close();
    }
}
