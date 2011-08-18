
/**
 * Tests an object of class RectAndSquare
 * 
 * Michael Opalinski
 * 2 November 2009
 * Section 002
 */

import java.util.Scanner;
public class RectAndSquareTester
{
    public static void main(String[] args)
    {
         // Creates a new object of class Scanner
        Scanner in = new Scanner(System.in);
        
        // User inputs the dimensions of the shapes
        System.out.print("Rectangle Width: ");
        int input1 = in.nextInt();
        System.out.print("Rectangle Height: ");
        int input2 = in.nextInt();
        System.out.print("Square Side: ");
        int input3 = in.nextInt();
        
        //Constructs and object of class RectAndSquare
        RectAndSquare shapeTest = new RectAndSquare(input1, input2, input3);
        
        //  Tests each method for RectAndSquare
        System.out.println(shapeTest.greatestArea());
        System.out.println(shapeTest.shapeFit());
    }
}
