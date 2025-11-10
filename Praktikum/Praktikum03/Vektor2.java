import java.util.Arrays;
import java.util.Random;

public class Vektor2 {
	final static int DIMENSIONEN = 5; // static: Klassenvariable (existiert ohne Objekt)

	private int[] komponenten = new int[DIMENSIONEN]; // nicht static: Objektvariable (existiert nur mit einem Vektor2-Objekt)

	/*public Vektor2() { // Konstruktor
		zufallskomp();
	}*/

	// Nicht-funktionale Methode zur Erzeugung von Zufällskomponenten (zwischen 0 und 9)
	public void zufallskomp() { // nicht static: Methode (exisitiert nur mit einem Vektor2-Objekt)
		Random rn = new Random();
		for (int i = 0; i < DIMENSIONEN; i++) {
			komponenten[i] = rn.nextInt(10);
		}
	}

	// Funktionale Methode zur Multiplikation mit einem Vektor2
	// Kann nur auf Vektor2-Objekte angewandt werden. 
	public int mult(Vektor2 vek) { // nicht static: Methode (exisitiert nur mit einem Vektor2-Objekt)
							// int: Typ des Rückgabewertes
		int prod = 0;
		for (int i = 0; i < DIMENSIONEN; i++) {
			prod = prod + (komponenten[i] * vek.komponenten[i]);
		}
		return prod; // Rückgabewert
	}

	public static void main(String[] args) {
		Vektor2 vektorA = new Vektor2();
		System.out.println("Komponenten von vektorA: ");
		//System.out.println("   " + Arrays.toString(vektorA.komponenten));
		vektorA.zufallskomp();
		System.out.println("   " + Arrays.toString(vektorA.komponenten));

		Vektor2 vektorB = new Vektor2();
		System.out.println("Komponenten von vektorB: ");
		// System.out.println("   " + Arrays.toString(vektorB.komponenten));
		vektorB.zufallskomp();
		System.out.println("   " + Arrays.toString(vektorB.komponenten));

		System.out.println("vektorA * vektorB: " + vektorA.mult(vektorB));
		System.out.println("vektorB * vektorA: " + vektorB.mult(vektorA));
	}
}
