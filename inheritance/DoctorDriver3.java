package inheritance;

public class DoctorDriver3 {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Rajesh", "MBBS", 500.00);
		Cardiologist c1= (Cardiologist) d1; //ClassCastException
		
		//c1.displayCardiologist();
		
	}
}
