public class Main {

	public static void main(String[] args) {
		greetingToEveryone();
	}
	
	/**
	 * Shorthand method that prints Hello World!
	 */
	public static void greetingToWorld() {
		System.out.println("Hello World!");
	}
	
	/**
	 * Shorthand method that prints Hello Universe!
	 */
	public static void greetingToUniverse() {
		System.out.println("Hello Universe!");
	}
	
	/**
	 * Shorthand method that prints Hello World and Universe!
	 */
	public static void greetingToEveryone() {
		greetingToWorld();
		greetingToUniverse();
	}
}