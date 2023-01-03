/*Difference between average of all even digits except divisible by 4 and 
avearge of all odd digits except divisble by 3 of any 4 digit number */
import java.util.*;

class Program6c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,d1,d2,d3,d4,sumEven=0,sumOdd=0,countEven=0,countOdd=0;
        float diff,avgEven,avgOdd;
        System.out.print("Enter a 4 digit Number :");
        num=sc.nextInt();
        d1=num/1000;
        d2=(num/100)%10;
        d3=(num/10)%10;
        d4=num%10;

        sumEven+=((d1%2==0 && d1%4!=0)?d1:0);
        countEven+=(d1%2==0?1:0);
        sumEven+=((d2%2==0 && d2%4!=0)?d2:0);
        countEven+=(d2%2==0?1:0);
        sumEven+=((d3%2==0 && d3%4!=0)?d3:0);
        countEven+=(d3%2==0?1:0);
        sumEven+=((d4%2==0 && d4%4!=0)?d4:0);
        countEven+=(d4%2==0?1:0);

        sumOdd+=((d1%2!=0 && d1%3!=0)?d1:0);
        countOdd+=(d1%2!=0?1:0);
        sumOdd+=((d2%2!=0 && d2%3!=0)?d2:0);
        countOdd+=(d2%2!=0?1:0);
        sumOdd+=((d3%2!=0 && d3%3!=0)?d3:0);
        countOdd+=(d3%2!=0?1:0);
        sumOdd+=((d4%2!=0 && d4%3!=0)?d4:0);
        countOdd+=(d4%2!=0?1:0);

        avgEven=sumEven/countEven;
        avgOdd=sumOdd/countOdd;
        diff=avgEven-avgOdd;

        System.out.println("Average of Sum of Even digit except divisible by 4 is "+avgEven);
        System.out.println("Average of Sum of Odd digit except divisble by 3 is "+avgOdd);
        System.out.println("Difference between average of all even digits except divisible by 4 and avearge of all odd digits except divisble by 3 of number "+num+" is "+diff);
        sc.close();
    }
}