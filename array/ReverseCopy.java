/*WAJP to copy the elements of one array to another array in reverse order.*/
package array;

public class ReverseCopy {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = new int[a.length];
		
		int j=b.length-1;
		for (int i = 0; i < b.length; i++) {
			b[i] = a[j];
			j--;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
	
}
