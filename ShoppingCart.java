import java.text.DecimalFormat;

/**
 * 
 * @author Tobechi Onwenu, Instructor: Jessica Maistrovich, Programming
 *         assignment1, Unordered List, Grocery Shopping application,
 *         ShoppingCart Class.
 *
 */

public class ShoppingCart {

	// a string that represents the customer's name.
	private String customerName;

	// an instance variable of type array of GroceryItem.
	private GroceryItem[] order;
//	private GroceryItem[ ] order = new GroceryItem[100];

	// an instance variable that indicates the number of GroceryItems that have been
	// added to the ShoppingCart
	private  int numItems;

	// Tax rate constant
	private final double TAXRATE = 7.5;

	/**
	 * A no-arguments constructor For ShoppingCart Class
	 */
	public ShoppingCart() {
		this.order = new GroceryItem[10];
		numItems = 0;
		this.customerName = "";
	};

	/**
	 * A one parameter constructor for ShoppingCart
	 * @param customerName
	 */
	public ShoppingCart(String customerName) {

		this.customerName = customerName;
		this.order = new GroceryItem[10];
		for (int i = 0; i < 10; i++) {
			order[i] = new GroceryItem("", 0.0, 0);
		}
		numItems = 0;

	}

	/**
	 * A third constructor that has two parameters
	 * @param customerName
	 * @param capacity for the array
	 */
	public ShoppingCart(String customerName, int capacity) {

		this.customerName = customerName;
		this.order = new GroceryItem[capacity];
		numItems = 0;

	}

	/**
	 * A method that takes three inputs parameters to represent the GroceryItem's 
	 * @param name
	 * @param price
	 * @param quantity
	 * @return
	 */
	public boolean add(String name, double price, int quantity) {

		// Checks if current number of items is equals to length of the array
	       // displays the error message and returns false
	       if(numItems == order.length)
	       {
	           System.out.println("\n Unable to add item cart is full.");
	           return false;
	       }
	       // Otherwise add the item to cart
	       else
	       {
	           // Creates an object of class GroceryItem using parameterized constructor
	           // Assigns it to numItems index position of order
	           // and increases the numItems by one
	           order[numItems++] = new GroceryItem(name, price, quantity);
	           return true;
	       }
	}

	/**
	 * 
	 * find() searches the items array and returns the index of the matching GroceryItem.  find() returns -1 if no match is found in the items array.
	 * @param name
	 * @return
	 */
	public int find(String name) {	
		 // Loops till number of items available in the shopping cart
	       for(int i = 0; i < order.length; i++)
	           // Checks if parameter item name is equals current object
	           // item name then returns loop variable as found index position
	           if(name.equals(order[i].getName()))
	               return i;
	       // Otherwise returns -1 for not found
	       return -1;
	}

	/**
	 * 
	 * A method that calculates and returns the total value of all items in this ShoppingCart
	 * @return
	 */
	public double getTotalBeforeTax() {
		double total = 0;
		for (int i = 0; i < order.length; i++) {
			total += order[i].getPrice() * order[i].getQuantity();
		}
		return total;
	}


	/**
	 * 
	 * A method with one parameter, taxRate.  getTax() calculates and returns a double representing the tax to be paid on the ShoppingCart.
	 * @param taxRate
	 * @return
	 */
	public double getTax(double taxRate) {
		double beforTaxTotal = 0;
		for (int i = 0; i < order.length; i++) {
			beforTaxTotal += order[i].getPrice() * order[i].getQuantity();
		}
		double finalTax = beforTaxTotal * taxRate / 100;
		return finalTax;
	}

	/**
	 * 
	 * A method that returns the number of GroceryItems in the ShoppingCart.
	 * @return
	 */
	public int getNumGroceryItems() {
		return numItems;
	}

	/**
	 * 
	 * A method that sums and returns the quantities of all GroceryItems in the ShoppingCart
	 * @return
	 */
	public int getTotalQuantity() {
		int sumOfQuantity = 0;
		for (int i = 0; i < order.length; i++) {
			sumOfQuantity += order[i].getQuantity();
		}
		return sumOfQuantity;
	}

	/**
	 * 
	 * A method that returns a string representation of the ShoppingCart that includes the following:
	 * customer's name,
	 * number of GroceryItems in this statement,
	 * details of all the GroceryItems, one per line
	 * the ShoppingCart total before tax 
	 * the amount of tax to be added (use a fixed rate of 7.5%)
	 * the ShoppingCart total after tax has been added
	 * 
	 */
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		String temp = customerName + "\n"
				+ "------------------------------------------------------------------------------------------" + "\n"
				+ "Item" + "\t" + "\t" + "\t" + "Price" + "\t" + "\t" + "Qty" + "\t" + "\t" + "\t" + "Total" + "\n"
				+ "------------------------------------------------------------------------------------------" + "\n";

		for (int i = 0; i < order.length; i++) {
			if (!order[i].getName().equals("")) {
				temp += order[i].getName() + "\t" + "\t" + "\t $" + df.format(order[i].getPrice()) + "\t" + "\t"
						+ order[i].getQuantity() + "\t" + "\t" + "\t$"
						+ df.format(order[i].getPrice() * order[i].getQuantity()) + "\n";
			}

		}

		temp += "------------------------------------------------------------------------------------------" + "\n"
				+ "Total: " + "\t" + "\t" + "\t$" + df.format(getTotalBeforeTax()) + "\n" + "Tax: " + "\t" + "\t"
				+ "\t$" + df.format(getTax(TAXRATE)) + "\n"
				+ "-------------------------------------------------------------------------------------------" + "\n"
				+ "Grand total: " + "\t$" + df.format(getTotalBeforeTax() + getTax(TAXRATE));

		return temp;

	}

}