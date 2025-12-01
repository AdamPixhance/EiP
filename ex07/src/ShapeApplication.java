import java.util.Scanner;

public class ShapeApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape[] shapes = new Shape[10];

		System.out.println("Bitte geben Sie eine geometrische Form ein. Zur Auswahl stehen:\nDreieck\nQuadrat\nLinie\n\nZum Beenden des Programmes geben Sie \"Ende\" ein.");
		for(int i=0;i<shapes.length;i++) {
			String chosen = (scanner.nextLine().toLowerCase());
			if (chosen.equals("end")|| chosen.equals("ende")) {
				break;
			}
			if (chosen.equals("triangle")|| chosen.equals("dreieck")) {
				shapes[i] = new Triangle();
				continue;
			}
			if (chosen.equals("square")|| chosen.equals("quadrat")) {
				shapes[i] = new Square();
				continue;
			}
			if (chosen.equals("line")|| chosen.equals("linie")) {
				shapes[i] = new Line();
				continue;
			}
		}
		scanner.close();
		
		for(int i=0;i<shapes.length;i++) {
			if (shapes[i] != null) {
				shapes[i].printShape();
				System.out.println();
			}
		}
	}
}
