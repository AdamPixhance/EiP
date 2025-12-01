import java.util.Scanner;

public class Addieren2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ganze Zahl angeben: ");
		int zahl1 = sc.nextInt();

		System.out.println("2. ganze Zahl angeben: ");
		int zahl2 = sc.nextInt();
		sc.close();

		int summe = zahl1 + zahl2;
		System.out.println("Die Summe dieser Zahlen ist: " + summe);
	}
}
