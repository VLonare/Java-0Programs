package ArrayList;

import java.util.ArrayList;

public class Fruits {
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
		
		int i;
		for (i = 0; i < fruit.size(); i++) {
			if (fruit.get(i) == "Pineapple") {
				System.out.println("Found !");
				fruit.remove("Pineapple");
				break;
			}
		}
		
		if (i == fruit.size()) {
			System.out.println("Not found");
		}
		System.out.println(fruit);
	}
}
