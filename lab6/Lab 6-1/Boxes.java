
/**
 * Prints a windows pane using rectangles.
 * 
 * @author Michael Opalinski
 * @version 10-05-2009
 * Section 002
 */

import java.awt.Rectangle;

public class Boxes
{
    public static void main(String[] args)
        {
            // Constructs new Rectagle object and prints location
            Rectangle box = new Rectangle(0,0,5,10);
            System.out.println("Expected location: 0,0");
            System.out.println("Actual: " + box.getLocation());
            
            // Translates box to the right and prints new location
            box.translate(5,0);
            System.out.println("Expected location: 5,0");
            System.out.println("Actual: " + box.getLocation());
            
            // Translates box down and prints new location
            box.translate(0,10);
            System.out.println("Expected location: 5,10");
            System.out.println("Actual: " + box.getLocation());
            
            // Translates box to the left and prints new location
            box.translate(-5,0);
            System.out.println("Expected location: 0,10");
            System.out.println("Actual: " + box.getLocation());
        }
}
