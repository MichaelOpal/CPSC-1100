
/**
 * Tests the class AverageGrade and its methods
 * 
 * Michael Opalinski
 * 2 November 2009
 * Section 002
 */

import java.util.Scanner;
public class AverageGradeTester
{
    public static void main(String[] args)
    {
        // Creates a new object of class Scanner
        Scanner in = new Scanner(System.in);
        
        // User inputs three grades
        System.out.print("Grade 1: ");
        double input1 = in.nextDouble();
        System.out.print("Grade 2: ");
        double input2 = in.nextDouble();
        System.out.print("Grade 3: ");
        double input3 = in.nextDouble();
        
        // Creates a new object of class AverageGrade
        AverageGrade student = new AverageGrade(input1, input2, input3);
        
        // Tests each method and prints the result
        System.out.println("Average: " + student.getAverage());
        System.out.println("Letter Grade: " + student.getLetterGrade());
    }
}
