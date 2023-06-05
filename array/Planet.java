package array;

public class Planet {

	String name;
	double gas [] = new double[4];

	public Planet() {
		// TODO Auto-generated constructor stub
	}
	
	Planet(String name, double o2, double n2, double h2, double co2)
	{
		this.name=name;
		this.gas[0] = o2;
		this.gas[1] = n2;
		this.gas[2] = h2;
		this.gas[3] = co2;
	}
	
	public void displayPlanet()
	{
		System.out.println("Name: "+name);
		System.out.println("O2: "+gas[0]);
		System.out.println("N2: "+gas[1]);
		System.out.println("H2: "+gas[2]);
		System.out.println("CO2: "+gas[3]);
		System.out.println("=============================");
	}
}
