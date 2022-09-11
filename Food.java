/**
 * 
 */
package ashesi.edu.gh.ICP313;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 * @author David Ebo Adjepon-Yamoah, Dr. Sowah
 * @author Banahene-Owusu Osei
 * @version 1.0.3
 */
public class Food {
	/**
	 * Instance Variables/Fields
	 */
	private String foodName;
	private String chefName;
	private double calories;
	private String countryName;
	private String dietaryRequirements;
	private double price;
	
	/**
	 * Constructor: 
	 * Build and initialise objects of this class 
	 * @param foodName the name of the food
	 * @param chefName the chef's name
	 * @param calories the calories in the food
	 * @param countryName the country of origin
	 * @param dietaryRequirements the dietary requirements
	 * @param price the price of the food
	 */
	public Food(String foodName, String chefName, 
			double calories, String countryName,
			String dietaryRequirements, double price) {
		this.foodName = foodName;
		this.chefName = chefName;
		this.calories = calories;
		this.countryName = countryName;
		this.dietaryRequirements = dietaryRequirements;
		this.price = price;
	}
	
/**
 * returns the name of the food	
 * @return this.foodName
 *
 */
public String getFoodName() {
	return this.foodName;
}
/**
 * @returns the price of a food object
 */
public double getfoodPrice( ) {
	return this.price;
}
/*
 * returns teh name of the chef
 */
public String getChefName() {
	return this.chefName;
}

public void setFoodName(String foodName) {
	if(foodName.length() <= 0)
		System.out.println("Food Name is is invalid");
	else {
		this.foodName = foodName;
	}
}

/**
 * @param 
 * @return String
 */
@Override
public String toString() {
	return "Food Details: "+ foodName + ", "+
			chefName+ ", "+calories+ ", "+
			countryName+ ", "+dietaryRequirements
			+ ", "+price;}

/*
 * @Override 
 * public boolean equals(Object anotherObj) { if(this == anotherObj)
 * return true; 
 * if(anotherObj instanceof Food) {} 
 * 	return false; }
 */

/**
 * @param obj
 * @return boolean
 */
@Override
public boolean equals(Object obj){
	if(obj == null) return false;
	
	else if(getClass() != obj.getClass()) return false;
	
	else{
		Food food = (Food) obj; //Type casting
		return (foodName.equals(food.foodName) && 
				chefName.equals(food.chefName) &&
				calories == food.calories &&
				countryName.equals(food.countryName) &&
				dietaryRequirements.equals(food.dietaryRequirements) &&
				price == food.price);
	}
}

/**
 * @param 
 * @return int
 */
@Override
public int hashCode() { 
	int hash = 7; 
	
	hash = 31 * hash + foodName.length(); 

	hash = 31 * hash + (chefName == null ? 0 : chefName.hashCode()); 

	hash = (int) (31 * hash + (calories == 0 ? 0 : calories)); 
	
	return hash; 
	}

	/**
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Food food = new Food("Banku", "Charles", 100.0, 
				"Ghana", "Vegan", 15.50);
		
		System.out.println("Food Name: "+food.getFoodName());
		System.out.println(food.toString());
		food.setFoodName("");
		System.out.println(food.getFoodName());
		
		try {
			File file = new File("/home/icp/file.txt");
			FileReader fileReader = new FileReader(file);
		}
		//The file isnt there
		catch(FileNotFoundException fnfe) {
			System.out.println("Exception caught: "+fnfe.getMessage());
		}
		//Catch all input and output exceptions
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Exception caught!");	
		
		}
		
		try {	
			int array[] = {1, 2, 3, 4, 5};
			System.out.println(array[7]);
		}
		// catch any indices that are outside the range of the array
		catch (ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("Exception caught!" + ae.getMessage());
		}

		 
	}

}
