package ArrayList;

import java.util.ArrayList;

public class Fruits1 {

	public static void main(String[] args) {
		ArrayList fruit = new ArrayList<>();
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Jamun");
		fruit.add("Apple");
		fruit.add("Strawberry");
		fruit.add("Papaya");
		fruit.add("Orange");
		fruit.add("Pineapple");
		fruit.add("Watermelon");
		fruit.add("Muskmelon");
		
		System.out.println(fruit);
		System.out.println(fruit.size());
		
		if (fruit.contains("Pineapple")) {
			System.out.println("Found !");
			fruit.remove("Pineapple");
			System.out.println(fruit);
		}
		else {
			System.out.println("Not Found");
		}
		
		
	}
}
