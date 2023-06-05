package practice2;

public class Shoe {
	private String br="ABC";
	String cr;
	double pc;
	int sz;
	
	public Shoe() {
		// TODO Auto-generated constructor stub
	}
	
	Shoe (String cr, double pc, int sz)
	{
		this.cr=cr;
		this.pc=pc;
		this.sz=sz;
	}
	
	public String getBrand()
	{
		return br;
	}
	
	public void dispSH()
	{
		System.out.println(cr);
		System.out.println(pc);
		System.out.println(sz);
	}
	
}
