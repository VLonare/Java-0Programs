package array;

public class GreatestCharacter {

	public static void main(String[] args) {
		char ch1[] = {'a','&', '!', 'b', 'A', 'z', '{'};
		char max=ch1[0];
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i]>max) {
				max = ch1[i];
			}
		}
		System.out.println(max);
 	}
	
}
