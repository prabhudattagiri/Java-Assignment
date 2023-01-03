/* Find the value available at position required by user it may be 10, 
100 or 1000? */
import java.util.Scanner;

class Program5_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit Number :");
        int num = sc.nextInt();
        int d1 = num/1000;
        int d2 = (num/100)%10;
        int d3 = (num/10)%10;
        int d4 = num%10;
        System.out.print("Which position Value You want to find (1,10,100,1000) :");
        int n =sc.nextInt();
        int result = (n==1?d4:(n==10?d2:(n==100?d3:(n==1000?d1:0))));
        System.out.println("Value Available at position "+n+" is "+result);
        sc.close();
    }
}