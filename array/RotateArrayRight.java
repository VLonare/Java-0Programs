package array;

public class RotateArrayRight {

	public static void main(String[] args) {		
		int ar1[]= {1,3,5,5,4,2,1,7};
		int res[] = rotate(ar1);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static int[] rotate(int a[])
	{
		int temp=a.length-1;
		for (int i = a.length-1; i >0; i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		return a;
	}
	
}
