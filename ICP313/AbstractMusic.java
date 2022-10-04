/**
 * 
 */
package ashesi.edu.gh.ICP313;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dadjepon
 *
 */
public abstract class AbstractMusic {

	/**
	 * Constructor
	 */
	public AbstractMusic() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * accessor method for music name:
	 * 
	 * @return String
	 */
	public abstract String getName(); 
	
	/**
	 * accessor method for music name:
	 * 
	 * @return double
	 */
	public abstract double getRating(); 

	/**
	 * accessor method for music name:
	 * 
	 * @return String
	 */
	public abstract String getGenre();
	
	/**
	 * Setter for music name
	 * @param rating
	 */
	public abstract void setRating(Double rating);

	/**
	 * Setter for music name
	 * @param musicName
	 */
	public abstract void setName(String musicName); 

	/**
	 * Description
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean equals(Object obj);


	/**
	 * Description
	 * 
	 * @param
	 * @return int
	 */
	public abstract int hashCode();

	
	/**
	 * BufferedReader Example
	 * @throws IOException
	 */
	public abstract void readingWithBuffering();

}
