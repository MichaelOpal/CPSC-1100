
/**
 * Stores the value of two numbers and contains methods to find the sum, difference, product, average, distance, maximum, and minimum of the numbers.
 * 
 * Michael Opalinski
 * 26 October 2009
 * Section 002
 */
public class Numbers
{
    /** Creates instance variables for the two numbers */
    private double num1;
    private double num2;
    
    /** Constructs an object with two numbers.
     *  @param a is the first number
     *  @param b is the second number
     */
    public Numbers(double a, double b)
    {
        num1 = a;
        num2 = b;
    }
    
    /** Computes the sum of two numbers
     * @return the sum of the numbers
     */
    public double getSum()
    {
        double sum = num1 + num2;
        return sum;
    }
    
     /** Computes the difference of two numbers
     * @return the difference of the numbers
     */
    public double getDifference()
    {
        double difference = num1 - num2;
        return difference;
    }
    
    /** Computes the product of two numbers
     * @return the product of the numbers
     */
    public double getProduct()
    {
        double product = num1 * num2;
        return product;
    }
    
    /** Computes the average of two numbers
     * @return the average of the numbers
     */
    public double getAverage()
    {
        double average = (num1 + num2)/2;
        return average;
    }
    
    /** Computes the distance of two numbers
     * @return the distance of the numbers
     */
    public double getDistance()
    {
        double distance = Math.abs(num1 - num2);
        return distance;
    }
    
    /** Computes the maximum of two numbers
     * @return the maximum of the numbers
     */
    public double getMaximum()
    {
        double maximum = Math.max(num1,num2);
        return maximum;
    }
    
    /** Computes the minimum of two numbers
     * @return the minimum of the numbers
     */
    public double getMinimum()
    {
        double minimum = Math.min(num1,num2);
        return minimum;
    }
    
}
