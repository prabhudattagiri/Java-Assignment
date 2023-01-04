/* Write a program to create simple calculator for addition, subtraction, division, multiplication, 
modulus, factorial, gcd, lcm, power, square root, cube root using class and object? */

import java.util.Scanner;
class Calulator
{
    int a,b;
    Calulator(int x,int y)
    {
        a=x;
        b=y;
    }
    void add()
    {
        int r =a+b;
        System.out.println("Sum = "+r);
    }
    void sub()
    {
        int r =a-b;
        System.out.println("Sub = "+r); 
    }
    void mul()
    {
        int r =a*b;
        System.out.println("mul = "+r); 
    }
    void div()
    {
        int r =a/b;
        System.out.println("div = "+r); 
    }
    void mod()
    {
        int r =a%b;
        System.out.println("Mod = "+r); 
    }
    void factorial()
    {
        int r=1;
        for(int i=1;i<=a;i++)
        {
            r=r*i;
        }
        System.out.println("Factorial of "+a+" is "+r);
    }
    void gcd()
    {
        int s=(a<b?a:b);
        int g=0;
        for(int i=1;i<=s;i++)
        {
            if(a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        System.out.println("GCD of "+a+" "+b+" is "+g);
    }
    void lcm()
    {
        int l=(a>b?a:b);
        int m=0;
        for(int i=l;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                m=i;
                break;
            }
        }
        System.out.println("LCM of "+a+" "+b+" is "+m);
    }
    void power()
    {
        int p=1;
        for(int i=1;i<=b;i++)
        {
            p=p*a;
        }
        System.out.println(a+" to the power "+b+" is "+p);
    }
    void squareRoot()
    {
        int num=a;
        double temp;
        double sr=num/2;
        do{
            temp=sr;
            sr=(temp+(num/temp))/2;
        }while((temp-sr)!=0);
        System.out.println("Square Root of "+a+" is "+sr);
    }
    void cubeRoot()
    {
        /*int num=a;
        double temp;
        double cr=num/3;
        do{
            temp=cr;
            cr=(temp+(num/temp))/3;
        }while((temp-cr)!=0);*/
        double cr = Math.cbrt(a);
        System.out.println("Cube Root of "+a+" is "+cr);
    }
}
class C1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,b=0;
        System.out.println("Welcome To Calculator \n1-addition, 2-subtraction, 3-multiplication, 4-division,5-modulus, 6-gcd, 7-lcm, 8-power, 9-factorial, 10-square root, 11-cube root");
        System.out.print("Choose one operation(1-11):");
        int ch=sc.nextInt();
        if(ch==9 || ch==10 || ch==11) //bcs Factorial , Squre Root and Cube Root need one operand
        {
            System.out.print("\nEnter a Number : ");
            a=sc.nextInt();
        }
        else
        {
            System.out.print("\nEnter First Number : ");
            a=sc.nextInt();
            System.out.print("\nEnter Second Number : ");
            b=sc.nextInt();
        }
        Calulator c = new Calulator(a,b);
        //Perform operation as per user chooice
        if(ch==1)
        {
            c.add();
        }
        else if(ch==2)
        {  
            c.sub();          
        }
        else if(ch==3)
        {
            c.mul();            
        }
        else if(ch==4)
        {  
            c.div();          
        }
        else if(ch==5)
        {    
            c.mod();        
        }
        else if(ch==6)
        {  
            c.gcd();          
        }
        else if(ch==7)
        { 
            c.lcm();          
        }
        else if(ch==8)
        { 
            c.power();          
        }
        else if(ch==9)
        {   
            c.factorial();         
        }
        else if(ch==10)
        {     
            c.squareRoot();       
        }
        else if(ch==11)
        {     
            c.cubeRoot();       
        }
        else
        {
            System.out.println("You Choose an invalid option");
        }
        sc.close();
    }
}