package exceptions;

public class FoodDriver {
	
	public static void main(String[] args) {
		try 
		{
			FoodOrder f1 = new FoodOrder("Biryani", -1);
			f1.dispOrder();
		}
		catch (ZeroQuantityException e) 
		{
			System.out.println("Please order in appropriate quantity.");
		}
		finally 
		{
			System.out.println("Thank You.");
		}
	}
}
