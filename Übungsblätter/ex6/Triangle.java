
public class Triangle {
	// defining the private parameters of a triangle using the previously defined
	// Point Class
	private Point a;
	private Point b;
	private Point c;

	// default constructor
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Getters and Setters for a
	public Point getA() {
		return a;
	}

	public void setA(double x, double y) {
		// using the predefined setters from the Point class to define the x and y
		a.setX(x);
		a.setY(y);
	}

	// Getters and setters for b
	public Point getB() {
		return b;
	}

	public void setB(double x, double y) {
		// using the predefined setters from the Point class to define the x and y
		b.setX(x);
		b.setY(y);
	}

	// Getters and setters for c
	public Point getC() {
		return c;
	}

	public void setC(double x, double y) {
		// using the predefined setters from the Point class to define the x and y
		c.setX(x);
		c.setY(y);
	}

	// Method for side measurement
	private double sideMeasure(Point a, Point b) {
		return a.distanceTo(b);
	}

	// Method for creating a triangle array with all 3 sides
	private double[] sidesArray() {
		double[] sidesArray = new double[3];
		sidesArray[0] = sideMeasure(a, b);
		sidesArray[1] = sideMeasure(a, c);
		sidesArray[2] = sideMeasure(b, c);
		return sidesArray;
	}

	// method to measure the relations between a,b,c in a triangle
	private double[] ABandCRelations(Point x) {
		double[] sidesArray = sidesArray();
		double localAB = 0;
		double localAC = 0;
		double localBC = 0;
		// sets up our local sides for our formula
		// checks which angle/point is being observed
		// and sets up the AB and AC sides as the adjacent sides
		// and sets up the BC as the opposite side
		if (x == a) {
			localAB = sidesArray[0];
			localAC = sidesArray[1];
			localBC = sidesArray[2];
		} else if (x == b) {
			localAB = sidesArray[0];
			localAC = sidesArray[2];
			localBC = sidesArray[1];
		} else if (x == c) {
			localAB = sidesArray[1];
			localAC = sidesArray[2];
			localBC = sidesArray[0];
		} else {
			// for the case where the point is not within the defined triangle
			System.out.println("The point does not exist in the current triangle");
		}
		// setting up a double[] Array ABandC for the relations between the sides a, b
		// and c
		double[] ABandC = new double[2];
		ABandC[0] = (localAB * localAB) + (localAC * localAC);
		ABandC[1] = localBC * localBC;

		return ABandC;
	}

	// Method for checking if an Angle is right
	private boolean isRightAngle(Point x) {
		return ABandCRelations(x)[0] == ABandCRelations(x)[1];
	}

	// Method for checking if an Angle is greater than 90%
	private boolean greaterThanRight(Point x) {
		return ABandCRelations(x)[0] < ABandCRelations(x)[1];
	}

	// Method for checking if an Angle is less than 90%
	private boolean lessThanRight(Point x) {
		return ABandCRelations(x)[0] > ABandCRelations(x)[1];
	}

	// starting with measuring the Task wanted elements from here on

	// Measuring boolean isEquilateral
	public boolean isEquilateral() {
		boolean isEquilateral = false;
		double sidesArray[] = sidesArray();
		if (sidesArray[0] == sidesArray[1] && sidesArray[0] == sidesArray[2]) {
			return true;
		}
		return isEquilateral;
	}

	// Measuring boolean isIsosceles
	public boolean isIsosceles() {
		boolean isEquilateral = false;
		double sidesArray[] = sidesArray();
		for (int i = 0; i < 2; i++) {
			for (int x = i + 1; x < 3; x++) {
				if (sidesArray[i] == sidesArray[x]) {
					return true;
				}
			}
		}
		return isEquilateral;
	}

	// Measuring boolean isAcute
	public boolean isAcute() {
		boolean isAcute = false;
		if (lessThanRight(a) && lessThanRight(b) && lessThanRight(c)) {
			return true;
		}
		return isAcute;
	}

	// Measuring boolean isRight
	public boolean isRight() {
		boolean isRight = false;
		if (isRightAngle(a) || isRightAngle(b) || isRightAngle(c)) {
			return true;
		}
		return isRight;
	}

	// Measuring boolean isObtuse
	public boolean isObtuse() {
		boolean isObtuse = false;
		if (greaterThanRight(a) || greaterThanRight(b) || greaterThanRight(c)) {
			return true;
		}
		return isObtuse;
	}

}
