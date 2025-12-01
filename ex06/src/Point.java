
public class Point {
	// x and y coordinates
	private double x;
	private double y;

	// Constructor for point
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Getter and Setter for x
	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	// Getter and Setter for y
	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	// Measure distance between 2 points
	public double distanceTo(Point other) {
		double distance = 0;
		// Measuring the distance between the points on the y and x axis
		double SeiteX = Math.abs(x - other.x);
		double SeiteY = Math.abs(y - other.y);

		// Measuring distance with the use of my previous Pythagoras file, from Aufgabe1
		Pythagoras.calculate(SeiteX, SeiteY);
		return distance;
	}

	// Move (Shift) a point on the x and y axis
	public void shift(double xShift, double yShift) {
		x += xShift;
		y += yShift;
	}
}
