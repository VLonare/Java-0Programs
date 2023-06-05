package inheritance;

public class Bike {
	int wheels;
	String type;
	String brake;
	String suspension;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	Bike(int wheels, String type, String brake, String suspension)
	{
		this.brake=brake;
		this.suspension=suspension;
		this.type=type;
		this.wheels=wheels;
	}
	
	public void displayBike()
	{
		System.out.println("wheels: "+wheels);
		System.out.println("Type: "+type);
		System.out.println("Brakes: "+brake);
		System.out.println("Suspension: "+suspension);
	}
}
