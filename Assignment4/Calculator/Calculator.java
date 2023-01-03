package Calculator;
interface Calc
{
   public int sum (int a,int b);
   public int sub (int a,int b);
   public int mul (int a,int b);
   public double div (int a,int b);
   public int mod (int a,int b);
   public int pow (int a,int b);
   public double sqroot(int a);
   public double cbroot(int a);
   public double sinx(double x);
   public double cosx(double x);
   public double tanx(double x);
   public double logx(double x);
   public double exp(double x);
   public double absoluteValue(double x);
}

public class Calculator implements Calc
{
    public int sum (int a,int b)
    {
        return a+b;
    }
    public int sub (int a,int b)
    {
        return a-b;
    }
    public int mul (int a,int b)
    {
        return a*b;
    }
    public double div (int a,int b)
    {
        return a/b;
    }
    public int mod (int a,int b)
    {
        return a%b;
    }
    public int pow (int a,int b)
    {
        int p=1;
        for(int i=0;i<b;i++)
        {
            p=p*a;
        }
        return p;
    }
    public double sqroot(int a)
    {
        return Math.sqrt(a);
    }
    public double cbroot(int a)
    {
        return Math.cbrt(a);
    }
    public double sinx(double x)
    {
        return Math.sin(x);
    }
    public double cosx(double x)
    {
        return Math.cos(x);
    }
    public double tanx(double x)
    {
        return Math.tan(x);
    }
    public double logx(double x)
    {
        return Math.log(x);
    }
    public double exp(double x)
    {
        return Math.exp(x);
    }
    public double absoluteValue(double x)
    {
        return Math.abs(x);
    }
}
