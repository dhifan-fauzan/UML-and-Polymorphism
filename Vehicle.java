
public class Vehicle {
	private String model;
	private int year;
	private String color;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String modelName,  String vehicleColor, int year) {
		this.model = modelName;
		this.color = vehicleColor;
		this.year = year;
		
	}
	
	public void setModel( String model) {
		this.model = model;
		
	}
	
	public void setColor( String color) {
		this.color = color;
		
	}
	
	public void setYear( int year) {
		this.year = year;
		
	}
	
    public String getModelName() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getYear() {
        return year;
    }
    public void move() {
    	System.out.println("VROOM VROOM");
    }
    
    public static void honk() {
    	System.out.println("HONK HONK");
    }
}



