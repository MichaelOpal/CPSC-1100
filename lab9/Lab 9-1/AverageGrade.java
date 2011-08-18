
/**
 * Accepts 3 grades and calculates the numerical average and letter grade.
 * 
 * Michael Opalinski
 * 2 November 2009
 * Section 002
 */
public class AverageGrade
{
    /** Instance variables for grades, average, and letter grade */
    private double grade1;
    private double grade2;
    private double grade3;
    private double avgNumber;
    private String avgLetter;
    
    /** Constructs and object with three grades stored
     * @param num1 is the first grade
     * @param num2 is the second grade
     * @param num3 is the third grade
     */
    public AverageGrade(double num1, double num2, double num3)
    {
        grade1 = num1;
        grade2 = num2;
        grade3 = num3;
    }
    
    /** Calculates the numerical average of the three grades
     * @return numerical average
     */
    public double getAverage()
    {
        avgNumber = (grade1 + grade2 + grade3) / 3;
        return avgNumber;
    }
    
    /** Calculates the letter grade based on the numerical average
     * @return the letter grade
     */
    public String getLetterGrade()
    {
        if (avgNumber >= 90)
            avgLetter = "A";
        else if (avgNumber >= 80)
            avgLetter = "B";
        else if (avgNumber >= 70)
            avgLetter = "C";
        else
            avgLetter = "F";
        return avgLetter;
    }
}
