package inheritance;

public class Cardiologist extends Doctor {

	String spl;
	String organ;
	
	public Cardiologist() {
		// TODO Auto-generated constructor stub
	}
	 
	Cardiologist(String name, String degree, double fee, String spl, String organ)
	{
		super(name, degree, fee);
		this.spl=spl;
		this.organ=organ;
	}
	
	public void dispCardiologist()
	{
		dispDoctor();
		System.out.println("Specialization: "+spl);
		System.out.println("Organ: "+organ);
	}
}
