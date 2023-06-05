package array;

import java.util.Arrays;

public class PlanetDriver 
{

	public static void main(String[] args) 
	{
		Planet p[] = new Planet[5];
		p[0] = new Planet("Pluto", 12.6, 17.45, 12.15, 12.125); 
		p[1] = new Planet("Jupiter", 12.654, 14.57, 18.7, 12.36); 
		p[2] = new Planet("Neptune", 0.0, 14.65, 45.300, 1.22); 
		p[3] = new Planet("Saturn", 12.00, 12.6, 23.6, 1.2); 
		p[4] = new Planet("Venus", 7.2, 5.3, 0.0, 2.3); 
		
		double ct[] = new double[4];
		String gname[] = {"Oxygen", "Hydrogen", "Nitrogen", "CarbonDioxide"};
		
		for (int i = 0; i < p.length; i++) 
		{
			for (int j = 0; j < gname.length; j++) 
			{
				ct[j] = ct[j] + p[i].gas[j];
			}
		}
		
		System.out.println(Arrays.toString(ct));
		
		int index=0;
		double max = ct[0];
		
		for(int i=0; i<ct.length;i++)
		{
			if (ct[i]>max) 
			{
				max=ct[i];
				index=i;
			}
		}
		
		System.out.println("The dominant gas in the universe is "+gname[index]+" of "+max);
		
	}
	
}
