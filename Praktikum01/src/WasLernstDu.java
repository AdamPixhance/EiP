import java.util.Scanner;

class WasLernstDu {
	public static void main(String[] args) {
		Scanner terminalScanner = new Scanner(System.in);

		System.out.println("Was lernst du?");
		String learned = terminalScanner.nextLine();
		if (learned.equalsIgnoreCase("Java")) {
			System.out.println("Es ist gut Java zu lernen!");
		} else {
			System.out.println("Es ist gut " + learned + " zu lernen, aber vergiss nicht auch Java zu lernen!");
		}
		terminalScanner.close();
	}
}
