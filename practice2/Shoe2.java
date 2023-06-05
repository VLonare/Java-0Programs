package practice2;

public class Shoe2 extends Shoe {
	String mat;
	
	public Shoe2() {
		// TODO Auto-generated constructor stub
	}
	
	Shoe2(String cr, double pc, int sz, String mat)
	{
		super(cr, pc, sz);
		this.mat=mat;
	}
	
	public void dispSH2()
	{
		super.dispSH();
		System.out.println(mat);
	}
}
