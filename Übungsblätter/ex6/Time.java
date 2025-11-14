
public class Time {
	// the private parameters in this class
	private int hours;
	private int minutes;
	private int seconds;

	// Getters and Setters
	public int getHours() {
		return this.hours;
	}

	public void setHours(int h) {
		if (validHours(h)) {
			this.hours = h;
		} else {
			this.hours = 0;
		}
	}

	public int getMinutes() {
		return this.minutes;
	}

	public void setMinutes(int m) {
		if (validMinutes(m)) {
			this.minutes = m;
		} else {
			this.minutes = m;
		}
	}

	public int getSeconds() {
		return this.seconds;
	}

	public void setSeconds(int s) {
		if (validSeconds(s)) {
			this.seconds = s;
		} else {
			this.seconds = 0;
		}
	}

	// empty constructor
	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	// checking if hours input is valid
	private boolean validHours(int h) {
		if (h >= 0 && h <= 23) {
			return true;
		}
		return false;
	}

	// checking if minutes input is valid
	private boolean validMinutes(int M) {
		if (M >= 0 && M <= 59) {
			return true;
		}
		return false;
	}

	// checking if seconds input is valid
	private boolean validSeconds(int s) {
		if (s >= 0 && s <= 23) {
			return true;
		}
		return false;
	}

	// constructor with hours only
	public Time(int h) {
		setHours(h);
		minutes = 0;
		seconds = 0;

	}

	// constructor with hours and minutes
	public Time(int h, int m) {
		setHours(h);
		setMinutes(m);
		seconds = 0;
	}

	// constructor with hours, minutes and seconds
	public Time(int h, int m, int s) {
		setHours(h);
		setMinutes(m);
		setSeconds(s);
	}

	// the clone method
	public Time clone() {
		int h = this.hours;
		int m = this.minutes;
		int s = this.seconds;
		Time cloneTime = new Time(h, m, s);
		return cloneTime;
	}
}
