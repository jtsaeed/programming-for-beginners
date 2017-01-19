public class Main {

	public static void main(String[] args) {
		// Concatenation
		String s1 = "Hello ";
		String s2 = "World!";
		String s3 = s1 + s2;
		
		System.out.println(s3);
		
		// Conversions
		System.out.println(1 + 2 + s3);
		System.out.println(s3 + 1 + 2);
		
		// Internal methods
		s3 = s3.toLowerCase();
		System.out.println(s3);
		s3 = s3.toUpperCase();
		System.out.println(s3);
		s3 = s3.replaceAll("WORLD", "UNIVERSE");
		System.out.println(s3);
		s3 = s3.substring(0, 5);
		System.out.println(s3);
	}
	
}