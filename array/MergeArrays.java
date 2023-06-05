/*WAJP to merge two arrays in the third array.*/
package array;

public class MergeArrays {

	public static void main(String[] args) {
		char ch1[] = {'a', 'b', 'c','d'};
		char ch2[] = {'x','y','z'};
		
		char ch3[] = new char[ch1.length+ch2.length];
		int memory=0;
		
		for (int i = 0; i < ch1.length; i++) {
			ch3[memory] = ch1[i];
			memory++;
		}
		
		for (int i = 0; i < ch2.length; i++) {
			ch3[memory] = ch2[i];
			memory++;
		}
		
		for (int i = 0; i < ch3.length; i++) {
			System.out.print(ch3[i]+" ");
		}
 	}
	
}
