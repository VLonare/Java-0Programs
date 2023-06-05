package array;

public class SmallestCharacter {

	public static void main(String[] args) {
		char ch1[] = {'a','&', '!', 'b','@', 'A', 'z'};
		char min=ch1[0];
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i]<min) {
				min = ch1[i];
			}
		}
		System.out.println(min);
 	}
	
}
