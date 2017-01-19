import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Taking input
		System.out.println("What's your name");
		String name = scanner.nextLine();
		System.out.println("Nice to meet you " + name + "!");
	}
	
}