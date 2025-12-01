
public class SquareApplication {

	public static void main(String[] args) {
		// creates a new Quadrat called "mainSquare"
		Quadrat mainSquare = new Quadrat(3, "black", "white");

		// tests out all my getters with System.out.print
		System.out.println("Die Seitenlänge vom Quadrat = " + mainSquare.getSeitenlaenge());
		System.out.println("Die Linienfarbe vom Quadrat ist: " + mainSquare.getLinienfarbe());
		System.out.println("Die Füllfarbe vom Quadrat ist: " + mainSquare.getFuellfarbe());

		// tests the "Flaecheninhalt" method
		System.out.println("Die Fläche = " + mainSquare.Flaecheninhalt());
	}

}
