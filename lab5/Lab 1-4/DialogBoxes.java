
/**
 * Write a description of class DialogBoxes here.
 * 
 * @author (Michael Opalinski) 
 * @version (09/28/2009)
 * Section 002
 */

import javax.swing.JOptionPane;

public class DialogBoxes
{
  public static void main(String[] args)
  {
      String likeToDo=JOptionPane.showInputDialog("What would you like me to do?");
      String name=JOptionPane.showInputDialog("What is your name?");
      System.out.println("I'm sorry " + name + " I can't " + likeToDo + ".");
      System.exit(0);
    }
    
}
