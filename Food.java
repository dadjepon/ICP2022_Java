/**
 * 
 */
package ashesi.edu.gh.ICP313;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;
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
 * returns the name of the chef
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
	 * BufferedReader Example 4
	 * @throws IOException
	 */
	public static void readingWithBuffering() throws IOException
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
		}finally
		{
			if (br !=null)
				br.close();
		}
	}


	/**
	 * @param args
	 * @return void
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//EXAMPLE 4: BufferedReader 
		readingWithBuffering();
		
		//EXAMPLE 1: INCOMPLETE
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Food Name: ");
		String foodName = scan.nextLine();
		
		System.out.println("Enter Chef Name: ");
		String chefName = scan.nextLine();
		
		System.out.println("Enter amount of calories: ");
		double calories = scan.nextDouble();
		
		//Interesting
		scan.nextLine();
		
		System.out.println("Enter origin of food: ");
		String cName = scan.nextLine();
		
		System.out.println("Enter dietary requirements: ");
		String dietReq = scan.nextLine();
		
		System.out.println("Enter food price: ");
		double foodPrice = scan.nextDouble();
		
		Food food = new Food(foodName, chefName, calories, 
				cName, dietReq, foodPrice);
		
		System.out.println("Food Name: "+food.getFoodName());
		System.out.println(food.toString());
		food.setFoodName("");
		System.out.println(food.getFoodName());
		
		/*
		 * try { File file = new File(
		 * "C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\file.txt"
		 * );
		 * 
		 * @SuppressWarnings({ "unused", "resource" }) FileReader fileReader = new
		 * FileReader(file); } //The file isn't there catch(FileNotFoundException fnfe)
		 * { System.out.println("Exception caught: "+fnfe.getMessage()); } //Catch all
		 * input and output exceptions catch(@SuppressWarnings("hiding") IOException
		 * ioe) { ioe.printStackTrace(); System.out.println("Exception caught!");
		 * 
		 * }
		 * 
		 * try { int array[] = {1, 2, 3, 4, 5}; System.out.println(array[2]); } // catch
		 * any indices that are outside the range of the array catch
		 * (ArrayIndexOutOfBoundsException ae) { ae.printStackTrace();
		 * System.out.println("Exception caught!" + ae.getMessage()); }
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
			inputStream = new Scanner(
					new FileInputStream("C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\original.txt"));
			outputStream = new PrintWriter(
					new FileOutputStream("C:\\Users\\dadjepon\\eclipse-workspace\\ashesi.edu.gh.ICP313\\src\\ashesi\\edu\\gh\\ICP313\\food.txt"));
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("Problem opening file:"
					+fnfe.getMessage());
		}
		finally {
			//Gracefully closing the program by 
			//killing the current JVM
			System.exit(0);}
		
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