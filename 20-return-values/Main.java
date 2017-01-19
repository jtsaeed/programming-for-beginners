public class Main {

	public static void main(String[] args) {
		System.out.println(isDistanceBig(calculateDistance(6, 10)));
	}
	
	/**
	 * Calculates the distance between two points
	 * @param x position of the first point
	 * @param y position of the second point
	 * @return the distance
	 */
	public static int calculateDistance(int x, int y) {
		return Math.abs(x - y);
	}
	
	/**
	 * Determines whether or not a distance is big
	 * @param distance the distance in question
	 * @return if the distance is big
	 */
	public static boolean isDistanceBig(int distance) {
		return distance > 5;
	}
}