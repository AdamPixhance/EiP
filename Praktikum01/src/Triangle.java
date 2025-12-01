import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoehe: ");
		int height = sc.nextInt();

		System.out.println("Breite: ");
		int width = sc.nextInt();
		sc.close();

		System.out.println("Die Flaeche des Dreiecks mit der Hoehe \" " + height + "\" und der Breite \"" + width + "\" ist: " + areaTriangle(width, height));
	}

	public static double areaTriangle(int width, int height) {
		// hier Loesung einfuegen
		double area;
		if (height < 0 || width < 0) {
			area = -1;
		} else {
			area = (0.5 * width * height);
		}
		return area;	
		
	}
}
