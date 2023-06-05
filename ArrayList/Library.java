package ArrayList;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		ArrayList shelf1 = new ArrayList<>();
		
		shelf1.add("Java");
		shelf1.add("SQL");
		shelf1.add("Manual");
		shelf1.add("Selenium");
		shelf1.add("J2EE");
		
		ArrayList shelf2 = new ArrayList<>();
		
		shelf2.add("Wing of fire");
		shelf2.add("Ramayana");
		shelf2.add("Mahabharta");
		shelf2.add("Harry Potter");
		shelf2.add("Lord of Rings");
		
		ArrayList shelf3 = new ArrayList<>();
		
		shelf3.add(shelf1);
		shelf3.add(shelf2);
		
		System.out.println(shelf3%);
	}
	
}
