
public class Driver {

	/*
	 From Slide 8 we can either remove the static keyword from the function 
	 or change the class to be a dog data type instead of an animal data type 
	 */
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("BMW", "Red", 2016);
		Vehicle car = new Car("Toyota", "Blue", 2021);
		
		System.out.println("Example of dynamic Polymorphism");
		car.move();
		vehicle.move();
		System.out.println();
		
		System.out.println("Example of static Polymorphism");
		car.honk();
		vehicle.honk();
	}
}
