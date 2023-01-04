/*. WAP to compute factorial, GCD, LCM, sqrt without using any library function, swap two number Without using 3rd variable using multithreading? */
import java.util.Scanner;
class Calulation
{
    int a,b;
    Calulation()
    {
        //default constructor
    }
    Calulation(int x,int y)
    {
        a=x;
        b=y;
    }

    void findGcd()
    {
        int gcd=1;
        int s=(a<b?a:b); //for smallest among a,b
        for(int i=1;i<=s;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is "+gcd);
    }
    void findLcm()
    {
        int lcm=1;
        int l=(a>b?a:b); //for largest among a,b
        for(int i=l;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println("LCM of "+a+" and "+b+" is "+lcm);
    }
    void swapping() //Without 3rd Variable
    {
        System.out.println("Before swapping First Number is "+a+" and Second Number is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping First Number is "+a+" and Second Number is "+b);
    }
    void sqroot() //Without library Function
    {
        Double temp;
        double sr =a/2;
        do
        {
            temp=sr;
            sr=(temp+(a/temp))/2;
        }while(temp-sr!=0);
        System.out.println("Square Root of "+a+" is "+sr);
    }
    void factorial()
    {
        long f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+a+" is "+f);
    }
}

class ThreadT implements Runnable
{
    Thread t;
    String tnm;
    Calulation p;
    ThreadT(String nm, Calulation q)
    {
        tnm=nm;
        p=q;
        t=new Thread(this,tnm);
        t.start();
    }
    public void run()
    {
        try
        {
            String tp = (String) Thread.currentThread().getName();
            if(tp.equals("gcd"))
            {
                p.findGcd();
            }
            if(tp.equals("lcm"))
            {
                p.findLcm();
            }
            if(tp.equals("sqroot"))
            {
                p.sqroot();
            }
            if(tp.equals("swap"))
            {
                p.swapping();
            }
            if(tp.equals("fact"))
            {
                p.factorial();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class Q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("1-GCD 2-LCM 3-SWAP 4-SqRoot 5-Factorial \nEnter Your choice :");
        int choice=sc.nextInt();
        
        if(choice==4 || choice==5)
        {
            System.out.print("Enter A Number :");
            a=sc.nextInt();
            b=0;
        }
        else
        {
            System.out.print("Enter Two Number :");
            a=sc.nextInt();
            b=sc.nextInt();
        }
        Calulation c = new Calulation(a,b);
        switch(choice)
        {
            case 1:
            new ThreadT("gcd", c);
            break;
            case 2:
            new ThreadT("lcm", c);
            break;
            case 3:
            new ThreadT("swap", c);
            break;
            case 4:
            new ThreadT("sqroot", c);
            break;
            case 5:
            new ThreadT("fact", c);
            break;
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
