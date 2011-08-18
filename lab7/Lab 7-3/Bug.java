
/**
 * Creates a Bug object that can be turned and moved
 * 
 * @author Michael Opalinski
 * @version 10-12-2009
 * Section 002
 */
public class Bug
{
    // Instance variables to store the position and which direction it is headed.
    private int position;
    private int amount = 1;
    
    // Constructor with the initial position
    public Bug(int initialPosition)
    {
        position = initialPosition;
    }

    // Methods that move the bug one unit, turn it around, and display the position.
    public void move()
    {
        int newPosition = (position + amount);
        position = newPosition;
    }
    public void turn()
    {
        int newAmount = -amount;
        amount = newAmount;
    }
    public int getPosition()
    {
        return position;
    }
}
