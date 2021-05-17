
public class Car extends Vehicle{


	public Car() {
		
	}
	
	public Car(String model, String color, int year) {
		super(model, color, year);
	}
	
	public void move() {
		
		System.out.println("SKRT SKRT");
		
	}
	
	public static void honk() {
		
		System.out.println("BEEP BEEP");
		
	}
}
