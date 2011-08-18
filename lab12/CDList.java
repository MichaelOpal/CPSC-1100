
/**
 * Dan McEvoy
 * Robert Derveloy
 * Michael Opalinski
 */
import java.util.ArrayList;

public class CDList
{
    private ArrayList<CD> catalog = new ArrayList<CD>();
   
    public void add(CD newCD)
    {
        catalog.add(newCD);
    }
    
    public void printCD()
    {
       System.out.println();
       for (int i = 0; i < catalog.size(); i++)
       {
            CD newCD = catalog.get(i);
            System.out.println("Artist: " + newCD.getArtistName());
            System.out.println("Album: " + newCD.getAlbumName());
            String[] tracks = newCD.getSongs();
            for (int j = 0; j < newCD.getAlbumSize(); j++)
                {
                    System.out.println(tracks[j]);
                }
            System.out.println();
        }
    }
}