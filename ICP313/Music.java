/**
 * 
 */
package ashesi.edu.gh.ICP313;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author David Ebo Adjepon-Yamoah
 * @version 1.0.3
 */
public class Music implements Playable{

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
	 * Constructor: Building an object of class Music
	 * 
	 * @param name
	 * @param genre
	 * @param length
	 * @param lyrics
	 * @param date
	 * @param artist
	 * @param rating
	 */
	public Music(String name, String genre, double length, String lyrics, String date, String artist, double rating,
			String writer) {
		this.musicName = name;
		this.musicGenre = genre;
		this.musicLength = length;
		this.musicLyrics = lyrics;
		this.releaseDate = date;
		this.artist = artist;
		this.ratings = rating;
		this.writer = writer;

	}

	/**
	 * accessor method for music name:
	 * 
	 * @return
	 */
	public String getName() {
		return musicName;
	}
	
	public double getRating() {
		return ratings;
	}

	/**
	 * accessor method for music name:
	 * 
	 * @return
	 */
	public String getGenre() {
		return musicGenre;
	}
	
	public void setRating(Double rating) {
		this.ratings = rating;
		
	}

	/**
	 * Setter for music name
	 */
	public void setName(String musicName) {
		this.musicName = musicName;
	}

	/**
	 * Description
	 * 
	 * @param obj
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		else if (getClass() != obj.getClass())
			return false;

		else {
			Music song = (Music) obj; // Type casting
			return (musicName.equals(song.musicName) && musicGenre.equals(song.musicGenre)
					&& musicLength == song.musicLength && musicLyrics.equals(song.musicLyrics)
					&& releaseDate.equals(song.releaseDate) && artist.equals(song.artist) && ratings == song.ratings
					&& writer.equals(song.writer));
		}
	}

	/**
	 * Description
	 * 
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
	 * BufferedReader Example
	 * @throws IOException 
	 */
	public void readingWithBuffering() throws IOException
	{
		FileReader in1 =null;
		BufferedReader br= null;
		try
		{
			in1=new FileReader("C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\Data.txt");
			br= new BufferedReader(in1);
			String x;
		while ((x=br.readLine()) != null)
		{
			System.out.println(x);
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if (br !=null)
				br.close();
		}
	}

	/**
	 * Main Method
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//EXAMPLE 4: BufferedReader
		//readingWithBuffering();
		
		//EXAMPLE 1: The Scanner object has not been closed
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Song Tile: ");
		String songTitle = scan.nextLine();
		
		
		System.out.println("Enter Song Genre: ");
		String songGenre = scan.nextLine();
		
		System.out.println("Enter Song Length: ");
		double songlength = scan.nextDouble();
		
		Music song = new Music(songTitle, songGenre, songlength, "Buga", "12/03/2022", "Akira", 4.5, "Akwaboah");
		
		System.out.println("Enter Song Rating: ");
		double songRating = scan.nextDouble();
		if (songRating >=0 && songRating <= 5) {
			song.setRating(songRating);
		}
		else {
			System.out.println("Ratings is between 0 and 5");
		}
			
		
		Music song1 = new Music("Soldier", "Hip", 7.12, "Buga", "12/03/2022", "Akira", 4.5, "Akwaboah");

		System.out.println("Equals: " + song.equals(song1));

		System.out.println("HashCode: " + (song.hashCode() == song1.hashCode()));

		System.out.println("Music Name: " + song.getName() + ", Music Genre: "+ song.getGenre()+", HashCode Details: " + song.hashCode() + ", Music Ratings: "+ song.getRating()+", HashCode Details: " + song.hashCode() );
		
		//System.out.println("Music Name: " + song.get + ", HashCode Details: " + song.hashCode());

		/*
		 * try { File file = new File(
		 * "C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\file.txt"
		 * );
		 * 
		 * @SuppressWarnings({ "unused", "resource" }) FileReader fileReader = new
		 * FileReader(file); }
		 * 
		 * //Catch possible exception i.e FileNotFound //Exception catch
		 * (FileNotFoundException fe) { System.out.println(fe.getMessage()); }
		 * 
		 * //Catch possible exception i.e IOException catch (@SuppressWarnings("hiding")
		 * IOException ie) { System.out.println(ie.getMessage()); }
		 * 
		 * // ArrayIndexOutOfBoundsException int array[] = { 1, 2, 3, 4, 5 }; // getting
		 * a particular element in the // array: try {
		 * 
		 * @SuppressWarnings("unused") int part_element = array[3];
		 * 
		 * // catching a possible indexing error with the help // of the
		 * ArrayIndexOutOfBoundsException class:
		 * 
		 * } catch (ArrayIndexOutOfBoundsException ae) {
		 * System.out.println(ae.getMessage());
		 * 
		 * }
		 */
		
		//EXAMPLE 2:
		 String data = "This is a text inside the file.";
		 
		 try { 
			PrintWriter output = new PrintWriter(
					"C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\output.txt");
		 
		 	output.print(data); 
		 	output.close(); 
		 	} 
		 catch(Exception e) { e.getStackTrace();}
		 
		
		/**
		 * TASK: Demo of the Scanner, PrintWriter, 
		 * FileInputStream, FileOutputStream Classes
		 */
		
		 Scanner inputStream = null; 
		 PrintWriter outputStream = null;
		 
		 try { 
			 	inputStream = new Scanner( new FileInputStream(
					 "C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\original.txt")); 
			 	outputStream = new PrintWriter( 
			 			new FileOutputStream(
			 					"C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\numbered.txt"));
			 }
		catch(FileNotFoundException fnfe) {
				System.out.println("Problem opening file:"
				+fnfe.getMessage());
		}
		finally {
		
			//Gracefully closing the program by 
			//killing the current JVM
			System.exit(0);
		}
				  
			 String line = null; 
			 int count = 0;
			 
			 while(inputStream.hasNextLine()) { 
				 line = inputStream.nextLine(); 
				 count++;
				 outputStream.println(count + " " + line); 
			 } 
			 inputStream.close();
			 outputStream.close();
	}

}