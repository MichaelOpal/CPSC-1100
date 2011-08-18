
/**
 * Tests the class SpaceWeights and its methods
 * 
 * Michael Opalinski
 * 26 October 2009
 * Section 002
 */

import java.util.Scanner;
public class SpaceWeightsTester
{
    public static void main(String[] args)
    {
        // Creates a new object of class Scanner
        Scanner in = new Scanner(System.in);
        
        // User inputs two numbers
        System.out.print("Enter your weight as an integer: ");
        int input = in.nextInt();
        
        // Creates new object of class SpaceWeights
        SpaceWeights weightCalc = new SpaceWeights(input);
        
        // Tests each method for the object class SpaceWeights
        System.out.println("Calculated weight on Moon: " + Math.round(weightCalc.getMoon()));
        System.out.println("Calculated weight on Mercury: " + Math.round(weightCalc.getMercury()));
        System.out.println("Calculated weight on Venus: " + Math.round(weightCalc.getVenus()));
        System.out.println("Calculated weight on Jupiter: " + Math.round(weightCalc.getJupiter()));
        System.out.println("Calculated weight on Saturn: " + Math.round(weightCalc.getSaturn()));
        
        
    }
}
