package inheritance;

public class FruitDriver2 {
	public static void main(String[] args) {
	 Fruit f1 = new Hapus("Mango", "sadsa", 15, "sd", "dsgfh", "dsjhg", "hdgsyfg", 89, "sdhfjs");
	 f1.dispFruit();
	 Hapus h1= (Hapus) f1;
	 
	 System.out.println("----------------------------------------");
	 
	 h1.dispFruit();
	 h1.dispHapus();
	 h1.dispMango();
	}
}
