package objectclass;

public class EmpDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1234, "Smith", 25000.00, "Google");
		System.out.println(e1.toString());
		
		Employee e2 = new Employee(1232, "Smita", 35000.00, "Meta");
		
		Employee e3 = new Employee(1234, "Smith", 25000.00, "Google");
		
		System.out.println(e1.equals(e3));
		
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		System.out.println(e3);
		System.out.println(e3.hashCode());
		
		System.out.println(e1==e3);
		
	}
}
