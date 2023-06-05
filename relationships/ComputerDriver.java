package relationships;

public class ComputerDriver {
	public static void main(String[] args) {
		Computer c1 = new Computer("ASUS", 80000.00, "Windows", 8, 1000, "Black");
		c1.displayComputer();
		c1.insertPendrive("Kingston", 64, 650.00,"Metal" , "USB 3.2");
		c1.p1.displayPendrive();
	}

}
