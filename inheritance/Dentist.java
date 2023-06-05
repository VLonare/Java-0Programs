package inheritance;

public class Dentist extends Doctor{

	String spl;
	String organ;
	
	public Dentist() {
		// TODO Auto-generated constructor stub
	}
	
	Dentist(String name, String degree, double fee, String spl, String organ )
	{
		super(name, degree, fee);
		this.spl=spl;
		this.organ=organ;
	}
	
	public void dispDentist()
	{
		dispDoctor();
		System.out.println("Specialization: "+spl);
		System.out.println("Organ: "+organ);
	}
}
