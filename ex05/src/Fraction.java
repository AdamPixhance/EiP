
public class Fraction {
	// Here i define the attributes that are needed for a Fraction.
	private int numerator;
	private int  denominator;
	
	// 1st constructor, which simply takes an int, and turns it into a fraction.
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
	}
	
	// 2nd constructor, which takes 2 numbers needed to create a fraction.
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
			this.denominator = 1;
		} else {
			this.denominator = denominator;
		}
	}
	
	// method "add" to add 2 fractions together
	public void add(Fraction summand) {
		this.numerator = (this.numerator * summand.denominator) + (summand.numerator * this.denominator);
		this.denominator = this.denominator * summand.denominator;
	}
	
	// method "asDouble", which returns the value of the fraction as a double, by dividing the numerator with the denominator.
	public double asDouble() {
		double asDouble = 0;
		asDouble = (double)numerator / (double)denominator;
		return asDouble;
	}
	
	// method "multiply" which multiplies a fraction with another, and sets this.fraction's value to the result.
	public void multiply(Fraction factor) {
		numerator = numerator * factor.numerator;
		denominator = denominator * factor.denominator;
	}
	
	// method "toString" which overwrites the default "toString" method to specifically work for our custom class and returns a x/y fraction as a string.
	public String toString() {
		return (numerator + "/" + denominator);
	}
}
