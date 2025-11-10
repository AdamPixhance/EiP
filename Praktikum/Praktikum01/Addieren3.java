import java.util.Scanner;

public class Addieren3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ganze Zahl angeben: ");
		int zahl1 = sc.nextInt();

		System.out.println("2. ganze Zahl angeben: ");
		int zahl2 = sc.nextInt();
		sc.close();

		int summe = calculateSum(zahl1, zahl2);
		System.out.println("Die Summe dieser Zahlen ist: " + summe);
		if (summe > 2000000) {
			System.out.println("Das ist eine grosse Zahl!");
		}
	}

	public static int calculateSum(int number1, int number2) {
		return number1 + number2;
	}
}
