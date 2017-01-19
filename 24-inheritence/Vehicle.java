public class Vehicle {

	// Attributes
	protected final String model;
	protected final int year;
	protected final int size;
	protected final double maxSpeed;
	
	/**
	 * Constructor
	 * @param model the model number of the vehicle
	 * @param year the manufacturing year of the vehicle
	 * @param size the size of the vehicle
	 * @param maxSpeed the maximum speed of the vehicle in mph
	 */
	public Vehicle(String model, int year, int size, double maxSpeed) {
		this.model = model;
		this.year = year;
		this.size = size;
		this.maxSpeed = maxSpeed;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getSize() {
		return size;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
}