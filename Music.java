/**
 * 
 */
package ashesi.edu.gh.ICP313;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;




/**
 * @author David Ebo Adjepon-Yamoah
 * @version 1.0.3
 */
public class Music {
	
	/**
	 * Instance Variables/Fields
	 */
	private String musicName;
	private String musicGenre;
	private double musicLength;
	private String musicLyrics;
	private String releaseDate;
	private String artist;
	private String writer;
	private double ratings;
	
	/**
	 * Constructor:
	 * Building an object of class Music
	 * @param name
	 * @param genre
	 * @param length
	 * @param lyrics
	 * @param date
	 * @param artist
	 * @param rating
	 */
	public Music(String name, String genre, 
    		double length, String lyrics, 
    		String date, String artist,
    		double rating, String writer ) {
    	this.musicName =name;
    	this.musicGenre=genre;
    	this.musicLength =length;
    	this.musicLyrics=lyrics;
    	this.releaseDate=date;
    	this.artist=artist;
    	this.ratings =rating;
    	this.writer =writer;
    	
    }
	
	/**
	 * accessor method for music name:
	 * @return
	 */
	public String getName () {
		return musicName;
	}
	/**
	 * Setter for music name
	 */
	public void setName(String musicName) {
		this.musicName = musicName;
	}
	
	/**
	 * Description
	 * @param obj
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		
		else if(getClass() != obj.getClass()) return false;
		
		else{
			Music song = (Music) obj; //Type casting
			return (musicName.equals(song.musicName) && 
					musicGenre.equals(song.musicGenre) &&
					musicLength == song.musicLength &&
					musicLyrics.equals(song.musicLyrics) &&
					releaseDate.equals(song.releaseDate) &&
					artist.equals(song.artist) &&
					ratings == song.ratings &&
					writer.equals(song.writer));
		}
	}
	
	/**
	 * Description
	 * @param 
	 * @return int
	 */
	@Override
	public int hashCode() { 
		int hash = 7; 
		
		hash = 31 * hash + musicName.length(); 

		hash = 31 * hash + (musicGenre == null ? 0 : musicGenre.hashCode()); 

		hash = (int) (31 * hash + (musicLength == 0 ? 0 : musicLength)); 
		
		return hash; 
		}
	
	
	
			
	/**
	 * Description
	 * @param args
	 */
	public static void main(String[] args) {
		Music song = new Music("Buga", "Hip", 7.12, 
				"Buga", "12/03/2022", "Akira", 4.5, "Akwaboah");
		Music song1 = new Music("Soldier", "Hip", 7.12, 
				"Buga", "12/03/2022", "Akira", 4.5, "Akwaboah");
		
		System.out.println("Equals: "+song.equals(song1));
		
		System.out.println("HashCode: "+ (song.hashCode() == song1.hashCode()));
		
		System.out.println("Music Name: "+song.getName()+ ", HashCode Details: "+song.hashCode());
	
		try{
			File file = new File("/home/icp/file.txt");
			FileReader fileReader = new FileReader(file);
		}

//		Catch possible exception i.e FileNotFound
//		Exception
		catch(FileNotFoundException fe){
			System.out.println(fe.getMessage());
		}
		
//		Catch possible exception i.e IOException
		catch(IOException ie) {
			System.out.println(ie.getMessage());
		}

		
				//ArrayIndexOutOfBoundsException
				int array[] = {1, 2, 3, 4, 5};
				//getting a particular element in the
				// array:
				try {
					int part_element = array[5];
					
					//catching a possible indexing error with the help
					// of the ArrayIndexOutOfBoundsException class:

				}catch(ArrayIndexOutOfBoundsException ae) {
					System.out.println(ae.getMessage());
					
				}
				
	}

}
