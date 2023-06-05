package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PenBox 
{
	public static void main(String[] args) 
	{
		ArrayList<Pen> a1 = new ArrayList<>();
		
		a1.add(new Pen("Reynolds", "Blue", 10));
		a1.add(new Pen("Trimax", "Black", 50));
		a1.add(new Pen("Cello", "Red", 5));
		
		Comparator<Pen> p1 = (o1, o2) ->
		{
			if(o1.price>o2.price)
			{
				return 1;
			}
			
			else if (o1.price<o2.price) 
			{
				return -1;
			}
			
			return 0;
		};
		
		Collections.sort(a1, p1);
		
		System.out.println(a1);
		
		Comparator<Pen> p2 = (obj1, obj2) ->obj1.name.compareTo(obj2.name);
		
		Collections.sort(a1,p2);
		
		System.out.println(a1);
		
	}
}
