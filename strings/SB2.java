package strings;

public class SB2 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Qspiders");
		StringBuffer s2 = new StringBuffer("Deccan");
		StringBuffer s3 = s1.append(s2);
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("====================");
		
		String str1 = "Jspiders";
		String str2 = "Deccan";
		String str3 = str1+str2;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
}
