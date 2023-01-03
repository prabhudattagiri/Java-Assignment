/* Sum of product of consecutive digits of any digit number*/
import java.util.Scanner;
public class Program1_7 {
    public static void main(String args[]){
        int num,number,d1,d2,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        number=num;
        while(num != 0)
        {
        d1 = num%10;
        num = num/10;
        d2 = num%10;
        sum = sum + (d1*d2);          
        }
        System.out.println("Sum of product of consecutive digits of "+number+" is : "+sum);
        sc.close();
    } 
}
