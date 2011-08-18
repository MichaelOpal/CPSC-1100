
/**
 * Tests the Numbers Class and all of its methods.
 * 
 * Michael Opalinski
 * 26 October 2009
 * Section 002
 */

import java.util.Scanner;
public class NumbersTester
{
    public static void main(String[] args)
    {
        // Creates a new object of class Scanner
        Scanner in = new Scanner(System.in);
        
        // User inputs two numbers
        System.out.print("Enter the first number: ");
        int input1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int input2 = in.nextInt();
        
        // Creates a bew object of class Numbers
        Numbers testNumbers = new Numbers(input1,input2);
        
        // Tests each method for the object Numbers and compares it to an expected value.
        System.out.println("Expected Sum: 15");
        System.out.println("Calculated Sum: " + testNumbers.getSum());
        System.out.println("Expected Difference: -5");
        System.out.println("Calculated Difference: " + testNumbers.getDifference());
        System.out.println("Expected Product: 50");
        System.out.println("Calculated Product: " + testNumbers.getProduct());
        System.out.println("Expected Average: 7.5");
        System.out.println("Calculated Average: " + testNumbers.getAverage());
        System.out.println("Expected Distance: 5");
        System.out.println("Calculated Distance: " + testNumbers.getDistance());
        System.out.println("Expected Maximum: 10");
        System.out.println("Calculated Maximum: " + testNumbers.getMaximum());
        System.out.println("Expected  Minimum: 5");
        System.out.println("Calculated Minimum: " + testNumbers.getMinimum());
    }
    
}
