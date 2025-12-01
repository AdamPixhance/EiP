import java.util.Arrays;
import java.util.Random;

public class Vektor1 {
	final static int DIMENSIONEN = 5; // static: Klassenvariable (existiert ohne Objekt) 

	// Nicht-Funktionale Methode (reine Prozedur) zur Erzeugung von Zufallszahlen für die Komponenten (zwischen 0 und 9)
	public static void initVektor(int[] vek) { // static: Klassenmethode (existiert ohne Objekt) 
		Random rn = new Random(); // Zufallszahlengenerator
		for (int i = 0; i < vek.length; i++) {
			vek[i] = rn.nextInt(10); // Zufällige Zahl zwischen 0 und 9
		}
	}

	// Funktionale Prozedur zur Multiplikation von zwei Vektoren
	// Kann auf alle Variablen vom Typ int[DIMENSION] angewandt werden. 
	public static int scalarProdukt(int[] vek1, int[] vek2) { // int: Typ des Rückgabewertes
		int product = 0;
		for (int i = 0; i < DIMENSIONEN; i++) {
			product = product + (vek1[i] * vek2[i]);
		}
		return product; // Rückgabewert
	}

	public static void main(String[] args) {
		int[] vektor1 = new int[DIMENSIONEN];
		int[] vektor2 = new int[DIMENSIONEN];

		System.out.println("1. Vektor: ");
		initVektor(vektor1); // Füllen des Arrays in vektor1 mit Zufallswerten
		System.out.println("   " + Arrays.toString(vektor1));

		System.out.println("2. Vektor:");
		initVektor(vektor2); // Füllen des Arrays in vektor2 mit Zufallswerten
		System.out.println("   " + Arrays.toString(vektor2));

		System.out.println("Scalarprodukt der beiden Vektoren: " + scalarProdukt(vektor1, vektor2));
	}
}
