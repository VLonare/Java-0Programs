package array;

public class RotateArrayLeft {

	public static void main(String[] args) {		
		int ar1[] = {1,3,5,5,4,2,1,7};
		int first = ar1[0];
		
		for (int i = 1; i < ar1.length; i++) {
			ar1[i-1] = ar1[i];
		}
		
		ar1[ar1.length-1] = first;
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" ");
		}
	}
	
}
