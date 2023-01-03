//x-x3/3! + x5/5!-x7/7!+x11/11!------+xn/n!
import java.util.Scanner;

public class Program4_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,n,count=1;
        System.out.print("Enter the value of x : ");
        x=sc.nextInt();
        System.out.print("Enter the value of n : ");
        n=sc.nextInt();
        double result=x;
        for(int i=3;i<=n;i++)
        {
            boolean Notprime =false;
            long pow=1,fact=1;
            for(int j=1;j<=n;j++)
            {
                if(j!=1 && j!=i && i%j==0)
                {
                    Notprime=true;
                }
                pow=pow*x;
                fact=fact*j;
            }
            if(Notprime)
            {
                count++;
                continue;
            }
            double r=(double) pow/fact;
            result=(count%2==0 ? result+r : result-r);
        }
        System.out.println("Result is "+result);
        sc.close();
    }
}
