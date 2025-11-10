
public class SquareApplication {

	public static void main(String[] args) {
		Quadrat mainSquare = new Quadrat(3, "black", "white");

		System.out.println("Die Seitenlänge vom Quadrat = " + mainSquare.getSeitenlaenge());
		System.out.println("Die Linienfarbe vom Quadrat ist: " + mainSquare.getLinienfarbe());
		System.out.println("Die Füllfarbe vom Quadrat ist: " + mainSquare.getFuellfarbe());

		System.out.println("Die Fläche = " + mainSquare.Flaecheninhalt());
	}

}
