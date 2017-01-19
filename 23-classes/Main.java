public class Main {

	public static void main(String[] args) {
		// Declaration & Assignment
		Time time1 = new Time(9, 45, 0);
		Time time2 = new Time();
		
		// Changing attributes
		time1.setHour(time1.getHour() + 1);
		time2.setMinute(30);
		
		System.out.println("Time 1 - " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		System.out.println("Time 2 - " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}
}