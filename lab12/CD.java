/**
 * Lab 12 - CD class
 * 
 * @author (Robert Derveloy) 
 * @version (11/22/2009)
 * CPSC-150 - Section 002
 */
public class CD
{
    // instance fields:
    private String cdName;                                //A string to hold the name of the album.
    private String[] songName;                         //A one-dimensional array of Strings to store the track names.
    private String artistName;                           //A string to hold the name of the artist.
    private final int DISK_LENGTH;                 //An integer to represent the max possible number of tracks on the album.
    private final String EMPTY_STRING;        //A constant string to represent the empty string, "".
    
     /**
     * Public constructor that generates an empty 20 element song list automatically.
     * @param album A String type that represents the title of the album.
     * @param artist A String type that represents the name of the artist.
     */
    public CD(String album, String artist)    
    {
        //Declare and initialize local fields:
        cdName = album;
        artistName = artist;
        songName = new String[20];
        DISK_LENGTH = songName.length;
        EMPTY_STRING = "";
    }
    
    /**
     * An accessor method to retrieve the name of the artist.
     * @return A String reprenting the name of the artist.
     */
    public String getArtistName()
    {
        return artistName;
    }
    
      /**
     * An accessor method to retrieve the name of the album.
     * @return A String reprenting the name of the album.
     */
    public String getAlbumName()
    {
        return cdName;
    }
    
    /**
     * An accessor method to retrieve the album's track list.
     * @return A one dimensional array of String types that reprents the CD's track list.
     */
    public String[] getSongs()
    {
        return songName;
    }    
    
     /**
     * An accessor method to calculate the current number of tracks currently present on the album.
     * @return An integer reprenting the current number of tracks on the album.
     */
    public int getAlbumSize()
    {
        int trackCount = 0;
        
        //Loop through each element:        
        for(int index=0; index<songName.length; index++)
        {
            //Only record a track if there's something there:
            if((songName[index] != null))
            {
                if(!songName[index].equals(EMPTY_STRING))
                {
                    trackCount++;
                }                
            }
        }
        //Return the number of tracks:
        return trackCount;
    }
    
    /**
     * A public predicate method that determines if the disk is full.
     * @return A boolean value that represents weather or not the disk is full.  True is full, false is not full.
     */
    public boolean isFull()
    {
        //Local variables:
        int diskSize = getAlbumSize(); 
        int diskLength = songName.length;
        
        //Check to see if the cd is full:
        if(diskSize >= diskLength)
        {
            //If it is, return true:
            return true;
        }
        else
        {
            //If it isn't, return false:
            return false;
        }
    }
    
    /**
     * A public mutator used to add a track to the CD.  This method finds the next availible spot on the CD, and adds the track if there is space availiable.
     * @param trackName A String type that reprents the name of the track to be added to the cd.
     * @return A boolean type that indicates whether or not the add was successful.  If false, the add failed.  If true, the add was successful.
     */
    public boolean addTrack(String trackName)
    {          
        //Declare and initialize local variables:
        boolean addSuccessful = false;
        int nextEmptySpot = 0;
        
        //if the disk is full...
        if(isFull())
        {
            //...we can't add a new track:
            addSuccessful =  false;
            return addSuccessful;
        }
        else
        {
            //Determine the next availiable spot:
            //Start by looping through each element:
            for(int index=0; index<songName.length; index++)
            {
                //To find the first availible spot on the CD, we first need to check for null before we check for an empty string.
                //If we test for both at the same time, we'll get a nullPointerException. 
                
                //Therefore, test for null first:
                if((songName[index] == null))
                {
                    //If we find an empty spot...
                    nextEmptySpot = index;      //Record the location.
                    break;                      //Exit the loop.
                }
                
                //Since the loop will exit if we found a null in the previous test,
                //it's ok to go ahead and test for an empty string:
                if(songName[index].equals(EMPTY_STRING))
                {
                    //If we find an empty spot...
                    nextEmptySpot = index;      //Record the location.
                    break;                      //Exit the loop.
                }
            }
            
            //Now that we have a spot, assign the track name:
            songName[nextEmptySpot] = trackName;
            
            //Verify assignment:
            if(songName[nextEmptySpot].equals(trackName))
            {                
                addSuccessful = true;
            }
            else
            {
                addSuccessful = false;
            }            
        }
        
        return addSuccessful;
    }
    
    
}
