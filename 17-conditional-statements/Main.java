public class Main {

	public static void main(String[] args) {
		int a = 7;
		int b = 6;
		boolean isABiggerThanB = a > b;
		
		// Chain of if statements
		if (a > b) {
			System.out.println("A is bigger than B!");
		} else if (a == b) {
			System.out.println("They are equal");
		} else {
			System.out.println("B is bigger than A!");
		}
		
		// Without braces
		if (isABiggerThanB) System.out.println("A is bigger than B!");
	}
}