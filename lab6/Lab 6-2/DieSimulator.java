
/**
 * Simulates the action of rolling a die by providing a random number between 1 and 2.
 * 
 * @author Michael Opalinski
 * @version 10-05-2009
 * Section 002
 */

import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        // Creates a random number generator
        Random die = new Random();
        int roll = die.nextInt(6);
        
        // Since a random number from 0 to 5 is found, we must add 1 to simulate 1 to 6 on a die.
        int roll2 = roll + 1;
        System.out.println("Roll: " + roll2);
    }
    
}
