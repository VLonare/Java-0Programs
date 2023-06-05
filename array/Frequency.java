package array;

import java.util.Arrays;

public class Frequency 
{
	public static void main(String[] args) 
	{
		int a[] = {5,8,5,0,3,8,5,6,7};
		int freq[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		for (int i = 0; i < a.length; i++) 
		{
			int count =1;
			
				for (int j = i+1; j < a.length; j++) 
				{
					if (a[i]==a[j]) 
					{
						count++;
						freq[j]=0;
					}
				}
			
			
			if (freq[i]!=0) 
			{
				freq[i] = count;
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if (freq[i]!=0) 
			{
				System.out.println(a[i]+" is repeated "+freq[i]+" times.");
			}
		}
		
		System.out.println(Arrays.toString(freq));
	}
}
