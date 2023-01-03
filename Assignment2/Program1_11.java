
/*Difference between Sum of product of consecutive even digits 
except 2 and 6 and Sum of product of consecutive odd digits 
except 3 and 7 of any digit number*/
import java.util.Scanner;

public class Program1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,d1,d2,sumEven=0,sumOdd=0,diff;
        System.out.print("Enter a Number :"); 
        num=sc.nextInt();
        while(num!=0)
        {
            d1=num%10;
            num=num/10;
            d2=num%10;
            if (d1 % 2 == 0 && d2 % 2 == 0) {
                if (d1 != 2 && d1 != 6 && d2 != 2 && d2 != 6) {
                    sumEven =sumEven+( d1 * d2);
                }
            }
            if (d1 % 2 != 0 && d2 % 2 != 0) {
                if (d1 != 3 && d1 != 7 && d2 != 3 && d2 != 7) {
                    sumOdd =sumOdd+ (d1 * d2);
                }
            }
        }
        diff = sumEven - sumOdd;
        System.out.println("The difference is: " + diff);
        sc.close();
    }
}
