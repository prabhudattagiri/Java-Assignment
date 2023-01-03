package Bank;

class MyExp extends Exception
{
    int ramt;
    int cbal;
    String msg;
    MyExp(int r,int c)
    {
        ramt=r;
        cbal=c;
    }
    public String toString()
    {
        msg = "My Exception : Your current balance is Rs "+cbal+" Your Required amount is Rs "+ramt+" for withdraw and maintain a fixed amount 3000 in the account";
        return msg;
    }
}

interface Banksys
{
    public void deposit(int n);
    public void withdraw(int n);
    public void checkbalance();
}

public class Bank implements Banksys
{
    int bal,ramt;
    public Bank(int n) //For initial fixed value
    {
        bal=n;
    }
    public void deposit(int n)
    {
        bal=bal+n;
        System.out.println("Deposit amount is "+n+" Total balance is "+bal);
    }
    public void withdraw(int n)
    {
        try
        {
            if((bal-n)>3000)
            {
                bal=bal-n;
                System.out.println("Withdraw amount is "+n+" and Current balance is "+bal);
            }
            else
            {
                ramt = bal -(n+3000);
                throw new MyExp(ramt,bal);
            }
        }
        catch(MyExp me)
        {
            System.out.println(me);
        }
    }
    public void checkbalance()
    {
        System.out.println("Current Balance is "+bal);
    }
}
