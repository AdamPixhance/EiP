import java.util.Scanner;

public class Summieren2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zaehler = 0, summe = 0;
		boolean weiter;

		do {
			zaehler++;
			System.out.println(zaehler + ". ganze Zahl angeben: ");
			summe = summe + sc.nextInt();
			System.out.println("Weiter (Ja/Nein)? ");
			weiter = sc.next().equals("Ja");
		} while (weiter);
		System.out.println("Die Summe der " + zaehler + " Zahlen ist: " + summe);
		sc.close();
	}

}
