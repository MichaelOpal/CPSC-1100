
/**
 * BankAccount stores a bank account balance and contains method to withdraw and deposit funds to the balance.
 * 
 * Michael Opalinski
 * 9 November 2009
 * Section 002
 */
public class BankAccount
{
    /** Instance variable to track the balance of the account */
    private double balance;
    
    /** Constructs and object and stores an initial balance for the account
     * @param initialBalance the initial balance of the account
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    
    /** Deposits funds into the account
     * @param amount is the amount deposited
     */
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    
    /** Withdraws funds from the account and charges an overdraft fee if the balance becomes negative
     * @param amount is the amount withdrawn
     */
    public void withdraw(double amount)
    {
        double newBalance = balance - Math.abs(amount);
        balance = newBalance;
        final double OVERDRAFT_FEE = 10;
        if (balance < 0)
            balance = balance - OVERDRAFT_FEE;
    }
    
    /** Retrieves the current balance of the account
     * @return the balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /** Ends the month cycle and calculates the monthly service fee
     * @return service fee charged
     */
    public double calcServiceFee()
    {
        final double TEN_PERCENT = 10;
        final double MAX_FEE = 10;
        double serviceFee;
        double tenPercentBalance = balance / TEN_PERCENT;
        if (tenPercentBalance < MAX_FEE)
            serviceFee = tenPercentBalance;
         else
            serviceFee = MAX_FEE;
         balance = balance - serviceFee;
         return serviceFee;
        }
}
