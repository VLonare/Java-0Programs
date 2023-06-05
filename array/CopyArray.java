/*WAJP to copy elements of one array into another array*/
package array;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = {2,9,7,8,55,44};
		int b[]  = new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
	
}
