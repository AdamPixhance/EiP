import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Wie viele Zahlen?");
		int anzahl = sc.nextInt();
		if (anzahl < 0) {
			System.out.println("Ungültig!");
			sc.close();
			return;
		}

		int[] array = new int[anzahl];
		for (int i = 0; i < anzahl; ++i) {
			System.out.println((i + 1) + ". Zahl? ");
			array[i] = sc.nextInt();
		}

		while (true) { // Benutzer nach weiteren Aktionen fragen
			System.out.println("(1) Zahl dazu addieren");
			System.out.println("(2) Ausgaben");
			System.out.println("(3) Summe");
			System.out.println("(4) Durchschnitt");
			System.out.println("(X) Beenden");
			System.out.println("Auswahl?");
			String eingabe = sc.next(); // Auswahl einlesen
			if ("1".equals(eingabe)) {
				System.out.println("Was soll dazu addiert werden?");
				int zahl = sc.nextInt();
				addNumberToAllEntries(array, zahl);
			} else if ("2".equals(eingabe)) {
				printEntries(array);
			} else if ("3".equals(eingabe)) {
				System.out.println("Summe: " + sum(array));
			} else if ("4".equals(eingabe)) {
				System.out.println("Durchschnitt: " + average(array)); // alternativ: String.format("%.2f", durchschnitt(array))
			} else if ("X".equals(eingabe) || "x".equals(eingabe)) {
				break;
			} else {
				System.out.println("Ungültige Eingabe");
			}
			System.out.println("-----");
		}

		sc.close();
	}

	private static void addNumberToAllEntries(int[] array, int zahl) {
		for (int i = 0; i < array.length; ++i) {
			array[i] += zahl;
		}
	}

	public static void printEntries(int[] array) {
		System.out.print("[");
		boolean first = true;
		for (int i : array) {
			if (!first) {
				System.out.print(", ");
			}
			first = false;
			System.out.print(i);
		}
		System.out.println("]");
	}

	public static int sum(int[] a) {
		// TODO#
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

	public static double average(int[] a) {
		// TODO
		double result = ((double)ArrayOperations.sum(a))/a.length;
		return result;
		
	}
}
