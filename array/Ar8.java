/* WAJP TO PRINT THE EVEN ELEMENTS OF AN ARRAY*/
package array;

public class Ar8 {

	public static void main(String[] args) {
		int a[] = {1,3,4,7,9,8,6};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	
}
