
public class Pythagoras {

	public static void main(String[] args) {
		// Example test with the inputs of a = 3, and b = 4
		System.out.println(calculate(3, 4));

	}

	// calculate method, to calculate the value of c, for a triangle with the sides
	// a AND b
	public static double calculate(double a, double b) {
		// for clarity, created 2 separate doubles for c. 1 for the actual value of c,
		// and another for cSquare.
		double c = 0;
		// measure C Square using Pythagoras
		double cSqaure = (a * a) + (b * b);
		// measures the square Root of cSquare, to get us back the value of c
		c = Math.sqrt(cSqaure);
		return c;
	}

}
