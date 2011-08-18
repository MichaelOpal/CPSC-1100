
/**
 * Determines the appropriate suffix for any input number from 1 - 100.
 * 
 * Michael Opalinski
 * 2 November 2009
 * Section 002
 */
public class NumberSuffix
{
    /** Creates instance variable for the number and its suffix */
    private int num;
    private String suffix;
    
    /** Constructs and object with a number store
     * @ param input is any number from 1 - 100
     */
    public NumberSuffix(int input)
    {
        num = input;
    }
    
    /** Determines the suffix of the input number
     * @return the suffix
     */
    public String getSuffix()
    {
        if (num % 10 == 1)
            if (num == 11)
                suffix = "th";
            else
                suffix = "st";
        else if (num % 10 == 2)
            if (num == 12)
                suffix = "th";
            else
                suffix = "nd";
        else if (num % 10 == 3)
            if (num == 13)
                suffix = "th";
            else
                suffix = "rd";
        else
            suffix = "th";
        return suffix;
    }
}
