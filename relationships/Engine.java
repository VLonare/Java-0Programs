package relationships;

public class Engine {
	String fuel;
	int hp;
	int tor;
	int cy;
	int cc;
	
	Engine(){}
	
	Engine (String fuel, int hp, int torque, int cylinder, int cc)
	{
		this.fuel=fuel;
		this.hp=hp;
		tor=torque;
		cy=cylinder;
		this.cc=cc;
		
	}
	public void displayEngine(){
		System.out.println("Fuel= "+fuel);
		System.out.println("Horsepower= "+hp);
		System.out.println("Max Torque= "+tor+" Nm");
		System.out.println("Cylinders= "+cy);
		System.out.println("Engine Capacity= "+cc+" cc");
	}

}

