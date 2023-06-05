package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AL5 {

	public static void main(String[] args) {
		ArrayList<Integer> i1 = new ArrayList<>();
		
		i1.add(54);
		i1.add(34);
		i1.add(12);
		i1.add(7);
		i1.add(0);
		
		Collections.sort(i1);
		System.out.println(i1);
		Collections.reverse(i1);
		System.out.println(i1);
		Collections.shuffle(i1);
		Collections.shuffle(i1);
		System.out.println(i1);
		System.out.println(Collections.max(i1));
		Collections.swap(i1, 7, 9);
		System.out.println(i1);
		Collections.rotate(i1, 2);
		System.out.println(i1);
		
	}
	
}
