package polymorphism;

public class C1C2Driver {
	public static void main(String[] args) {
		C1 c = new C2();  //upcasting
		c.nonStat();  //method over-riding
		c.stat();  //method shadowing
	}
}
