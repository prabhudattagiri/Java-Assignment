/* WAP to check weather a number is Armstrong number or not using custom exception and interface?  */
import java.util.Scanner;

class MyExcp extends Exception
{
    int a;
    public MyExcp(int x)
    {
        a =x;
    }
    public String toString()
    {
        String msg = a+" is not a Armstrong Number ";
        return msg;
    }
}

class Q2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        int num=n;
        int arm=0;
        sc.close();
        try
        {
            while(n!=0)
            {
                int i=n%10;
                arm=arm+(i*i*i);
                n=n/10;
            }
            if(arm==num)
            {
                System.out.println(num+" is Armstrong");
            }
            else
            {
                throw new MyExcp(num);
            }
        }
        catch(MyExcp me)
        {
            System.out.println(me);
        }
    }
}