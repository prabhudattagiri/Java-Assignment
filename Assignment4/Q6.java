/*WAP to perform following using interface and package to deposit, withdraw, check balance for banking application

I. Assign a fixed value as balance for account 
II. Deposit user defined amount and display updated balance 
III. Withdraw user defined money if user has sufficient fund otherwise show Insufficient fund 
using custom exception 
IV. Check for balance 
V. Maintain a fixed amount 3000 in the account 
*/
import Bank.*;

public class Q6 
{
    public static void main(String[] args) 
    {
        Bank b = new Bank(3000); //for initial fixed amount 3000
        b.deposit(5000);
        b.withdraw(1000);
        b.checkbalance();
        b.withdraw(8000); //for create insufficient fund
    }
}
