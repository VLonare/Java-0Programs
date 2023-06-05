/*WAJP to merge two arrays in the third using only one loop.*/
package array;

public class MergeArray2 {
	
	public static void main(String[] args) {
		char ch1 [] = {'a','b','c','d'};
		char ch2 [] = {'x','y','z'};
		
		char ch3 [] = new char[ch1.length+ch2.length];	
		int mem=0;
		
		for (int i = 0; i < ch3.length; i++) 
		{
			if(i==0)
			{
				ch3[i]=ch1[i];
			}
			else if(i<ch1.length)
			{
				ch3[i]=ch1[i];
			}
			else
			{
				ch3[i]=ch2[mem];
				mem++;
			}
		}
		
		for (int i = 0; i < ch3.length; i++) 
		{
			System.out.print(ch3[i]+",");
		}
	}
	
}
