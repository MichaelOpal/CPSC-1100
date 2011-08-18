/**
 * CD Tester uses the CD and CDList classes to create a catalog of albums.
 * 
 * Michael Opalinski
 * Group 23 - Robert Derveloy, Daniel McEvoy, Michael Opalinski
 * 2 December 2009
 * Section 002
 */
import java.util.Scanner;
public class CDTester
{
    public static void main(String[] args)
    {
        /** Creates Scanner for input and CDList catalog to track the albums */
        Scanner in = new Scanner(System.in);
        CDList catalog = new CDList();
        
        /** Prompts user for input to run the program */
        System.out.println("Welcome to CD Catalog.");
        System.out.println("Type NEW to add a new CD to the catalog.");
        System.out.println("Type LIST to view the catalog in its entirety.");
        System.out.println("Type DONE when you are finished.");
        System.out.println();
        System.out.print("What would you like to do? ");
        
        /** While loop determines what the user input and what to do next */
        String input = in.next();
        boolean done = false;
        while (!done)
        {
            /** If user input DONE, program quits */
            if (input.equalsIgnoreCase("done"))
                done = true;
                
            /** If user input LIST, displays the catalog list of albums */
            else if (input.equalsIgnoreCase("list"))
            {
                catalog.printCD();
                System.out.print("What would you like to do? ");
                input = in.next();
            }
            
            /** If user input NEW, adds a new album to catalog */
            else if (input.equalsIgnoreCase("new"))
            {
                /** Prompts for the album artist and album name */
                System.out.print("Album Artist: ");
                in.nextLine();
                String artistName = in.nextLine();
                System.out.print("Album Name: ");
                String albumName = in.nextLine();
                
                /** Creates new CD object with the artist and album title as constructor variables */
                CD newAlbum = new CD(albumName, artistName);
                
                /** While loop uses CD's addTrack method to add tracks to the album */
                System.out.println("Enter the track titles. When complete, leave the next line blank.");
                int trackNum = 1;
                boolean finished = false;
                while (!finished)
                {
                    System.out.print("Track " + trackNum + ": ");
                    String trackTitle = in.nextLine();
                    if (trackTitle.equals(""))
                        finished = true;
                    else
                        newAlbum.addTrack(trackTitle);
                    trackNum++;
                }
                catalog.add(newAlbum);
                
                System.out.println("Album added to Catalog.");
                System.out.println();
                System.out.print("What would you like to do? ");
                input = in.next();
            }
            
            /** If NEW, LIST, or DONE is not input, a prompt reminds the user of the options and asks again. */ 
            else
            {
                System.out.println("Options are: NEW, LIST, and DONE.");
                System.out.print("What would you like to do? ");
                input = in.next();
            }
          }
          
          /** When DONE is input, the program quits and displays this message */
          System.out.println();
          System.out.println("Thank you for using CD Catalog.");
          System.out.print("Copyright © 2009 Group 23 Software");
    }
}
