/*Difference between Sum of product of consecutive even digits except 2 
and 6 and Sum of product of consecutive odd digits except 3 and 7 of any 4 digit
number */
import java.util.*;
class Program6f
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,se=0,so=0,d1=0,d2=0,od1=0,od2=0,ed1,ed2;
        System.out.println("Enter a 4 digit Number : ");
        n=sc.nextInt();

        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;

        ed1=((d1%2==0)&&(d1!=2 && d1!=6))?d1:0;
        ed2=((d2%2==0)&&(d2!=2 && d2!=6))?d2:0;
        se+=ed1*ed2;

        od1=((d1%2!=0)&&(d1!=3 && d1!=7))?d1:0;
        od2=((d2%2!=0)&&(d2!=3 && d2!=7))?d2:0;
        so+=od1*od2;

        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;

        ed1=((d1%2==0)&&(d1!=2 && d1!=6))?d1:0;
        ed2=((d2%2==0)&&(d2!=2 && d2!=6))?d2:0;
        se+=ed1*ed2;

        od1=((d1%2!=0)&&(d1!=3 && d1!=7))?d1:0;
        od2=((d2%2!=0)&&(d2!=3 && d2!=7))?d2:0;
        so+=od1*od2;

        r=se-so;
        System.out.println("Sum of all even digits except 1 and 6 is "+se);
        System.out.println("Sum of all odd digits except 3 and 7 is "+so);
        System.out.println("Difference is "+r);
        sc.close();
    }
}