/**
 * Diamond draws a diamond mades from circles
 * 
 * Michael Opalinski
 * 16 Novermber 2009
 * Section 002
 */
public class Diamond
{
    /** This method draws the diamond */
   public void drawDiamond()
   {
       /** First outer loop draws the top half of the diamond */
       for (int lines = 1; lines <= 10; lines++)
       {
           /** Loop creates the appropriate number of spaces */
           for (int spaces = lines; spaces <= 9; spaces++)
                System.out.print(" ");
           /** Loop creates the appropriate number of circles */
           double circles = 1;
           while (circles <= lines)
           {
               System.out.print("o");
               circles = circles + 0.5;
            }
           System.out.println("");
       }
       
       /** Second outer loop draws the bottom half of the diamon */
       for (int lines = 9; lines >= 1; lines--)
       {
           /** Loop creates the appropriate number of spaces */
           for (int spaces = lines; spaces <= 9; spaces++)
                System.out.print(" ");
           /** Loop creates the appropriate number of circles */
           double circles = 1;
           while (circles <= lines)
           {
               System.out.print("o");
               circles = circles + 0.5;
            }
           System.out.println("");
        }
    }
}
