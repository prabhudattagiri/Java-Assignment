/* WAP to create a list of prime Fibonacci series between user defined range and default range is 10 to 50 using interface?  */
import java.util.Scanner;

interface Primefibonacci
{
    public void displayPrime();
    public void displayFibonacci();
}

class PFseries implements Primefibonacci
{
    int start,end;
    public PFseries()
    {
        //Default Constructor
        start=10;
        end=50;
    }
    public PFseries(int x,int y)
    {
        start=x;
        end=y;
    }
    public void displayPrime()
    {
        System.out.println("\nPrime Number in between "+start+" to "+end+" are :");
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
    public void displayFibonacci()
    {
        System.out.println("\nFibonacci number in between "+start+" to "+end+" are :");
        int f1=0,f2=1,temp=0;
        System.out.print(f1+" "+f2+" ");
        while(temp<=end)
        {
            temp=f1+f2;
            if(temp>=start && temp<=end)
            {
                System.out.print(temp+" ");
            }
            f1=f2;
            f2=temp;
        }
    }
}

class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (Start & end) :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\nChoose one 1-User defined Range 2-Default Range");
        int choice = sc.nextInt();
        switch (choice)
        {
            //For user defined range
            case 1:
            PFseries s = new PFseries(a,b);
            s.displayPrime();
            s.displayFibonacci();
            break;
            //For default range
            case 2:
            PFseries d = new PFseries();
            d.displayPrime();
            d.displayFibonacci();
            break;
            default:
            System.out.println("Invalid Choice");            
        }
        sc.close();
    }
}