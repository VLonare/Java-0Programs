package inheritance;

public class DemoDriver {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		
		Demo.staticDisplayDemo();
		d1.staticDisplayDemo();
		
		System.out.println("=====================");
		
		Test.staticDisplayTest();
		d1.staticDisplayTest();
		
		System.out.println("=====================");
		
		System.out.println(d1.d);
		System.out.println(Test.d);
		System.out.println(d1.a);
		System.out.println(Demo.a);
	}
}
