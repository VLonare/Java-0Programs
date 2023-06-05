package relationships;

public class Pendrive {
	String brand;
	double memory;
	double price;
	String type;
	String version;
	
	public Pendrive() {
		// TODO Auto-generated constructor stub
	}
	
	Pendrive(String brand, double capacity, double cost, String type, String version)
	{
		this.brand=brand;
		memory=capacity;
		price=cost;
		this.type=type;
		this.version=version;
	}
	
	public void displayPendrive()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price: "+price+" INR");
		System.out.println("Capacity: "+memory+" GB");
		System.out.println("Material used: "+type);
		System.out.println("Version: "+version);
	}
}
