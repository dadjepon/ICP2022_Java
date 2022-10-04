/**
 * 
 */
package ashesi.edu.gh.ICP313;

import java.io.IOException;

/**
 * @author dadjepon
 *
 */
public interface Playable {
	
	
	/**
	 * accessor method for music name:
	 * 
	 * @return String
	 */
	public String getName(); 
	
	/**
	 * accessor method for music name:
	 * 
	 * @return double
	 */
	public double getRating(); 

	/**
	 * accessor method for music name:
	 * 
	 * @return String
	 */
	public String getGenre();
	
	/**
	 * Setter for music name
	 * @param rating
	 */
	public void setRating(Double rating);

	/**
	 * Setter for music name
	 * @param musicName
	 */
	public void setName(String musicName); 

	/**
	 * Description
	 * 
	 * @param obj
	 * @return boolean
	 */
	public boolean equals(Object obj);


	/**
	 * Description
	 * 
	 * @param
	 * @return int
	 */
	public int hashCode();

	
	/**
	 * BufferedReader Example
	 * @throws IOException
	 */
	public void readingWithBuffering() throws IOException;



}
