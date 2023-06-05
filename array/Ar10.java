/*WAJP TO PRINT THE SUM OF ODD POSITIONS(INDEXES) OF AN ARRAY*/
package array;

public class Ar10 {

	public static void main(String[] args) {
		int a[]  = {2,33,90,87,6,30,7,13};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			if (i%2!=0) {
				sum+=a[i];
			}
		}
		
		System.out.println(sum);
	}
	
}
