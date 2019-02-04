/**
 * A class to represent items stored in Batman's utility belt. Several copies of an item may appear
 * in the Utility belt (e.g. 5 batarangs), so the Equipment class keeps a count variable tracking
 * the number of copies of the item. I.e. there would be one equipment object for "batarangs", for
 * which the count variable would be equal to 5.
 * 
 * @author Matthew Whitehead
 * @version 2019-02-03
 */
public class Equipment
{
    
	/**
     * The name of the items.
     */
    private String name;
    
    /**
     * The number of copies of the item stored in the belt.
     */
    private int count;
    
    /**
     * The total weight of the items.
     */
    private double totalWeight;
    
    /**
     * The total price of the items.
     */
    private double totalPrice;
    
    /**
     * The description of the items.
     */
    private String description;
    
    /**
     * Constructor for Equipment. Takes in information on the Equipment as a comma delimited string,
     * stores info on name, count, totalWeight, totalPrice, and its description. Note that the name and count
     * are separated by a comma, not a forward slash.
     * 
     * @param strg Information about the Equipment in the format:
     * 	"name/count,totalWeight,totalPrice,description"
     * The description will not contain any commas or forward-slashes.
     * The count is an integer value.
     */
    public Equipment(String strg)
    {
    	
        // TODO: complete method
    	String[] stuff = strg.split("/|,");
    	name=stuff[0];
    	count=Integer.parseInt(stuff[1]);
    	totalWeight = Double.parseDouble(stuff[2]);
    	totalPrice = Double.parseDouble(stuff[3]);
    	description = stuff[4];
    	return;
    }
    
    /**
     * toString override. Gives all information about the Equipment.
     * 
     * @return All information about the Equipment formatted as (replacing parentheses with member variables):
     * "Name: (name), Number: (count), Weight: (weight, to 2 decimal places) lbs, Price: $(price, to 2 decimal places) - (description)"
     * 
     * e.g.
     * "Name: Batarang, Number: 5, Weight: 3.22 lbs, Price: $700.75 - bat-shaped boomerangs"
     */
    @Override
    public String toString()
    {
        // TODO: complete method
    	return String.format("Name: %s, Number: %d, Weight: %.2f lbs, Price: $%.2f - %s",
                name, count, totalWeight, totalPrice, description);
    }
    
    // TODO: create getters..
    public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public String getDescription() {
		return description;
	}

	}

