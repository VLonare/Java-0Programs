package array;

public class PersonDriver {

	public static void main(String[] args) 
	{
		Person p1[] = new Person[6];
		
		p1[0] = new Person("Raju", 57);
		p1[1] = new Person("Vinod", 78);
		p1[2] = new Person("Kapil", 40);
		p1[3] = new Person("Vikas", 64);
		p1[4] = new Person("Mahesh", 55);
		p1[5] = new Person("Sunny", 59);
		
		Person sortedAns[] = sortPerson(p1);
		
		for (int i = 0; i < sortedAns.length; i++) 
		{
			sortedAns[i].displayPerson();
		}
	}
	
	public static Person[] sortPerson(Person p[])
	{
		for (int i = 0; i < p.length-1; i++) 
		{
			for (int j = 0; j < p.length-1-i; j++) 
			{
				if (p[j].weight>p[j+1].weight) 
				{
					Person temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp;
				}
			}
		}
		return p;
	}
}
