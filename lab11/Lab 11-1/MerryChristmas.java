/**
 * MerryChristmas displays the text "Ho Ho Ho Merry Christmas" five times using for loops.
 * 
 * Michael Opalinski
 * 16 Novermber 2009
 * Section 002
 */
public class MerryChristmas
{
    /** Method to display a greeting */
    public void getGreeting()
    {
       /** Loop counts the number of lines */
       for (int a = 1; a <= 5; a++)
       {
           /** Loop for each "Ho" */
           for (int b = 1; b <= 3; b++)
                System.out.print("Ho ");
           System.out.println("Merry Christmas");
        }
    }
}
