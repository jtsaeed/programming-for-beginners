public class Main {

	public static void main(String[] args) {
		countdown(5);
		differentCountdown(5);
	}
	
	/**
	 * While loop for a countdown from a specified number
	 * @param n number to countdown from
	 */
	public static void countdown(int n) {
		if (n > 0) {
			System.out.println(n);
			n--;
		}

		System.out.println("Blastoff!");
	}
	
	/**
	 * Do-While loop for a countdown from a specified number
	 * @param n number to countdown from
	 */
	public static void differentCountdown(int n) {
		do {
			System.out.println(n);
			n--;
		} while (n > 0);
		
		System.out.println("Blastoff!");
	}
	
	public static void anotherDifferentCountdown(int n) {
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("Blastoff!");
	}
}