package polymorphism;

public class C3C4Driver {
	public static void main(String[] args) {
		C3 c = new C4();
		
		//variable shadowing
		System.out.println(c.a);
		System.out.println(c.d);
	}
}
