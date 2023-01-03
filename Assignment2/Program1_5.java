/* Difference between average of all even digits except divisible by
4 and average of all odd digits except divisible by 3  */

import java.util.Scanner;
public class Program1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,num,esum=0,osum=0,even=0,odd=0;
        float avgeven,avgodd,diff;
        System.out.print("Enter a Number :");
        num=sc.nextInt();
        number=num;
        while(num!=0)
        {
            int t = num%10;
            if(t%2==0 && t/4!=0)
            {
                esum=esum+t;
                even++;
            }
            if(t%2!=0 && t/3!=0)
            {
                osum=osum+t;
                odd++;
            }
            num=num/10;
        }
        avgeven=esum/even;
        avgodd=osum/odd;
        diff=avgeven-avgodd;
        System.out.println(" Difference between average of all even digits except divisible by 4 and \n average of all odd digits except divisible by 3  of number "+number+" is "+diff);
        sc.close();
        
    }
}
