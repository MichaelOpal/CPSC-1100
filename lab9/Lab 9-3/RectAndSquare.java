
/**
 * Creates and object that stores the dimensions of a rectangle and square
 * 
 * Michael Opalinski
 * 2 November 2009
 * Section 002
 */
public class RectAndSquare
{
    /** Creates instance variables for the dimensions and area of the shapes, as well as the two sentences describing them */
    private int rectWidth;
    private int rectHeight;
    private int squareSide;
    private int rectArea;
    private int squareArea;
    private String area;
    private String fit;
    
    /** Constructs an object with the width and height ofa rectangle and side of a square
     * @input1 is the Rectangle Width
     * @input2 is the Rectangle Height
     * @input3 is the Square Side
     */
    public RectAndSquare(int input1, int input2, int input3)
    {
        rectWidth = input1;
        rectHeight = input2;
        squareSide = input3;
    }
    
    /** Determines which shape has the greatest area
     * @return the shape with the greatest area, if applicable
     */
    public String greatestArea()
    {
        rectArea = (rectWidth * rectHeight);
        squareArea = (squareSide * squareSide);
        if (rectArea > squareArea)
            area = "The object with the greatest area is the rectangle.";
        else if (squareArea > rectArea)
            area = "The object with the greatest area is the square.";
        else
            area = "The square and the rectangle have the same area.";
        return area;
    }
    
    /** Determines if a shape can fit inside the other
     * @return which shape can fit inside the other
     */
    public String shapeFit()
    {
        if (rectWidth < squareSide && rectHeight < squareSide)
            fit = "The rectangle fits inside the square.";
        else if (squareSide < rectWidth && squareSide < rectHeight)
            fit = "The square fits inside the rectangle.";
        else
            fit = "Neither shape fits inside the other.";
        return fit;
    }
}
