//Write a program to calculate interest that may be simple or compound using method overloading?
class Bank
{
    void interest(int p,int t,int r)
    {
        int si = (p*t*r)/100;
        System.out.println("Simple Interest is "+si);
    }
    void interest(int p,int t,int r,int n)
    {   float t2=(float)r/(n*100);
        double t1=(double) Math.pow((1 + t2), t*n);
        double ci =(double) p*t1 - p;
        System.out.println("Compound Interest is "+ci);
    }
}

public class P4
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.interest(1000, 2, 10);
        b.interest(1000, 2, 10,1);
    }
}