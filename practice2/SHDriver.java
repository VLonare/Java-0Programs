package practice2;

public class SHDriver {
	public static void main(String[] args) {
		Shoe s1= new Shoe("Brown", 4614.00, 9);
		
		
		s1.dispSH();
		
		System.out.println("=================================");
		
		Shoe2 s2 = new Shoe2("NEON", 54510.00, 10, "Running Tracks");
		
		System.out.println(s1.getBrand());
		
		System.out.println("=================================");
		
		s2.dispSH();
		System.out.println("=================================");
		s2.dispSH2();
	}
}
