
/**
 * 
 * @author Tobechi Onwenu, Instructor: Jessica Maistrovich, Programming
 *         assignment1, Unordered List, Grocery Shopping class application,
 *         GroceryItem Class.
 *
 */

public class GroceryItem {
	// for representing the name of the grocery
	private String name;

	// for representing the price of the grocery
	private double price;

	// for representing the quantity of the grocery
	private int quantity;

	/**
	 * Overloaded Constructor For GroceryItem Class
	 * @param name
	 * @param price
	 * @param qty
	 */
	public GroceryItem(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		quantity = qty;
	}

	/**
	 * Overloaded Constructor For GroceryItem Class
	 * @param name
	 */
	public GroceryItem(String name) {
		this.name = name;
	}

	/**
	 * Get method for the variable name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get method for the variable price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Get method for the variable quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Set method for the variable name
	 */
	public void setName(String a_name) {
		name = a_name;
	}

	/**
	 * Set method for the variable price
	 */
	public void setPrice(double a_price) {
		price = a_price;
	}

	/**
	 * Set method for the variable quantity
	 */
	public void setQuantity(int a_quantity) {
		quantity = a_quantity;
	}

	/**
	 *  Check if a Grocery item name is found based on the input passed
	 * @param a_name1
	 * @param a_name2
	 * @return
	 */
	public boolean equals(String a_name1, String a_name2) {
		if (a_name1.equals(a_name2)) {
			return true;
		}
		return false;

	}

}