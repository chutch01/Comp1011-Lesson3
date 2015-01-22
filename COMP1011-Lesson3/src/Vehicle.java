/**
 * 
 */

/**
 * @author chutc_000
 * Class Description: making a vehicle class, use as the super class for all other vehicles
 * @version: 0.1
 *
 */
//private variables
public class Vehicle {
	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String color = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
//public variables
	
	
//constructors	
public Vehicle(int wheels, int doors, String color, String make, String model, String year){
	this.numWheels = wheels;
	this.numDoors = doors;
	this.color = color;
	this.make = make;
	this.model = model;
	this.year = year;
	
}

public Vehicle(String color, String make, String model, String year){
	this.color = color;
	this.make = make;
	this.model = model;
	this.year = year;
	
}
//public methods 
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @return the year
	 */
	public float getSpeed() {
		return this.speed;
	}

	
	public void accelerate() {
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;
		}
		
	}
	
	public void decelerate(){
		this.speed+=-6;
		if(this.speed <0){
			this.speed = 0;
		}
	}
	public void turnLeft(){
		System.out.println("Turning Left");
		
	}
	public void turnRight(){
		
	}

}
