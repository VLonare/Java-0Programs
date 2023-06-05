package inheritance;

public class DoctorDriver {
	
	public static void main(String[] args) {
		Cardiologist c1= new Cardiologist("Strange", "MBBS", 150.00, "MD", "Heart");
		Doctor d1=c1;
		d1.dispDoctor();
		System.out.println("====================");
		c1.dispCardiologist();
		System.out.println("====================");
		
		Neurologist n1= new Neurologist("Kabir", "MBBS", 500.00, "MD", "Nerves");
		n1.dispNeurologist();
		System.out.println("====================");
		
		Dentist de1=new Dentist("Gulati", "BDS", 300.00, "Implantology", "Tooth");
		Doctor d2=de1;
		d2.dispDoctor();
		System.out.println("====================");
		de1.dispDentist();
		
	}
	
}
