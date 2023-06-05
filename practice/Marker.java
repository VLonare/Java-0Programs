package practice;

public class Marker {
	String brand="Camlin";
	double price;
	String color;
	String type;
	{
		System.out.println("Marker Creating...");
	}
	Marker(){}
	Marker(double price, String color, String type)
	{
		System.out.println("Constructor execution started");
		this.color=color;
		this.price=price;
		this.type=type;
		System.out.println("Marker Created");
		System.out.println("Constructor executed ended");
	}
	public void displayMarker()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(type);
	}

}
