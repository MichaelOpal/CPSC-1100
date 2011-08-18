
/**
 * Uses the concat method to print a sentence.
 * 
 * @author Michael Opalinski
 * @version 10-05-2009
 * Section 002
 */
public class ConcatTester 
{
    public static void main(String[] args) 
    { 
       String animal1 = "quick brown fox"; 
       String animal2 = "lazy dog"; 
       String article = "the"; 
       String action = "jumps over"; 

       // Constructs the sentence and saves it into a variable.
       String sentence = new String("".concat(article)+" ".concat(animal1)+" ".concat(action)+" ".concat(article)+" ".concat(animal2));
       
       //Prints the constructed sentence and its length.
       System.out.println(sentence);
       System.out.println(sentence.length());
       
    } 
} 
