
/**
 * Tests the Bug Class and its methods.
 * 
 * @author Michael Opalinski
 * @version 10-12-2009
 * Section 002
 */
public class BugTester
{
    public static void main(String[] args)
    {
        // Creates a new Bug named ant and moves, turns, and displays the position of the ant.
        Bug ant = new Bug(10);
        ant.move();
        ant.move();
        ant.move();
        System.out.println("Position: " + ant.getPosition());
        System.out.println("Expected: 13");
        ant.turn();
        ant.move();
        ant.move();
        System.out.println("Position: " + ant.getPosition());
        System.out.println("Expected: 11");
        ant.move();
        ant.move();
        ant.move();
        ant.move();
        ant.turn();
        ant.move();
        System.out.println("Position: " + ant.getPosition());
        System.out.println("Expected: 8");
    }
}
