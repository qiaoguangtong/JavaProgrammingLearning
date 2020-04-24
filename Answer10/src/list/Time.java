package list;

public class Time {
	private long hour;
	private long minute;
	private long second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long time) {
		this.hour = time / 1000 / 3600 % 24;
		this.minute = time / 1000 % 60;
		this.second = time / 1000 % 60;
	}

	/** Construct a new object with specified hour, minute, and second */
	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime() {

	}
}
