
/**
 * Tests the NumberSuffix object and its methods
 * 
 * Michael Opalinski
 * 2 November 2009
 * Section 002
 */

import java.util.Scanner;
public class NumberSuffixTester
{
    public static void main(String[] args)
    {
        // Creates a new object of class Scanner
        Scanner in = new Scanner(System.in);
        
        // User inputs an integer 1 - 100
        System.out.print("Input an integer from 1 to 100: ");
        int input = in.nextInt();
        
        // Creates an object of class NumberSuffix
        NumberSuffix suffixTester = new NumberSuffix(input);
        
        // Tests the getSuffix method
        System.out.println("Correct suffix is: " + input + suffixTester.getSuffix());
    }
}
