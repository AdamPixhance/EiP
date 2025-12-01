import java.util.Scanner;

public class Summieren4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zaehler = 0, summe = 0;

		while (true) {
			zaehler++;
			System.out.println(zaehler + ". ganze Zahl angeben: ");
			int zahl = sc.nextInt(); // Liest nur bis Zahlende ein. 
			summe = summe + zahl;
			System.out.println("Weiter (Ja/Nein)? ");
			if (sc.next().equals("Ja")) {
				break;
			}
		}
		System.out.println("Die Summe der " + zaehler + " Zahlen ist: " + summe);
		sc.close();
	}
}
