/**
 * Creates an object to track the averages of even and odd integers
 * 
 * Michael Opalinski
 * 9 November 2009
 * Section 002
 */
public class EvenOddAverage
{
    /** Instance variables for the even and odd accumulator, total, and average */
    private double evenTotal = 0;
    private double evenAccum = 0;
    private double evenAvg;
    private double oddTotal = 0;
    private double oddAccum = 0;
    private double oddAvg;
        
    /** Determines if the numebr beign added is even or odd and updates the correct total and accumulator */
    public void add(int num)
    {
        if ((num % 2) == 0)
        {
            evenAccum ++;
            evenTotal = evenTotal + num;
         }
        else if ((num %2) == 1)
        {
            oddAccum ++;
            oddTotal = oddTotal + num;
        }
    }
    
    /** Calculates the even average
     * @return the even average
     */
    public double getEvenAvg()
    {
        evenAvg = (evenTotal / evenAccum);
        return evenAvg;
    }
    
    /** Calculates the odd average
     * @return the odd average
     */
    public double getOddAvg()
    {
        oddAvg = (oddTotal / oddAccum);
        return oddAvg;
    }
        
}
