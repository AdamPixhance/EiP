import java.util.Scanner;

public class Summieren3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int summe = 0, zahlenzahl;

		System.out.println("Wie viele Zahlen? ");
		zahlenzahl = sc.nextInt();

		if (zahlenzahl >= 1) {
			for (int zaehler = 1; zaehler <= zahlenzahl; zaehler++) {
				System.out.println(zaehler + ". ganze Zahl angeben: ");
				summe = summe + sc.nextInt();
			}

			System.out.println("Die Summe der " + zahlenzahl + " Zahlen ist: " + summe);
		} else
			System.out.println("Inkorrekte Antwort");
		sc.close();
	}

}
