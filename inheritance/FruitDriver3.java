package inheritance;

public class FruitDriver3 {
	public static void main(String[] args) {
		Hapus h1=new Hapus("Mango", "Yellow", 300, "Mango Shape", "Sweet", "Summer", "Kokan",1000.00, "Export");
		//h1.dispHapus();
		
		Fruit f1= h1;
		f1.dispFruit();
		
		System.out.println();
		//f1.dispMango(); ->Unresolved compilation problem
		
		Mango m1= (Mango) f1;
		m1.dispFruit();
		
		System.out.println();
		
		m1.dispMango();
		
		System.out.println();
		//m1.dispHapus(); ->Unresolved compilation problem
		
		Hapus h2= (Hapus) m1;
		
		h2.dispFruit();
		System.out.println();
		h2.dispHapus();
		System.out.println();
		h2.dispMango();
		System.out.println();
		
		Mango m2 =h1;
		m2.dispFruit();
		System.out.println();
		m2.dispMango();
		System.out.println();
		
		//m2.dispHapus(); ->Unresolved compilation problem
		
		Hapus h3=(Hapus) m2;
		h3.dispFruit();
		System.out.println();
		h3.dispMango();
		System.out.println();
		h3.dispHapus();
		
		
	}
}
