
/**
 * SpaceWeights converts a given weight on Earth into the same weight on other planets and moons.
 * 
 * Michael Opalinski
 * 26 October 2009
 * Section 002
 */
public class SpaceWeights
{
    /** Creates and instance variable for the user's inpit weight on Earth */
    private int earthWeight;
    
    /** Constructs an object with an input weight.
     * @param weight is the user's input weight on Earth.
     */
    public SpaceWeights(int weight)
    {
        earthWeight = weight;
    }
    
    /** Calculates the user's weight on the Moon
     * @return the weight on the Moon
     */
    public double getMoon()
    {
        double moon = earthWeight * 0.1666;
        return moon;
    }
    
    /** Calculates the user's weight on Mercury
     * @return the weight on Mercury
     */
    public double getMercury()
    {
        double mercury = earthWeight * 0.4;
        return mercury;
    }
    
    /** Calculates the user's weight on Venus
     * @return the weight on Venus
     */
    public double getVenus()
    {
        double venus = earthWeight * 0.9;
        return venus;
    }
    
    /** Calculates the user's weight on Jupiter
     * @return the weight on Jupiter
     */
    public double getJupiter()
    {
        double jupiter = earthWeight * 2.5;
        return jupiter;
    }
    
    /** Calculates the user's weight on Saturn
     * @return the weight on Saturn
     */
    public double getSaturn()
    {
        double saturn = earthWeight * 1.1;
        return saturn;
    }
}
