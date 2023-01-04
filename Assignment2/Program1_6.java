/*Find kth digit from front side or back side of any digits number and find its positional value */
import java.util.Scanner;

class Program1_6 
{
    public static void main(String[] args) 
    {
        int num, kth, psb = 0, psf = 0; //psb=position from back
        int num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number :");
        num = sc.nextInt();
        System.out.print("Enter kth digit :");
        kth = sc.nextInt();

        int count=0;
        //from back side
        while (num > 0) 
        {
            count++;
            if (psb == 0 && count == kth) 
            {
                psb = num % 10;
            }
            num2 = (num2 * 10) + (num % 10);
            num = num / 10;
        }

        //from front side
        count=0;
        while (num2 > 0) 
        {
            count++;
            if (psf == 0 && count == kth) 
            {
               psf = num2 % 10;
            }
            num2 = num2 / 10;
        }
        System.out.println("Position from Front side : " + psf);
        System.out.println("Position from Back side : " + psb);
        sc.close();
    }
}