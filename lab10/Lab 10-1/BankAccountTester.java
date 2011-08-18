
/**
 * Tests the class BankAccount and its methods
 * 
 * Michael Opalinski
 * 9 November 2009
 * Section 002
 */

import java.util.Scanner;
public class BankAccountTester
{
   public static void main(String[] args)
   {
       /** Create a new Scanner object for user input */
       Scanner in = new Scanner(System.in);
       
       /** Prompt for the initial balance and create a new BankAccount object with that balance */
       System.out.print("Enter the initial Balance: ");
       double initialBalance = in.nextDouble();
       BankAccount testAccount = new BankAccount(initialBalance);
       System.out.println("Enter 8888 at any time to check the current balance. Enter 9999 to end the month.");
       
       /** While Loop continues as long as withdraws and deposits are made */
       boolean done = false;
       while (!done)
       {
           System.out.print("Enter a withdrawal or deposit amount: ");
           double input = in.nextDouble();
           if (input == 9999)     // If the sentinel value is detected, the loop quits
                done = true;
           else if (input == 8888)     // If the sentinel value is detected, the balance is displayed
                System.out.println("The current blanace is: " + testAccount.getBalance());
           else if (input >= 0)     // If the amount is greater than 0, the deposit method is used
                testAccount.deposit(input);
           else if (input < 0)     // If the amount is less than 0, the withdraw method is used
                testAccount.withdraw(input);
          }
          /** After the loop is terminated, the end-of-month service fee and balance are displayed */
          System.out.println("The monthly service fee is: " + testAccount.calcServiceFee());
          System.out.println("The account balance at the end of the month is: " + testAccount.getBalance());
       
    }
}
