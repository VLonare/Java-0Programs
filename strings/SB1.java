package strings;

public class SB1 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Hello");
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
	
}
