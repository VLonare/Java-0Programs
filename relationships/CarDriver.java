package relationships;

public class CarDriver {
 public static void main(String[] args) {
	Car c1=new Car("TATA", "Black", 1500000, 5, "SUV");
	c1.displayCar();
	c1.e1.displayEngine();
	
	Car c2=new Car("TATA", "White", 1000000, 5, "Sedan");
	c2.displayCar();
	c2.e1.displayEngine();
}
}
