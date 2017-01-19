import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Declaration
		int[] values;
		
		// Assignment
		values = new int[6];
		
		// Declaration & Assignment
		int[] otherValues = {1, 2, 3, 4, 5};
		
		// Accessing elements
		values[0] = 6;
		otherValues[0]++;
		System.out.println(otherValues[0]);
		System.out.println(Arrays.toString(otherValues));
		
		// Enhanced for loop
		for (int number : otherValues) {
			System.out.println(number);
		}
		
		// Size
		System.out.println("Size: " + otherValues.length);
	}
}