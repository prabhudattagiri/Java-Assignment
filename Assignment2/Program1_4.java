/* Sum of all prime digits of any number */
import java.util.Scanner;
public class Program1_4 {
    public static void main(String[] args) {
        int number,num,sum=0,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        num=sc.nextInt();
        number=num;
        while(num!=0)
        {
            int count=0;
            t=num%10;
            for(int i=1;i<=t;i++)
            {
                if(t%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                sum=sum+t;
            }
            num=num/10;
        }
        System.out.println("Sum of prime digit of "+number+" is "+sum);
        sc.close();
    }
}
