package objectclass;

public class Employee {
	int empid;
	String name;
	double sal;
	String company;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(int empid, String name, double sal, String company)
	{
		super();
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		this.company=company;
	}
	
	public boolean equals(Object v1)
	{
		Employee e = (Employee) v1;
		if (this.empid==e.empid && this.name==e.name && this.company==e.company 
				&& this.sal==e.sal) {
			return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		int hc=0;
		hc+=empid;
		hc+=sal;
		hc+=name.hashCode()+company.hashCode();
		return hc;
	}
}
