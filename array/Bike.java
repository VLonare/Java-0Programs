package array;

public class Bike {

	String brand;
	String name;
	double price;
	String color;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	Bike(String brand,String name,double price,String color)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public void displayBike()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
	}
	
}
