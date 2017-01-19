public class Main {

	public static void main(String[] args) {
		// Declaration & Assignment
		Vehicle generic = new Vehicle("Generic 3000", 2017, 1, 24.8);
		Car car = new Car("Mercedes-Benz Super", 2017, 9000.1);
		
		System.out.println(generic.getModel() + " " + generic.getYear() + ": " + generic.getSize() + " units big, " + generic.getMaxSpeed() + "mph top");
		System.out.println(car.getModel() + " " + car.getYear() + ": " + car.getSize() + " units big, " + car.getMaxSpeed() + "mph top");
	}
}