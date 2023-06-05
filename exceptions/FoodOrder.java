package exceptions;

public class FoodOrder {
	
	String dish;
	int qty;
	
	public FoodOrder() {
		// TODO Auto-generated constructor stub
	}
	
	FoodOrder(String dish, int qty) throws ZeroQuantityException
	{
		if (qty<=0) {
			throw new ZeroQuantityException("Incorrect Amount!");
		}
		else
		{
			this.dish=dish;
			this.qty=qty;
			System.out.println("Order received.");
		}
	}
	
	public void dispOrder()
	{
		System.out.println("Dish: "+dish);
		System.out.println("Quantity: "+qty);
	}
}
