package ArrayList;

import java.util.ArrayList;

public class PaperDriver 
{

	public static void main(String[] args) 
	{
		ArrayList papers = new ArrayList<>();
		
		papers.add(new NewsPaper("Times of India",new double[] {3,3,3,3,5,6}));
		papers.add(new NewsPaper("Hindu",new double[] {2.5,2.5,2.5,2.5,4,4}));
		papers.add(new NewsPaper("Economic Times",new double[] {4,4,4,4,4,10}));
		papers.add(new NewsPaper("Lokmat",new double[] {1.5,1.5,1.5,1.5,1.5,1.5}));
		papers.add(new NewsPaper("Hindustan",new double[] {2,2,2,2,4,4}));
		
		System.out.println(papers);
		
		combination(papers, 40.0);
	}
	/*
	public static void combination(ArrayList a, double budget)
	{
		double price[] =  new double[a.size()];
		for (int i = 0; i < a.size(); i++) {
			NewsPaper n1 = (NewsPaper) a.get(i);
			price[i]=n1.sum;
		}
		
		for (int i = 0; i < price.length; i++) 
		{
			for(int j=i+1; j<price.length;j++)
			{
				if(price[i]+price[j]<=budget) 
				{
					System.out.println(a.get(i)+", "+a.get(j));
				}
			}
		}
	}
	*/
	
	public static void combination(ArrayList a, double budget)
	{
		for (int i = 0; i < a.size(); i++) 
		{
			NewsPaper n1 = (NewsPaper)a.get(i);
			
			for(int j=i+1; j<a.size();j++)
			{
				NewsPaper n2 = (NewsPaper)a.get(j);
				if(n1.sum+n2.sum<=budget)
				{
					System.out.println(a.get(i)+", "+a.get(j));
				}
			}
			
		}
	}
	
	
}
