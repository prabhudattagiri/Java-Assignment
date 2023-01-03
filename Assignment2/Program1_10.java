/*Sum of product of consecutive prime digits of any digit number */
import java.util.Scanner;
public class Program1_10 {
    public static void main(String args[]) {
        int num, number, d1, d2, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        number = num;
        while (num != 0) 
        {
            d1 = num % 10;
            num = num / 10;
            d2 = num % 10;
            int d1count=0,d2count=0;
            for(int i=1;i<=d1;i++)
            {
                if(d1%i==0)
                {
                    d1count++;
                }
            }
            for(int i=1;i<=d2;i++)
            {
                if(d2%i==0)
                {
                    d2count++;
                }
            }
            if(d1count==2 && d2count==2)
            {
                sum=sum+(d1*d2);
            }
        }
        System.out.println("Sum of product of consecutive prime digits of " + number + " is : " + sum);
        sc.close();
    }
}
