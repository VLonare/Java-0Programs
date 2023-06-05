package ArrayList;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add("Qspiders");
		a1.add(true);
		a1.add(10);
		a1.add('z');
		a1.add(12.12);
		a1.add(3225.78f);
		
		System.out.println(a1);
		
		a1.add(2, "Vaibhav");
		System.out.println(a1);
		
		a1.remove(12.12);
		System.out.println(a1);
		
		if (a1.contains("Qspiders")) {
			System.out.println("It is a training institute.");
		}
		else {
			System.out.println("No element found.");
		}
		
		if (a1.indexOf("Jspiders")>=0) {
			System.out.println(a1.get(a1.indexOf("Jspiders")));
		}
		else {
			System.out.println("Element not found.");
		}
		
	}
	
}
