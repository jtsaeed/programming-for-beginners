public class Main {

	public static void main(String[] args) {
		countdown(10);
	}
	
	/**
	 * Countdown from a specified number
	 * @param n number to countdown from
	 */
	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blast off!");
		} else {
			System.out.println(n);
			countdown(n - 1);
		}
	}
}