public class Time {

	// Attributes
	private int hour;
	private int minute;
	private int second;
	
	/**
	 * Constructor
	 * @param hour the hour to set
	 * @param minute the minute to set
	 * @param second the second to set
	 */
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	/**
	 * Alternate Constructor
	 */
	public Time() {
		setHour(0);
		setMinute(0);
		setSecond(0);
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}