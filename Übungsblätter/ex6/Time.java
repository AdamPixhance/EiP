
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
		return (h >= 0 && h <= 23);
	}

	// checking if minutes input is valid
	private boolean validMinutes(int M) {
		return (M >= 0 && M <= 59);
	}

	// checking if seconds input is valid
	private boolean validSeconds(int s) {
		return (s >= 0 && s <= 59);
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

	// the is equal method
	public boolean isEqualTo(Time other) {
		boolean isEqualTo = true;
		if (this.hours != other.hours || this.minutes != other.minutes || this.seconds != other.seconds) {
			return false;
		}
		return isEqualTo;
	}

	// the add method, which adds a give time to the Time object
	public void add(Time other) {
		int tempSeconds = other.seconds;
		int tempMinutes = other.minutes;
		int tempHours = other.hours;
		this.seconds += tempSeconds;
		if (!(validSeconds(this.seconds))) {
			this.seconds = this.seconds % 60;
			tempMinutes++;
		}
		this.minutes += tempMinutes;
		if (!(validMinutes(this.minutes))) {
			this.minutes = this.minutes % 60;
			tempHours++;
		}
		this.hours += tempHours;
		if (!(validHours(this.hours))) {
			this.hours = this.hours % 24;
		}
	}

	// the tick method, which adds one second to the time object
	public void tick() {
		Time tick = new Time(0, 0, 1);
		this.add(tick);
	}

	// the void subtraction methods to help calculate the difference
	private void subtractHours(int otherHours) {
		if (this.hours > otherHours) {
			this.hours = (otherHours + 24) - this.hours;
		} else {
			this.hours = otherHours - this.hours;
		}
	}

	private void subtractMinutes(int otherMinutes) {
		if (this.minutes > otherMinutes) {
			this.minutes = (otherMinutes + 60) - this.minutes;
			this.hours -= 1;
		} else {
			this.minutes = otherMinutes - this.minutes;
		}
	}

	private void subtractSeconds(int otherSeconds) {
		if (this.seconds > otherSeconds) {
			this.seconds = (otherSeconds + 60) - this.seconds;
			this.minutes -= 1;

		} else {
			this.seconds = otherSeconds - this.seconds;
		}
	}

	// the difference between to Time objects
	public Time differenceTo(Time other) {
		Time differenceTime = new Time(this.hours, this.minutes, this.seconds);
		differenceTime.subtractHours(other.hours);
		differenceTime.subtractMinutes(other.minutes);
		differenceTime.subtractSeconds(other.seconds);
		return differenceTime;
	}

	// toString method for testing
	public String toString() {
		return String.format("Time(hours: %d, minutes: %d, seconds: %d)", hours, minutes, seconds);
	}
}
