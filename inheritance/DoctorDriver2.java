package inheritance;

public class DoctorDriver2 {
	public static void main(String[] args) {
		Doctor d1 = new Cardiologist("Mahesh", "MBBS", 400.00, "MD", "Heart");
		d1.dispDoctor();
		
		//d1.dispCardiologist();  ->CTE
		
		System.out.println("==========================");
		
		Cardiologist s1= (Cardiologist) d1;
		
		s1.dispDoctor();
		s1.dispCardiologist();
	}

}
