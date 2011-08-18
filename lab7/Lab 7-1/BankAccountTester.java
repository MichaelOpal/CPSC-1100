
/**
 * Tests the Bank Account class
 * 
 * @author Michael Opalinski
 * @version 10-12-2009
 * Section 002
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        // Creates myAccount and withdraws, deposits, and displays the balance.
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(400);
        System.out.println("Balance: " + myAccount.getBalance());
        System.out.println("Expected: 100");
    }
}
