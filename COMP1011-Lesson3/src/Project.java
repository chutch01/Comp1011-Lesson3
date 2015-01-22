/**
 * 
 */

/**
 * @author chutc_000
 * COMP1011 Lesson 03
 * @version 0.1 - Created Basic Project
 *
 */
public class Project {

	/**
	 * main method for projects
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle myHonda = new Vehicle(4, 4, "black", "Honda", "Pilot", "2015");
		Truck myFord = new Truck(6, 3, "white", "ford", "F150", "2008");
		for(int seconds=0; seconds < 10; seconds++){
			myHonda.accelerate();
			myFord.accelerate();
			
			System.out.println("Vehicle Honda Speed: " + myHonda.getSpeed());
			System.out.println("Vehicle Ford Speed: " + myFord.getSpeed());
		
		}
		

	}

}
