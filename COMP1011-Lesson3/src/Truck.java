
public class Truck extends Vehicle {
//constructor
	public Truck(int wheels, int doors, String color, String make, String model, String year) {
		super(wheels, doors, color, make, model, year);
		// TODO Auto-generated constructor stub
		
		checkNumDoors();
	}
	
	
//private methods
	private void checkNumDoors(){
		if(this.numDoors < 3){
			this.numDoors = 3;
		}
	}
	
	
	
//overridden methods
	@Override
	public void accelerate(){
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;
		}
	}
	@Override
		public void decelerate(){
			this.speed+=-6;
			if(this.speed <0){
				this.speed = 0;
			}
		}
	
	
	
	
	
	
	
	
}
