
/**
 * A BankAccount object with methods to withdraw, deposit, and return the balance.
 * 
 * @author Michael Opalinski
 * @version 10-12-2009
 * Section 002
 */
public class BankAccount
{
    // Creates instance variable balance
    private double balance;
    
    // Two constructors for no initial balance and a set initial balance
    public BankAccount()
    {
        balance=0;
    }
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
  
    // Methods to deposit, withdraw, and return the balance of the account
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }
    public double getBalance()
    {
        return balance;
    }
}
