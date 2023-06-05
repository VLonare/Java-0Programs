package wrapper;

public class Wrap2 {
	
	public static void main(String[] args) {
		Double d1 = new Double(10.22);
		Double d2 = new Double(10.22);
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
