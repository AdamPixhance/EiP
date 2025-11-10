import java.util.Scanner;

public class ZaehleTEL {
	public static void countTEL(char[] zeichen) {
		char t = 't';
		int tCounter = 0;
		
		char e = 'e';
		int eCounter = 0;
		
		char l = 'l';
		int lCounter = 0;
		// Start of the zeichen for loop
		for (int i = 0; i < zeichen.length; i++) {
			char x = Character.toLowerCase(zeichen[i]);
			if (x == t || x == e || x == l ) {
				if (x == t) {
					tCounter++;
				} else if (x == e) {
					eCounter++;
				} else {
					lCounter++;
				}
			}
			
		}
		// End of the zeichen for loop
		
		System.out.println("Der Buchstabe \"t\" kommt "+tCounter+" mal vor.");
		System.out.println("Der Buchstabe \"e\" kommt "+eCounter+" mal vor.");
		System.out.println("Der Buchstabe \"l\" kommt "+lCounter+" mal vor.");
		
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zeichenfolge ein: ");
		String eingabe = scanner.nextLine();
		char[] zeichen = eingabe.toCharArray();
		countTEL(zeichen);
		scanner.close();
	}
}
