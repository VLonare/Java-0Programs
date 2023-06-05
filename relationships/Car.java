package relationships;

public class Car {
	String brand;
	String color;
	double price;
	int seats;
	String type;
	Engine e1= new Engine("Diesel", 126, 350, 4, 1956);
	
	Car(){}
	
	Car(String brand, String colour, double cost, int seat, String type)
	{
		this.brand=brand;
		color=colour;
		price=cost;
		seats=seat;
		this.type=type;
	}
	
	public void displayCar()
	{
		System.out.println("Brand= "+brand);
		System.out.println("Color= "+color);
		System.out.println("Cost= "+price);
		System.out.println("Maximum seating capacity= "+seats);
		System.out.println("Type= "+type);
		System.out.println("=============================");
	}
}
