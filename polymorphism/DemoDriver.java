package polymorphism;

public class DemoDriver {

	public static void main(String[] args) {
		Test t1 = new Demo();  //Upcasting
		t1.a();
		t1.b();  //Over-riding
		
	}
}
