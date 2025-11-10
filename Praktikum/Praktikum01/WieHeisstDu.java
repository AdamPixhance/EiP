import java.util.Scanner;

class WieHeisstDu {
	public static void main(String[] args) {
		Scanner terminalScanner = new Scanner(System.in);

		System.out.println("Wie heisst du?");

		String userName = terminalScanner.nextLine();
		System.out.println("Hallo " + userName + "!");
	}
}
