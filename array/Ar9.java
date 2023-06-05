/* WAJP TO PRINT THE ADDITION OF ODD ELEMENTS OF AN ARRAY*/
package array;

public class Ar9 {

	public static void main(String[] args) {
		int a[] = {2,4,9,10,6,7,13};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				sum+=a[i];
			}
		}
		
		System.out.println("The addition of odd elements of array is: "+sum);
	}
	
}
