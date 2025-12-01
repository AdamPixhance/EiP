public class Addieren1 {
	public static void main(String[] args) {
		long zahl1 = 100;

		long zahl2 = 200;

		// Wertebereich Integer: -2147483648...2147483647

		long summe = zahl1 + zahl2;
		System.out.println("Die Summe dieser Zahlen ist: " + summe);
		if (summe > 10000000) {
			System.out.println("Wow, die Zahl ist aber groß");
		} else if (summe < 0) {
				System.out.println("Das ist bellow Average");
		} else {
					System.out.println("Das ist Average");
				}
	}
}
