package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AL6 {

	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.add("Mahesh");
		s1.add("Manoj");
		s1.add("Aditya");
		s1.add("Zameer");
		s1.add("Wilson");
		
		Collections.sort(s1);
		System.out.println(s1);
	}
	
}
