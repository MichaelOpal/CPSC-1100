/**
 * NumberPyramid creates a pyramid of numbers using for loops
 * 
 * Michael Opalinski
 * 16 Novermber 2009
 * Section 002
 */
public class NumberPyramid
{
   public void drawPyramid()
   {
       /** Loop counts the number of lines */
       for (int a = 1; a <= 9; a++)
       {
           /** Loop creates the number */
           for (int b = 1; b <= a; b++)
                System.out.print(b + " ");
        System.out.println();
       }
    }
}
