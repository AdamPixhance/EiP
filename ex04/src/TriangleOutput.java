import java.util.Scanner; /* notwendig, damit der Scanner funktioniert */

public class TriangleOutput {
	static void drawTriangle(int sizeOfTriangle) {
		// Bitte hier Loesung einfuegen.
		for (int i = 1; i <= sizeOfTriangle; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); /* oeffnet die Konsole */
		System.out.println("Bitte geben Sie die Hoehe des Dreiecks ein: ");
		int triangleSize = scanner.nextInt(); /* liest einen Integer von der Konsole */
		drawTriangle(triangleSize);
		scanner.close(); /* schliesst die Konsole */
	}
}