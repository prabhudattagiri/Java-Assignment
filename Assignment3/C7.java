/*Write a java program to create banking application to perform following using using class and object?
 a) Initialize with initial balance Rs 3000 
 b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for deposit 
 c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance
 d) check for balance */
 class Bank
{
    int bal;
    public Bank (int a)
    {
        bal=a;
    }
    public void deposit(int a)
    {
        if(a>1000)
        {
            bal=bal+a;
            System.out.println("Your account has been creadited with Rs "+a+" and AVl Balance is Rs "+bal);
        }
        else
        {
            bal=bal+a-100;
            System.out.println("Your account has been creadited with Rs "+a+" , penalty 100 and AVl Balance is Rs "+bal);
        }
    }
    public void withdraw(int a)
    {
        if (bal>1000)
        {
            bal=bal-a;
            System.out.println("Your account has been debited wit Rs "+a+" and Avl Balance is Rs "+bal);
        }
        else
        {
            System.out.println("You do not have sufficcient balance in your account");
        }
    }
    public void checkbal()
    {
        System.out.println("Current Balance is Rs "+bal);
    }
}
class C7
{
    public static void main(String[] args) 
    {
        Bank b = new Bank(3000);
        b.deposit(2500);
        b.withdraw(1200);
        b.checkbal();
    }
}