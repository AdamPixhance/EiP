import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		guess(100000);
	}

	public static boolean isBigger(int m, Scanner sc) {
		System.out.println("Ist die gedachte Zahl groesser als " + m + "?");
		String yesNoInput = sc.nextLine();
		while (!yesNoInput.equalsIgnoreCase("ja") && !yesNoInput.equalsIgnoreCase("nein")) {
			System.out.println("Deine eingabe war nicht gültig! Bitte geben Sie \"ja\" oder \"nein\" ein.");
			System.out.println("Ist die gedachte Zahl groesser als " + m + "?");
			yesNoInput = (sc.nextLine().toLowerCase()).strip();
		}
		return yesNoInput.equalsIgnoreCase("ja");
	}

	public static void guess(int maxNumber) {
		Scanner sc = new Scanner(System.in);
		int u = 0;
		int o = maxNumber;
		while (u < o) {
			int m = (u + o) / 2;
			if (isBigger(m, sc)) {
				u = m + 1;
			} else {
				o = m;
			}
		}
		System.out.println("Die gedachte Zahl ist: " + u);
		sc.close();
	}

}
