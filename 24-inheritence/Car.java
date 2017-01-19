public class Car extends Vehicle {

	/**
	 * Constructor 
	 * @param model the model number of the car
	 * @param year the manufacturing year of the car
	 * @param maxSpeed the maximum speed of the car in mph
	 */
	public Car(String model, int year, double maxSpeed) {
		super(model, year, 2, maxSpeed);
	}

}