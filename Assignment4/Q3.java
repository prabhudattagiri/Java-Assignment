/*WAP to check weather a number is palindrome number and divisible by 3 and 5 or not using custom exception and interface?  */
import java.util.Scanner;

class MyExp extends Exception
{
    int p;
    public MyExp(int a)
    {
        p=a;
    }
    public String toString()
    {
        String msg =p+" is Either not palindrome or not divisible by 3 and 5";
        return msg;
    }
}

class Q3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int num=n;
        int rev=0;
        sc.close();
        try
        {
            while(n!=0)
            {
                rev=rev*10+(n%10);
                n=n/10;
            }
            
            if(num==rev && num%3==0 && num%5==0 )
            {
                System.out.println(num+" is palindrome number and divisible by 3 and 5");
            }
            else
            {
                throw new MyExp(num);
            }
        }
        catch(MyExp me)
        {
            System.out.println(me);
        }

    }
}