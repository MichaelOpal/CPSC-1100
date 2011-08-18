/**
 * Tests the EvenOddAverage class and its methods
 * 
 * Michael Opalinski
 * 9 November 2009
 * Section 002
 */

import java.util.Scanner;
public class EvenOddAverageTester
{
    public static void main(String[] args)
    {
        /** Create a new Scanner object for user input */
       Scanner in = new Scanner(System.in);
       
       /** Create an EvenOddAverage object */
       EvenOddAverage testAverage = new EvenOddAverage();
       
       boolean done = false;
       while (!done)
       {
           System.out.print("Enter any positive integer: ");
           int num = in.nextInt();
           if (num == -1)     // If sentinel value is detected, the loop terminates
                done = true;
           else if (num >= 0)     // Adds the number to the testAverage object
                testAverage.add(num);
         }
         
         /** Displays the averages */
         System.out.println("The even average is: " + testAverage.getEvenAvg());
         System.out.println("The odd average is: " + testAverage.getOddAvg());
            
    }
}
