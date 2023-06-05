package array;

public class Person {

	String name;
	int weight;
	
	public Person() 
	{
		// TODO Auto-generated constructor stub
	}
	
	Person(String name, int weight)
	{
		this.name=name;
		this.weight=weight;
	}
	
	public void displayPerson()
	{
		System.out.println("Name: "+name);
		System.out.println("Weight: "+weight);
	}
	
}
