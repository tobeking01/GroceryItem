/**
 * 
 * @author Tobechi Onwenu, Instructor: Jessica Maistrovich, Programming
 *         assignment1, Unordered List, Grocery Shopping application,
 *         Main class: ShoppingCartDriver.
 */
public class ShoppingCartDriver {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating one ShoppingCart
		ShoppingCart customer1 = new ShoppingCart("Hosea Macanem");

		// Adding three GroceryItems to the first ShoppingCart
		customer1.add("Beans", 1.57, 5);
		customer1.add("Corn", 2.53, 3);
		customer1.add("Pear", 0.87, 6);

		// Printing the items in ShoppingCart one
		System.out.println(customer1);

		System.out.println("\n" + "*****************************************************" + "\n");

		// Creating a second ShoppingCart
		ShoppingCart customer2 = new ShoppingCart("John Delany");

		// Adding five GroceryItems to the second ShoppingCart
		customer2.add("Orange", 4.75, 12);
		customer2.add("Berrys", 8.25, 2);
		customer2.add("Juice", 5.05, 2);
		customer2.add("Water", 8.65, 2);
		customer2.add("Guava", 6.95, 4);

		// Printing the items in ShoppingCart one
		System.out.println(customer2);

		System.out.println("\n" + "*****************************************************" + "\n");

		// Test the special case where the GroceryItem has already been added (add() causes the existing item's quantity to be changed).
		// Test the special case where the array is too full to add another item.
		System.out.println("Questions based on Shopping customer 1");
		System.out.println("Trying to find ant in the grocery list one: " + customer1.find("ant"));
		System.out.println("Trying to find Beans in the grocery list one: " + customer1.find("Beans"));
		
		// Getting the total number of items in the Grocery list
		System.out.println("Total number of grocery items in list one are: " + customer1.getNumGroceryItems());
		
		// Getting the total quantity of items in the Grocery list
		System.out.println("Total number of grocery items in list one are: " + customer1.getTotalQuantity());

		System.out.println("\n" + "*****************************************************" + "\n");

		// Test the special case where the GroceryItem has already been added (add() causes the existing item's quantity to be changed).
		// Test the special case where the array is too full to add another item.
		System.out.println("Questions based on Shopping customer 2");
		System.out.println("Trying to find sand in the grocery list two: " + customer2.find("sand"));
		System.out.println("Trying to find Berrys in the grocery list two: " + customer2.find("Berrys"));
		
		// Getting the total number of items in the Grocery list
		System.out.println("Total number of grocery items in list two are: " + customer2.getNumGroceryItems());
		
		// Getting the total quantity of items in the Grocery list
		System.out.println("Total quantity in the grocery items in list two are: " + customer2.getTotalQuantity());

	}

}
