import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		// Declaration
		Point point;
		
		// Assignment
		point = new Point(3, 4);
		
		// Changing attributes
		point.setLocation(5, point.getY());
		System.out.println("X: " + point.getX() + ", Y: " + point.getY());
	}
}