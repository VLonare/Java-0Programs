/*WAJP to merge two arrays in zigzag manner*/
package array;

public class MergeZigZag {

	public static void main(String[] args) 
	{
		int a[]= {1,3,5,7,9};
		int b[]= {2,4,6,8,10};
		int c[]= new int[a.length+b.length];
		
		int j=0;
		
		for (int i = 0; i < c.length; i+=2) {
			c[i] = a[j];
			c[i+1] = b[j];
			j++;
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+",");
		}
	}
	
}
