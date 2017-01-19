public class Main {

	public static void main(String[] args) {
		greeting("World!");
		greeting("Galaxy", "Universe");
	}
	
	/**
	 * Method to greet a particular location
	 * @param place the place to greet
	 */
	public static void greeting(String place) {
		System.out.println("Hello " + place + "!");
	}
	
	/**
	 * Method to greet a particular location from another particular location
	 * @param origin the place to greet from
	 * @param destination the place to greet to
	 */
	public static void greeting(String origin, String destination) {
		System.out.println("Hello " + destination + " from " + origin + "!");
	}
}