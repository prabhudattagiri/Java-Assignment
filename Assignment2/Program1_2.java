/* Sum of all even digits of any number */
import java.util.Scanner;
public class Program1_2 {
    public static void main(String[] args) {
        int number,num,sum=0,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        num=sc.nextInt();
        number=num;
        while (num!=0)
        {
            t=num%10;
            if(t%2==0)
            {
                sum=sum+t;
            }
            num=num/10;
        }
        System.out.println("Sum of even digit of "+number+" is "+sum);
        sc.close();
    }
}
