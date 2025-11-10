import java.util.Scanner;

public class Summieren1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zaehler = 0, summe = 0;

		do {
			zaehler++;
			System.out.println(zaehler + ". ganze Zahl angeben: ");
			int zahl = sc.nextInt(); // Liest nur bis Zahlende ein. 
			summe = summe + zahl;
			System.out.println("Weiter (Ja/Nein)? ");
		} while (sc.next().equals("Ja"));
		System.out.println("Die Summe der " + zaehler + " Zahlen ist: " + summe);
		sc.close();
	}

}
